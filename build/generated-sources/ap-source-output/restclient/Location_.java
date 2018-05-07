package restclient;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import restclient.Student;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-31T23:44:58")
@StaticMetamodel(Location.class)
public class Location_ { 

    public static volatile SingularAttribute<Location, String> locationname;
    public static volatile SingularAttribute<Location, Integer> datetime;
    public static volatile SingularAttribute<Location, Integer> locationid;
    public static volatile SingularAttribute<Location, Double> latitude;
    public static volatile SingularAttribute<Location, Double> longitude;
    public static volatile SingularAttribute<Location, Student> sid;

}