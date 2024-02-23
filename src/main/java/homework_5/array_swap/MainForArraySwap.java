package homework_5.array_swap;
import java.util.Arrays;
import static homework_5.array_swap.ArraySwap.swapElements;

public class MainForArraySwap {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println("Input array: " + Arrays.toString(array));
        swapElements(array, 1, 3);
        System.out.println("Array after swapping: " + Arrays.toString(array));
    }
}
