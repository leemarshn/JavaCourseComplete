package Humburger;

/**
 * Created by oracle on 7/18/17.
 */
public class deluxeBurger extends Hamburger {

    public deluxeBurger() {
        super("Deluxe", "Sausagge & Bacon", 15, "white");
        super.addHamburgerAddition1("chips", 4);
        super.addHamburgerAddition2("Drink", 3);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add an addition Item to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add an addition Item to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add an addition Item to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add an addition Item to a deluxe burger");
    }
}
