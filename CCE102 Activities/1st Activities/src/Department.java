import java.util.Scanner;

public class Department {
    /*
    11.	Write a java program that would print the name of the supervisor under a certain department number.
    Department Number	Supervisor
    1-3				Mr. Realonda
    4-7				Mr. Mercado
    8-9				Mr. Ortega

    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What department are you from?");
        int depNum =  scan.nextInt();
        scan.close();

        if (depNum >= 1 && depNum <= 3) {
            System.out.println("Your Supervisor  is Mr. Realonda");
        } else if (depNum >= 4 && depNum <= 7) {
            System.out.println("Your supervisor is Mr. Mercado");
        } else if (depNum == 8 || depNum == 9) {
            System.out.println("Your supervisor is Mr. Ortega");
        } else  {
            System.out.println("Invalid! There are only 9 departments.");
        }
    }

}
