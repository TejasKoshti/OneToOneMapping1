package Demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryHelper {

    static SessionFactory getSessionFactory(){
        Configuration cfg=new Configuration().configure();
        cfg.addAnnotatedClass(PersonInformation.class);
        cfg.addAnnotatedClass(PassPortInformation.class);
        SessionFactory sessionFactory= cfg.buildSessionFactory();
        return sessionFactory;
    }
}