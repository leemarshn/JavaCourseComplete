/**
 * Created by oracle on 3/14/17.
 */
public class If_Else {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score  = 8000;
        int levelCompleted = 5;
        int bonus = 100;

/*        if(score < 5000 & score > 100){
            System.out.println("Your score was less than  500 bt greater than 1000");
        } else if (score <100){
            System.out.println("Your score was less than 100");
        }else {
            System.out.println("Got here");
        }*/

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your finale score was " + finalScore);
        }

        if(gameOver){

            score = 1000;
            levelCompleted = 8;
            bonus = 200;

            int finalScore = score + (levelCompleted * bonus);

            System.out.println("Your final Score is " + finalScore);
        }

    }
}
