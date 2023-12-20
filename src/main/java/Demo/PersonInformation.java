package Demo;


import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name = "personInformation")
public class PersonInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "personId")
    private int personId;

    @Column(name = "personFirstName")
    private String personFirstName;

    @Column(name = "personLastName")
    private  String personLastName;

    @Column(name ="personAge")
    private int personAge;

    @Column(name ="personSalary")
    private double personSalary;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public double getPersonSalary() {
        return personSalary;
    }

    public void setPersonSalary(double personSalary) {
        this.personSalary = personSalary;
    }

    public PassPortInformation getPassportRef() {
        return passportRef;
    }

    public void setPassportRef(PassPortInformation passportRef) {
        this.passportRef = passportRef;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passportRef")
    private PassPortInformation passportRef;

}
