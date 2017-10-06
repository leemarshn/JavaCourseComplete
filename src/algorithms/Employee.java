package algorithms;

import java.util.Arrays;

/**
 * Created by LeeN on 9/28/17.
 */
public class Employee {

    private Employed[] employeds;

    public Employee (int size){
        this.employeds = new Employed[size];
    }

    public void sort() {
        for (int i = 0; i < employeds.length; i++) {
            Employed current = employeds[i];
            int j = i-1;
            while (j >=0 && employeds[j].employeeNumber >= current.employeeNumber) {
                employeds[j+1] = employeds[j];
                j--;
            }
            employeds[j+1] = current;
        }
    }



    public static void main(String[] args) {
        Employee sorter = new Employee(4);
		Employed emp1 = new Employed(100000009, "John","Doe", "john.doe@dsnalgos.com");
		sorter.employeds[0] = emp1;
		Employed emp2 = new Employed(100000002, "Patrick","Dwight", "patrick.dwight@dsnalgos.com");
		sorter.employeds[1] = emp2;
		Employed emp3 = new Employed(100000011, "Marlo","Thomas", "marlo.thomas@dsnalgos.com");
		sorter.employeds[2] = emp3;
		Employed emp4 = new Employed(100000004, "Barbara","Weatherspoon", "barbara.weatherspoon@dsnalgos.com");
		sorter.employeds[3] = emp4;
		sorter.sort();
		System.out.println(Arrays.deepToString(sorter.employeds));



    }


}
class Employed{

    public int employeeNumber;
    public String fname;
    public String lname;
    public String emailId;


    public Employed(int employeeNumber, String fname, String lname, String emailId) {
        this.employeeNumber = employeeNumber;
        this.fname = fname;
        this.lname = lname;
        this.emailId = emailId;
    }
    public String toString() {
        return this.employeeNumber + " : " + this.emailId;
    }
}
