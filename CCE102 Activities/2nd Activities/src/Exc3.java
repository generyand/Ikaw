public class Exc3 {
    
    public static void main(String[] args) {
        int numbers[] = {12, 23, 120, 60, 320, 45, 93, 21, 60, 310};
        int i;

        System.out.print("Elements: ");
        for (i = 0; i < 8; i += 2) {
            System.out.print(numbers[i] + ", ");
        }
        
        System.out.print(numbers[i]);
        System.out.println();
    }

}
