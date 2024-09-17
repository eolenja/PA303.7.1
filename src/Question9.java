import java.util.Arrays;

public class Question9 {
    public static void main(String[] args) {

        int[] numbers = {4, 2, 9, 13, 1, 0};


        Arrays.sort(numbers);


        System.out.print("Array in ascending order: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        int smallest = numbers[0];
        int largest = numbers[numbers.length - 1];


        System.out.println("The smallest number is " + smallest);
        System.out.println("The biggest number is " + largest);
    }
}
