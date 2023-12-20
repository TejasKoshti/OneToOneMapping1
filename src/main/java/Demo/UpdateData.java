package Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateData {

    public static void main(String[] args) {
        SessionFactory sessionFactory= SessionFactoryHelper.getSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction tx= session.beginTransaction();

        PersonInformation p1=session.load(PersonInformation.class,1);
        p1.getPassportRef().setCounty("UAE");


        session.update(p1);                                     //update
        tx.commit();
        session.close();

    }
}
