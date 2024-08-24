import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {

        String[] colors = {"red", "green", "blue", "yellow"};


        System.out.println("Length of the original array: " + colors.length);


        String[] colorsCopy = colors.clone();


        System.out.println("Contents of the copied array: " + Arrays.toString(colorsCopy));
    }
}
