package Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class DisplayData {

    public static void main(String[] args) {

        SessionFactory sessionFactory= SessionFactoryHelper.getSessionFactory();
        Session session= sessionFactory.openSession();

        PersonInformation p1=session.load(PersonInformation.class,1);

        System.out.println(p1.getPersonFirstName());
        System.out.println(p1.getPassportRef().getPassportNumber());

        session.close();
    }
}
