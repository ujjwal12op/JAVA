
import java.util.*;;


    // We are creating a game of guessing the number
    // here we have a guesser an umpire and some players.
    // so basically the guesser has to guess some numbers store it and give it to
    // the umpire.
    // the players has to guess the exact number and return to the umpire
    // and finally the umpire takes the number from the guesser and the players and
    // then compares them and
    // if the number matches the guessers number the player has one.
    // but we need to look for the corner cases.

    // lets create the class of the guesser
    class guesser {
        // need to guess the number
        int guessernumber;
        Scanner sc = new Scanner(System.in);

        // class has variables and does methods.
        public int guessesNumber() {
            // We ask the guesser to guess his number.
            System.out.println("Guesser please guess the number for me!");
            int guessersnumber = sc.nextInt();
            return guessersnumber; // returns this value when asked
        }

    }

    class players {
        int playerguessnum;
        Scanner pl = new Scanner(System.in);
    public int playerguesses(){
        System.out.println("Player please guess your number!");
        int playernumber=pl.nextInt();
        return playernumber;
    }

    }

    class umpire {
        //class has variables and does something that is the methods.
        int NumberfromGuesser;
        int numfromplayer1;
        int numfromplayer2;
        int numfromplayer3;

        public void Guessersnumbers() {
            guesser num = new guesser();
            NumberfromGuesser = num.guessesNumber();
        }
        
        public void playernumber(){
            players plnumber =new players();
            numfromplayer1=plnumber.playerguesses();
            numfromplayer2=plnumber.playerguesses();
            numfromplayer3=plnumber.playerguesses();
        }
//corner cases here are simple what if multiple people win the game so we need to check that
        public void compare()
        {
            if(NumberfromGuesser==numfromplayer1){
                if(NumberfromGuesser==numfromplayer2 && NumberfromGuesser==numfromplayer3){
                    System.out.println("Both player 2 and player 3 are the winners");
                }
                else if(NumberfromGuesser==numfromplayer2){
                    System.out.println("Player 1 and player 2 are the winner");
                }
                else if(NumberfromGuesser==numfromplayer3){
                    System.out.println("Player1 and player 3 won the game!");
                }
                else{
                System.out.println("Player 1 wont the game");
                }
            }
            else if(NumberfromGuesser==numfromplayer2){
                if(NumberfromGuesser==numfromplayer3){
                    System.out.println("Player2 and Player3 won the game!");
                }
                else{
                System.out.println("Player2 won the game");
                }
            }
            else if(NumberfromGuesser==numfromplayer3){
                System.out.println("Player3 won the game");
            }
            else{
                System.out.println("Nobody won the game");
            }
        }
    }
public class Project {
    public static void main(String[] args) {
        System.out.println("Starting the guesser game!");
        umpire u =new umpire();g
        u.Guessersnumbers();
        u.playernumber();
        u.compare();
    }
}
