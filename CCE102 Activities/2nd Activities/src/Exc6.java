public class Exc6 {
    
    public static void main(String[] args) {
        int[][] data = {{ 23, 34, 50, 21, 10 },
                        { 12, 22, 10, 6, 4 },
                        { 4, 67, 16, 40, 56 },
                        { 82, 85, 29, 30, 7 },
                        { 6, 34, 34, 45, 79 }
        };

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                System.out.printf("%-4d ", data[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int largestNum = 0;
        int largestColumn = 0;
        int i = 0;
        for (int j = 0; j < data.length; j++) { // 5
            int sum = 0;
            for (i = 0; i < data.length; i++) {
                sum += data[i][j];
                if (sum > largestNum) {
                    largestNum = sum;
                    largestColumn = j + 1;
                }
            }
            System.out.println("Sum of Column " + (j + 1) + ": " + sum);
        }
        System.out.println();
        System.out.println("The largest sum is Column " + largestColumn + ": " + largestNum);
        
    }

}
