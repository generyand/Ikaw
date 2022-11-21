import java.util.Scanner;

public class Gender {
    /*
    8.	Write a java program that will ask the user to enter a character (either ‘M’ or ‘F’) to indicate the user’s gender (Male or Female). Display “Male” if the user enters the value of ‘M’ and “Female” for the value of ‘F’. 
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Are you a Male or Female? \nMale = M\nFemale = F");
        char gender = scan.next().charAt(0);
        scan.close();
        System.out.println();

        if (gender == 'M' || gender  == 'm') {
            System.out.println("So you are a Male. :D");
        } else if (gender == 'F' || gender  == 'f')  {
            System.out.println("So you are a Female. :o");
        } else {
            System.out.println("Invalid key");
        }
    }

}
