public class Question5 {
    public static void main(String[] args) {

        int[] numbers = new int[5];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }


        System.out.print("Array contents: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}