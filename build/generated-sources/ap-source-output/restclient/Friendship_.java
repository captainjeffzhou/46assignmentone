package restclient;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import restclient.Student;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-31T23:44:58")
@StaticMetamodel(Friendship.class)
public class Friendship_ { 

    public static volatile SingularAttribute<Friendship, Integer> friendshipid;
    public static volatile SingularAttribute<Friendship, Integer> enddate;
    public static volatile SingularAttribute<Friendship, Integer> friendid;
    public static volatile SingularAttribute<Friendship, Integer> startdate;
    public static volatile SingularAttribute<Friendship, Student> sid;

}