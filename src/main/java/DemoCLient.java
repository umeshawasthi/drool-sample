import com.drool.test.Applicant;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * Created by umesh on 12/15/16.
 */
public class DemoCLient {

    public static void main(String[] args) throws IntrospectionException {

        BeanInfo beanInfo = Introspector.getBeanInfo(Applicant.class,Object.class);
        for(PropertyDescriptor pd: beanInfo.getPropertyDescriptors()){
            System.out.println(pd.getName());
           // System.out.println(pd.getShortDescription());
        }
    }
}
