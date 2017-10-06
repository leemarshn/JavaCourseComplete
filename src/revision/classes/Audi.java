package revision.classes;

/**
 * Created by oracle on 10/6/17.
 */
public class Audi extends Car {

    private int speed;
    private int gearNo;
    private int maxSpeed;


    public Audi( String model,int gearNo) {
        super("Audi",model);
        //this.speed = speed;
        this.gearNo = gearNo;
        this.maxSpeed = 360;

        System.out.println(getName() + " " + model);
    }


//    public String getModel() {
//        return super.getModel();
//    }
//
//    public int getMaxSpeed() {
//        return speed;
//    }
//
//    public void steeringDirection(){
//        if(this.gearNo <-1){
//            System.out.println("the vehicle is reversing");
//        }if (gearNo ==0){
//            System.out.println("This vehicle is not moving");
//        }
//        else
//            System.out.println("the vehicle is moving forward");
//    }
//
//    public void speedLimit(){
//        if(this.speed >maxSpeed){
//            System.out.println("You have reached the maximum speed please slow down");
//        }
//    }

    public int speedCount(){
        switch (gearNo){
            case 1:
                maxSpeed = 360;
                break;
            case 2:
                maxSpeed = 300;
                System.out.println("Driving at " + maxSpeed + "/KPH");
                break;
            case 3:
                maxSpeed = 220;
                System.out.println("Driving at " + maxSpeed + "/KPH");
                break;

            case 4:
                maxSpeed = 80;
                System.out.println("Driving at " + maxSpeed + "/KPH");
                break;
            case 5:
                maxSpeed = 20;
                System.out.println("Driving at " + maxSpeed + "/KPH");
                break;
            case -1:
                maxSpeed = 5;
                System.out.println("You are now is reversing ");
                break;
            default:
                System.out.println("Gear No not allowed");
                break;
        }
        return gearNo;

    }
}
