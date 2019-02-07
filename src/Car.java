
@Style
public class Car {

    @Format
    String model;
    int number;

    public Car(String model, int number) {
        this.model = model;
        this.number = number;
    }

    @Limitation
    public void drive(){
        System.out.println("Drive this car");
    }
}
