package hrms.project.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidates")
public class Candidates {

    @Id
    @GeneratedValue
    private String name;
    private String surname;
    private Long identityNo;
    private short yearOfBirth;
    private String mail;
    private String password;

    public Candidates() {
    }

    public Candidates(String name, String surname, Long identityNo, short yearOfBirth, String mail, String password) {
        this.name = name;
        this.surname = surname;
        this.identityNo = identityNo;
        this.yearOfBirth = yearOfBirth;
        this.mail = mail;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(Long identityNo) {
        this.identityNo = identityNo;
    }

    public short getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(short yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Candidates{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", identityNo=" + identityNo +
                ", yearOfBirth=" + yearOfBirth +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
