package homework_6;

public class TwoDimensionalArrayClass {
    public static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }

    private void checkArray1(String[][] array) throws MyArraySizeException {
        if(array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4");
        }
    }

    private void checkArray2(String[][] array) throws MyArrayDataException {
        int[][] numbers = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    numbers[i][j] = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
    }

    public void checkArray3(String[][] array) throws MyArraySizeException, MyArrayDataException {
        checkArray1(array);
        checkArray2(array);
    }
}
