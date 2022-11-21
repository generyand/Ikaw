public class Exc2 {

    public static void main(String[] args) {
        int numbers[] = {12, 23, 120, 60, 320, 45, 93, 21, 60, 310};

        System.out.print("Elements: ");
        int i;
        for (i = numbers.length - 1; i > 0; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(numbers[i]);
        System.out.println();
    }

}
