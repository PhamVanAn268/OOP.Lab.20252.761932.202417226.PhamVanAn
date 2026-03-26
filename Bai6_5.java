import java.util.Scanner;
import java.util.Arrays;

public class Bai6_5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = keyboard.nextInt();
        double[] my_array = new double[n];
        double sum = 0;
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            my_array[i] = keyboard.nextDouble();
            sum += my_array[i];
        }
        
        Arrays.sort(my_array);
        double average = sum / n;
        
        System.out.println("Sorted array: " + Arrays.toString(my_array));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        keyboard.close();
    }
}