import java.util.Scanner;

public class Book {
    /*
    2.	Ask for the book title and number of copies. Compute for the amount due by assuming that all prices of the books are equal to Php 250.00. Display Title and amount due.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter book title: ");
        String bookTitle = scan.nextLine();
        System.out.println("Enter number of copies: ");
        int NumOfCopies = scan.nextInt();
        scan.close();

        int amountDue = NumOfCopies * 250;

        System.out.println("Book Title: " + bookTitle);
        System.out.println("Amount Due: " + amountDue);

    }

}
