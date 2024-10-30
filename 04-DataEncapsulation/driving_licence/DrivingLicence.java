package driving_licence;
import java.time.Year;

public class DrivingLicence {
    private String name;
    private String surname;
    private int age;
    private String address;
    private String postalCode;
    private String licenceNumber;
    private int yearOfIssue;
    private String licenceCategory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue >= 1980 && yearOfIssue <= Year.now().getValue()) {
            this.yearOfIssue = yearOfIssue;
        }
    }

    public void setLicenceCategory(String licenceCategory) {
        this.licenceCategory = licenceCategory;
    }




    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String getYearOfIssue() {
        return String.valueOf(yearOfIssue);
    }

    public String getLicenceCategory() {
        return licenceCategory;
    }

    public void display() {
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("age: " + String.valueOf(age));
        System.out.println("address: " + address);
        System.out.println("postal code: " + postalCode);
        System.out.println("Licence number: " + licenceNumber);
        System.out.println("year of issue: " + yearOfIssue);
        System.out.println("licence category: " + licenceCategory);
    }

    public String toString() {
        return getLicenceNumber() + getLicenceCategory() + getYearOfIssue();
    }


}
