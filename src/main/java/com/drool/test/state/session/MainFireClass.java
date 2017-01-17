package com.drool.test.state.session;

import org.drools.core.base.RuleNameEndsWithAgendaFilter;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.kie.api.runtime.rule.FactHandle;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by umesh on 12/12/16.
 */
public class MainFireClass {

    public static void main(String[] args) {

        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();

        KieSession kieSession=kieContainer.newKieSession();

        StatelessKieSession kieSession1=kieContainer.newStatelessKieSession();



        String[] names = new String[]{"kitchen", "bedroom", "office", "livingroom"};
        Map<String,Room> name2room = new HashMap<String,Room>();

        for(String name : names){
            Room room = new Room( name );
            name2room.put( name, room );
            kieSession.insert( room );

            Sprinkler sprinkler = new Sprinkler(room);

            kieSession.insert(sprinkler);
         }
        kieSession.insert(new BestPrice(100,10));
        kieSession.insert(new BestPrice(100,5));
        kieSession.insert(new BestPrice(100,12.5));
        kieSession.insert(new BestPrice(100,12.9));
        kieSession.fireAllRules(new RuleNameEndsWithAgendaFilter("sure"));

        Fire kitechFire= new Fire(name2room.get("kitchen"));
        Fire officeFire= new Fire(name2room.get("office"));
        FactHandle kitchenFireHandle= kieSession.insert(kitechFire);
        FactHandle officeFireHandler=kieSession.insert(officeFire);

        //kieSession.fireAllRules();
        Collections.emptyIterator();
        kieSession.delete(kitchenFireHandle);
        kieSession.delete(officeFireHandler);

        kieSession.fireAllRules(new RuleNameEndsWithAgendaFilter("sure"));

    }
}
