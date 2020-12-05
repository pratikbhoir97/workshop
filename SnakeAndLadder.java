import java.io.*;
import java.util.*;
public class SnakeAndLadder{
void public static void main(String[] args) {
    Init init = new Init();
    init.playerInitialPosition();

}


}


class Init{
int position =0;
    playerInitialPosition(){
        position = 0;
    }
     
    int throwDice(){
    int dice = rand.nextInt(6)+1; 
    return dice;
    }


}