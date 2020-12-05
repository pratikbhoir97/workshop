import java.io.*;
import java.util.*;
public class SnakeAndLadder{
    static int position = 0;
    static int playDice;
    static int playerMove;
    static Random random = new Random();
    public static void main(String[] args) {
        playDice = throwDice();
        playerMove = play();

        if(playerMove == 1){
            System.out.println("No Play");
        }else if(playerMove == 2){
            System.out.println("Ladder");
            position += playDice;
        }else{
            System.out.println("Snake");
            position -= playDice;
        }
        System.out.println(position);
        
    }

    //This method will genarate random Number for DiceRoll
    static int throwDice(){
    playDice = random.nextInt(6)+1; 
    System.out.println(playDice);
    return playDice;
    }

    static int play(){
        playerMove = random.nextInt(3)+1; 
        System.out.println(playerMove);
        return playerMove;
    }

}
