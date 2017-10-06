package revision.classes;

/**
 * Created by oracle on 10/5/17.
 */
public class VipCustomers {

    private String name;
    private double creditLimit;
    private String email;


    public VipCustomers() {
        this("Lee N", 34550.78, "leenin@gmail.com");
        System.out.println("this is the default constructor");
    }

    public VipCustomers(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");

        System.out.println("this is the 2nd constructor");
    }

    public VipCustomers(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("this is the 3rd constructor");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
