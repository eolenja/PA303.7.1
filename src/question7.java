public class question7 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};


        for (int i = 0; i < numbers.length; i++) {

            if (i != 2) {

                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        }
    }
}