public class Question10 {
    public static void main(String[] args) {

        Object[] mixedArray = new Object[5];


        mixedArray[0] = 42;
        mixedArray[1] = "Hello";
        mixedArray[2] = "World";
        mixedArray[3] = "Java";
        mixedArray[4] = 3.14;


        System.out.println("Array elements:");
        for (Object element : mixedArray) {
            System.out.println(element);
        }
    }
}