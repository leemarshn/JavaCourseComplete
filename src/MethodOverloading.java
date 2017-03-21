/**
 * Created by oracle on 3/13/17.
 */
public class MethodOverloading {
//Method overloading os where you use the same Method Name with Different Parameters
public static void main(String[] args) {
   int newScore= calculateScore("Lee", 500);
    System.out.println("The new Score is " + newScore);

}
public static int calculateScore(String PlayerName, int score){
    System.out.println("Player Name is " + PlayerName + " Scored " + score + " Points ");
    return score * 10000;

}

}
