package com.drool.test.balance;

import org.drools.compiler.lang.DrlDumper;
import org.drools.compiler.lang.api.DescrFactory;
import org.drools.compiler.lang.descr.PackageDescr;
import org.drools.core.event.DefaultAgendaEventListener;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;
import org.kie.api.runtime.conf.TimedRuleExectionOption;
import org.kie.api.runtime.rule.Agenda;
import org.kie.api.runtime.rule.FactHandle;

import java.text.SimpleDateFormat;
import java.util.Date;




/**
 * Created by umesh on 11/1/16.
 */

public class MainClass {

    public static void main1(String[] args) throws Exception {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();

        KieSessionConfiguration ksconf = KieServices.Factory.get().newKieSessionConfiguration();
        ksconf.setOption( TimedRuleExectionOption.YES );

        KieBase kieBase= kieContainer.getKieBase();
        KieSession ksession = kieBase.newKieSession(ksconf,null);
        ksession.addEventListener(new DefaultAgendaEventListener());

      // KieBase kiebase= ksession.getKieBase();


       // StatelessKieSession statelessKieSessionksession = kieContainer.newStatelessKieSession()
        //statelessKieSessionksession.execute(CommandFactory.newInsert(new String("Umesh")))

        AccountPeriod acp = new AccountPeriod(date( "2013-01-01"), date( "2013-03-31"));
        Account ac = new Account(1, 0);
        CashFlow cf1 = new CashFlow(date( "2013-01-12"), 100, CashFlowType.CREDIT, 1 );
        CashFlow cf2 = new CashFlow(date( "2013-02-2"), 200, CashFlowType.DEBIT, 1 );
        CashFlow cf3 = new CashFlow(date( "2013-05-18"), 50, CashFlowType.CREDIT, 1 );
        CashFlow cf4 = new CashFlow(date( "2013-03-07"), 75, CashFlowType.CREDIT, 1 );

        FactHandle fh = ksession.insert( acp );


        ksession.insert( ac );
        ksession.insert( cf1 );
        ksession.insert( cf2 );
        ksession.insert( cf3 );
        ksession.insert( cf4 );

        Agenda agenda =ksession.getAgenda();

        agenda.getActivationGroup("print");
        ksession.fireAllRules();
        agenda.getActivationGroup("operation");

        ksession.fireAllRules();

        PackageDescr pkg = DescrFactory.newPackage()
                .name("org.drools.example")
                .newRule().name("Xyz")
                .attribute("ruleflow-grou", "bla")
                .lhs()
                .and()
                .pattern("Foo").id("$foo", false).constraint("bar==baz").constraint("x>y").end()
                .not().pattern("Bar").constraint("a+b==c").end().end()
                .end()
                .end()
                .rhs("System.out.println();").end()
                .getDescr();
        DrlDumper dumper=new DrlDumper();
        String drl=dumper.dump(pkg);
        System.out.print(drl);


    }

    public static Date date(String str) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        return sdf.parse( str );
    }

}
