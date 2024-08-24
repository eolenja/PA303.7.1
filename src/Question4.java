public class Question4 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};


        System.out.println("Value at index 0: " + numbers[0]);


        System.out.println("Value at last index: " + numbers[numbers.length - 1]);


        try {
            System.out.println("Value at index length: " + numbers[numbers.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }


        try {
            numbers[numbers.length] = 60;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }
}
