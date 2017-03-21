/**
 * Created by oracle on 3/14/17.
 */
public class Methods {
    public static void main(String[] args) {
        displayHighScorePosition("Lee", 8000 );
        calculateHighScorePosition(450);

    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println("Dear " +name +" You managed to get to position" +position +" in the high scores table");

    }
    public static int calculateHighScorePosition (int score){

        if(score >1000){
            return score;
        }else if (score >500 && score <1000){
            return score;
        }else if(score >100 && score <500){
            return score;
        }
        return 0;

    }
}
