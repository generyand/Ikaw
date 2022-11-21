import java.util.ArrayList;
import java.util.Scanner;

public class Exc4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        System.out.println("************INPUT************");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%23s", "Enter a number:  ");
            int n = scan.nextInt();

            int remainder = n % 2;

            if (remainder == 0) {
                even.add(n);
            } else {
                odd.add(n);
            }
        }
        scan.close();

        System.out.println("************OUTPUT************");
        System.out.printf("%-15s", "Even Elements: ");
        for (int i = 0; i < even.size() - 1; i++) {
            System.out.print(even.get(i) + ", ");
        }
        System.out.print(even.get(even.size() - 1));
        System.out.println();

        System.out.printf("%-15s", "Odd Elements: ");
        for (int i = 0; i < odd.size() - 1; i++) {
            System.out.print(odd.get(i) + ", ");
        }
        System.out.print(odd.get(odd.size() - 1));
        System.out.println();
    }

}
