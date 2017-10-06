/**
 * Created by oracle on 6/13/17.
 */
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public void deposit (double depositAmount) {
        this.balance += depositAmount;
        System.out.println("deposit of" + depositAmount + "made. New balance is " +  this.balance);
    }

    public void withdrawal (double withdrawalAmount){
        if (this.balance - withdrawalAmount <=0){
            System.out.println("only " + this.balance + "Available. withdrawal not processed");
        }else {
            this.balance -=withdrawalAmount;
            System.out.println("withdraw of " + withdrawalAmount + "proccessd. remaining balance " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
