package Humburger;

/**
 * Created by oracle on 7/18/17.
 */
public class HealthyBurger extends Hamburger{
    private  String healthyExtra1Name;
    private double healthyExtra1Price;



    private  String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "brown rye");

    }


    public void addHealthAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHumburger() {
       double humbugergerPrice = super.itemizeHumburger();

        if (this.healthyExtra1Name != null){
            humbugergerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for this " + this.healthyExtra1Price);

        }

        if (this.healthyExtra2Name != null){
            humbugergerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for this " + this.healthyExtra2Price);

        }

        return humbugergerPrice;
    }
}
