package Seminar3;

public class HomeWork3 {

    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            int sum = processArray(arr);
            System.out.println("Сумма элементов массива = " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Некорректные данные: размер массива должен быть 4x4");
        } catch (MyArrayDataException e) {
            System.out.println("Некорректные данные: введите число в ячейку (" + e.getRow() + ", " + e.getCol() + ")");
        }
    }

    public static int processArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}

class MyArraySizeException extends Exception {
    MyArraySizeException() {
        super();
    }
}

class MyArrayDataException extends Exception {
    private final int row;
    private final int col;

    MyArrayDataException(int row, int col) {
        super();
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}