package revision.classes;

/**
 * Created by oracle on 10/6/17.
 */
public class Car extends Vehicle {

    public Car( String name, String model) {
        super(4, 1, 1, name, model);
        System.out.println(name + " " + model);
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

    @Override
    public int getSteering() {
        return super.getSteering();
    }

    @Override
    public int getGearbox() {
        return super.getGearbox();
    }
}
