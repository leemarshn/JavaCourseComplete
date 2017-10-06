package Humburger;

/**
 * Created by oracle on 7/18/17.
 */
public class main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "sausage", 3.56, "white");
        double price = hamburger.itemizeHumburger();
        hamburger.addHamburgerAddition1("Tomato", 0.44);
        hamburger.addHamburgerAddition2("Lettuce", 2);
        hamburger.addHamburgerAddition3("cheese", 3);
        hamburger.addHamburgerAddition4("emmy", 5);

      //  price = hamburger.itemizeHumburger();

        System.out.println("total price for Buger is " + hamburger.itemizeHumburger());

        HealthyBurger healthyhumBurger = new HealthyBurger("Bacon", 5.3);
        healthyhumBurger.addHamburgerAddition1("Egg", 2);
        healthyhumBurger.addHealthAddition2("Lentis", 3);

        System.out.println("Total Healthy burger is " + healthyhumBurger.itemizeHumburger());


        deluxeBurger db = new deluxeBurger();
        db.addHamburgerAddition3("Should not be able to do this", 50);

        double myvar = db.itemizeHumburger() + healthyhumBurger.itemizeHumburger() + hamburger.itemizeHumburger();

        System.out.println("Total Cost for Deluxe burger is " + db.itemizeHumburger() + " And the tatal cost is" + myvar);



    }
}
