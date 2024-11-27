public class Writer {

    private String first_name;
    private String last_name;
    private int age;
    private String country;

    

    public Writer(String first_name, String last_name, int age, String country) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.country = country;
    }

    

    @Override
    public String toString() {
        return "Writer [first_name=" + first_name + ", last_name=" + last_name + ", age=" + age + ", country=" + country
                + "]";
    }



    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    

}