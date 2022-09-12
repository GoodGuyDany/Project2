import java.util.*;
public class P2 {
    public static void main(String[] args) {
        // Declaring variables
        int legalage = 21;
        double litres;
        String name1;
        String lastname;
        String mothername;
        String fathername;
        String food;
        String catsdogs;
        String drink;
        String weather;

        // First questions
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, stranger! What is your name?");
        String name = sc.nextLine();
        System.out.println("Nice to meet you, " + name + "!" + " I have some questions concerning your age!");
        System.out.println("How old are you?");
        int age = sc.nextInt();
        // Age confirmation
        if (age < legalage) {
            System.out.println(name + ", " + "I am sorry, but you are underage. " + "We can't proceed.");
            System.exit(0);
        }
        // Ordering
        else {
            System.out.println("Congratulations, " + name + "! " + "You are of legal age, we can proceed!");
            System.out.println("We only have beer today, is that okay with you? 1-Yes/0-No");
            byte answer = sc.nextByte(); /* Didn't understand how to use string as a variable here */
            if (answer == 1) {
                System.out.println("How many litres would you like to order?(If you want to order a fraction of a litre, please use a coma to separate the numbers.");
                litres = sc.nextDouble();
                System.out.println("Coming right up with " + litres + " litres of beer" + "!");
            }
            else if (answer == 0) {
                System.out.println("We can't help you then, " + name + ". " + "Sorry.");
            }
        }
//
        System.out.println("Hello dear user! What is your name?");
        name1 = sc.nextLine();
        System.out.println("What a great name! Nice to meet you! What is your last name?");
        lastname = sc.nextLine();
        System.out.println("Thanks for your cooperation so far, " + name1 + " " + lastname + " !");
        System.out.println("Now, how many relatives do you have?");
        int family = sc.nextInt();
        System.out.println("What is your mother's name?");
        mothername = sc.nextLine();
        System.out.println("What is your father's name?");
        fathername = sc.nextLine();
        System.out.println("What is your favourite food?");
        food = sc.nextLine();
        System.out.println("Would you rather have Coca Cola or Pepsi?");
        drink = sc.nextLine();
        System.out.println("Do you like hot or cold weather?");
        weather = sc.nextLine();
        System.out.println("What do you like more: cats or dogs?");
        catsdogs = sc.nextLine();
        System.out.println("The information we gathered was: You are " + name1 + " " + lastname + ", you have " + family + " relatives. " + "Your mother's name is " + mothername + " and your father's name is " + fathername + ". " + "Your favorite food is " + food + " and you'd gladly eat it with a can of " + drink + ". You also like " + weather + " weather and " + catsdogs + ".");
        System.out.println("Did you enjoy our survey? 1-Yes/0-No");
        int survey = sc.nextInt();
        if (survey == 1){
            System.out.println("Thank you for your positive review!");
        }
        else if (survey == 0){
            System.out.println("Very sorry to hear that! We will do better next time!");
        }
    }
}
