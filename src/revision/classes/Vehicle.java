package revision.classes;

/**
 * Created by oracle on 10/6/17.
 */
public class Vehicle {
    private int wheels;
    private  int steering;
    private int gearbox;
    private String name;
    private String model;

    public Vehicle(int wheels, int steering, int gearbox, String name, String model) {
        this.wheels = wheels;
        this.steering = steering;
        this.gearbox = gearbox;
        this.name = name;
        this.model = model;

      //  System.out.println("This is the default constructor of Vehicle class All Vehicles have a Name, a Model, wheels, gearbox");
    }

    public int getWheels() {
        return wheels;
    }

    public int getSteering() {
        return steering;
    }

    public int getGearbox() {
        return gearbox;
    }

    public String getName() {
        return name;
    }

    public String getModel(){
        return model;
    }
}
