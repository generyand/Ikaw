import java.util.Scanner;

public class charInput {
    /*
    1. Write a code that has a file name Two_input.java. Ask the user for two
    character, that has two characters, that has a variable name of: in1 and in2 and Output the two characters.
    Sample Output:
    Enter one Character: d
    Enter one Character: w
    
    dw
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first character");
        char in1 = scan.next().charAt(0);
        System.out.println("Enter second character");
        char in2 = scan.next().charAt(0);
        scan.close();
        System.out.println();

        System.out.print(in1);
        System.out.print(in2);
        System.out.println();

    }

}
