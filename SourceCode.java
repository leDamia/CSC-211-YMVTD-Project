import java.util.Scanner;
//scanner input
public class SourceCode


{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Intro, "Please enter a name"
        System.out.println("Enter a First Name");
        String playerName = scan.nextLine();
        System.out.println("Your name is..." + playerName);

        //Please enter a last name
        System.out.println("Enter a last Name");
        String playerLastName = scan.nextLine();
        System.out.println("Your last name is..." + playerLastName);
        System.out.println();

        //This is the print when we ask the player to choose something
        System.out.print(playerName);
        System.out.println("...Bla bla bla, Choose something");

        Decision1();

        Scanner input = new Scanner(System.in);
    }

    //Decision 1 Method
    public static void Decision1() {
        //The option that the player will choose (1,2 and 3)

        System.out.println("");
        System.out.println("1. Choose this and get swords");
        System.out.println("2. Choose this and get a free white T-shirt");
        System.out.println("3. Choose this and another opinion would appeared");

        //Scanner input to let the player Choose
        Scanner input = new Scanner(System.in);
        //Number is the storage input
        int number = input.nextInt();
        //Switch input to give the user a different print
        //you can also use if statement for this but for me Switch is more simple to do
        switch (number){
            case 1:
                System.out.println("Here your sword");
                System.out.println("");
                System.out.println("You accidentally stab yourself and died lol");
                break;
            case 2:
                System.out.println("Here your free T shirt");
                System.out.println("");
                System.out.println("It isn't worth anything but at least it free");
                break;
            case 3:
                //Put the DecisionFor3 in the Decision1 Method
                //It a method inside a method..Wow!
                DecisionFor3();

        }



        }
        /*Another method to use If the player choose 3
        just to mix up for a bit
         */
    public static void DecisionFor3() {
        //option for the player who choose 3

        System.out.println("Bla bla bla, Since you didn't like the other option so here are some different one");
        System.out.println("");
        System.out.println("4. Choose this and get a free hamburger");
        System.out.println("5.Choose this and try skateboarding down the world largest hill");
        System.out.println("6.Choose this and go on a trip to Europe");

        //Number storage, Scanner input and switch, Same thing.
        Scanner input = new Scanner(System.in);
        int numberfor3 = input.nextInt();
        switch (numberfor3){
            case 4:
                System.out.println("You got a free cheeseburger");
                System.out.println("");
                System.out.println("Mmmm yummy!");
                break;
            case 5:
                System.out.println("You choose to skate down the largest hill");
                System.out.println("");
                System.out.println("You managed to skate down the world largest hill without failing, congratulation you won the world record");
            case 6:
                System.out.println("You go on a trip to Europe");
                System.out.println("");
                System.out.println("Somehow the plane you got on was Pilot by monkeys and you crash and died on a plane lol");

        }


    }

}




