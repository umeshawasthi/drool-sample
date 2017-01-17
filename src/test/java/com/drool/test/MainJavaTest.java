package com.drool.test;

import junit.framework.TestCase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

import java.util.Arrays;

/**
 * Created by umesh on 10/19/16.
 */
public class MainJavaTest extends TestCase {

    public  void testRUle(){
        KieServices ki= KieServices.Factory.get();
        KieContainer kieContainer=ki.getKieClasspathContainer();

        StatelessKieSession statelessKieSession=kieContainer.newStatelessKieSession();

        Applicant applicant=new Applicant("Umesh",14);
        Arrays.asList();
        Application application = new Application();
        statelessKieSession.execute(applicant);
        System.out.println("************");
        //application.setValid(true);

      /*  KieCommands kieCommands =ki.getCommands();
        List<Command> cmds = new ArrayList<Command>();
        cmds.add(kieCommands.newInsert(applicant));
        cmds.add(kieCommands.newInsert(application));

        ExecutionResultImpl executionResult= (ExecutionResultImpl) statelessKieSession.execute(kieCommands.newBatchExecution(cmds));

        System.out.println(executionResult.getFactHandles());*/
    }
}
