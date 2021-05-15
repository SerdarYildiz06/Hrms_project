package hrms.project.entities.concretes;

public class Employer {

    private String companyName;
    private String webSite;
    private String mail;
    private int phoneNumber;
    private String password;

    public Employer() {
    }

    public Employer(String companyName, String webSite, String mail, int phoneNumber, String password) {
        this.companyName = companyName;
        this.webSite = webSite;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "companyName='" + companyName + '\'' +
                ", webSite='" + webSite + '\'' +
                ", mail='" + mail + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", password='" + password + '\'' +
                '}';
    }
}
