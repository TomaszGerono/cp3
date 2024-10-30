package person;

public class Person {
    double weight;
    double height;
    String name;
    double bmiValue;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    void setWeightAndHeight(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    void calculateBMI() {
        this.bmiValue = this.weight / Math.pow(this.height,2);
    }

    
    void displayRecord() {
        System.out.println("name: " + this.name);
        System.out.println("weight: " + this.weight);
        System.out.println("BMI: " + this.bmiValue);

        if (this.bmiValue < 18.5) {
            System.out.println("BMI too low");
        }

        else if (this.bmiValue > 24.9) {
            System.out.println("BMI too high");
        }
    }
}
