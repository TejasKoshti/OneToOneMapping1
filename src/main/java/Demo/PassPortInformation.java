package Demo;


import javax.persistence.*;

@Entity
@Table(name = "passportInformation")
public class PassPortInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passportIdGenerator")
    @SequenceGenerator(name= "passportGenerator", initialValue = 50000, allocationSize = 1000)     //passport id me 50000 se start karunga

    @Column (name ="passportId")
    private int passportId;

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public long getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(long passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Column (name= "passportNumber")
    private long passportNumber;

    @Column (name= "county")
    private String county;


}
