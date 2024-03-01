package homework_6;

public class MainCheckException {
    public static void main(String[] args) {
        TwoDimensionalArrayClass twoDimensionalArrayClass = new TwoDimensionalArrayClass();

        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            twoDimensionalArrayClass.checkArray3(array);
        } catch (TwoDimensionalArrayClass.MyArraySizeException | TwoDimensionalArrayClass.MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
