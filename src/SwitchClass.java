/**
 * Created by Lee on 3/27/17.
 */
public class SwitchClass {
    public static void main(String[] args) {

        //to use data type char make sure you are using java 8

        String switchValue = "A1";
        switch (switchValue){
            case "A":
                System.out.println("You entered A");
                break;
            case "B":
                System.out.println("you entered B");
                break;
            case "C":
                System.out.println("you entered C");
                break;
            case "D":
                System.out.println("You entered D");
                break;
            default:
                System.out.println("We didn't recognize your entry");
                break;

        }

    }
}
