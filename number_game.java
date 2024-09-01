import java.util.Scanner;

public class number_game {
    public static void main(String[] args) {

        System.out.println("GAME NAME:NUMBER GAME");
        Scanner sc = new Scanner(System.in);
        int Chances=8;
        int finals=0;
        boolean playagain=true;
        System.out.println("Welcome Buddy");
        System.out.println("Hey buddy you have "+Chances+" chances to win the game");
        while(playagain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<Chances;i++){
                System.out.println("Chances" +(i+1)+ "  Enter your guess:");
                int user=sc.nextInt();
                if(user==rand) {
                    guess = true;
                    finals += 1;
                    System.out.println("You won it.");}
                else if(user > rand){
                   System.out.println("Too High"); 
                }
                else{
                    System.out.println("Too Low");
                }
            }
            if(guess==false){
                System.out.println("Sorry buddy. You lost the chances. the number is "+rand);
            }
            System.out.println("Do you want to play again(y/n)");
            String pa=sc.next();
            playagain=pa.equalsIgnoreCase(",");
        }    
        System.out.println("That's it buddy ,Hope you enjoyed it");
        System.out.println("Here is your Score:"+finals);
        sc.close();
    }
        public static int getrandN(int min,int max){
            return (int)(Math.random()*(max-min+1)+min);
            
        }
    
}