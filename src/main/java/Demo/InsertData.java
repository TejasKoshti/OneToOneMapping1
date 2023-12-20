package Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InsertData {
    public static void main(String[] args) {

        SessionFactory factory=SessionFactoryHelper.getSessionFactory();
        Session session=factory.openSession();

        PassPortInformation passPortInformation=new PassPortInformation();
        passPortInformation.setPassportNumber(123456789);
        passPortInformation.setCounty("INDIA");

        PersonInformation personInformation=new PersonInformation();
        personInformation.setPersonFirstName("TEJAS");
        personInformation.setPersonLastName("KOSHTI");
        personInformation.setPersonAge(23);
        personInformation.setPersonSalary(2542255.22);
        personInformation.setPassportRef(passPortInformation);

        Transaction tx=session.beginTransaction();
        session.save(personInformation);
        tx.commit();
        session.close();
        System.out.println("DATA ADD Succesully");

    }
}
