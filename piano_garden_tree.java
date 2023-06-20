public class KeepItClean {
    public static void main(String[] args) {
        /* Your code here */
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            count++;
            sum += i;
        }
        System.out.println("The sum of the numbers from 0 to 1000 is " + sum);
        System.out.println("Total number of iterations: " + count);
    }
}