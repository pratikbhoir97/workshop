import java.io.*;
import java.util.*;
public class SnakeAndLadder{
    static int position = 0;
    static int playDice;
    static int playerMove;
    static Random random = new Random();
    static int key;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        playDice = throwDice();
        playerMove = play();
        
    }
    
    //This method will genarate random Number for DiceRoll
    static int throwDice(){
    playDice = random.nextInt(6)+1; 
    System.out.println(playDice);
    return playDice;
    }
    //This method will define next move for player
    static int play(){
        playerMove = random.nextInt(3)+1; 
        System.out.println(playerMove);
        if(playerMove == 1){
            System.out.println("No Play");
        }else if(playerMove == 2){
            System.out.println("Ladder");
            position += playDice;
        }else{
            System.out.println("Snake");
            position -= playDice;
            if(position<0)
            position = 0;
        }
        System.out.println("User current position "+position);

        System.out.println("enter 1 for next play any key for exit");
        key = scanner.nextInt();
        switch (key) {
            case 1:
                throwDice();
                play();
                break;
            default:
                break;
        }
        
    }

}
