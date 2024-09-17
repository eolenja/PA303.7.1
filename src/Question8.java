public class Question8{
    public static void main(String[] args) {

        String[] strings = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};


        System.out.println("Original array:");
        printArray(strings);


        String temp = strings[0];
        strings[0] = strings[2];
        strings[2] = temp;


        System.out.println("Array after swapping:");
        printArray(strings);
    }


    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
    }
}