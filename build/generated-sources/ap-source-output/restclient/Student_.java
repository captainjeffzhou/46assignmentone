package restclient;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import restclient.Friendship;
import restclient.Location;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-31T23:44:58")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, Integer> dateofbirth;
    public static volatile SingularAttribute<Student, String> favouritesport;
    public static volatile SingularAttribute<Student, String> firstname;
    public static volatile SingularAttribute<Student, Integer> subscriptiondate;
    public static volatile SingularAttribute<Student, String> address;
    public static volatile SingularAttribute<Student, String> gender;
    public static volatile SingularAttribute<Student, String> nativelanguage;
    public static volatile SingularAttribute<Student, String> monashemail;
    public static volatile SingularAttribute<Student, String> studymode;
    public static volatile SingularAttribute<Student, Integer> sid;
    public static volatile SingularAttribute<Student, String> lastname;
    public static volatile SingularAttribute<Student, String> favouritemovie;
    public static volatile SingularAttribute<Student, String> password;
    public static volatile SingularAttribute<Student, String> currentjob;
    public static volatile SingularAttribute<Student, String> nationality;
    public static volatile SingularAttribute<Student, String> favouriteunit;
    public static volatile SingularAttribute<Student, String> course;
    public static volatile SingularAttribute<Student, String> suburb;
    public static volatile CollectionAttribute<Student, Location> locationCollection;
    public static volatile CollectionAttribute<Student, Friendship> friendshipCollection;

}