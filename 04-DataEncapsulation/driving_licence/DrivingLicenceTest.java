package driving_licence;

public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.setAge(19);
        dl.setLicenceCategory("B");
        dl.setLicenceNumber("KR43434");
        dl.setName("john");
        dl.setSurname("Smith");




        System.out.println(dl.getAge());
        System.out.println(dl.getName());


    }

}
