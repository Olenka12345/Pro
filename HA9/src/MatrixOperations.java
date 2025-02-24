
import java.util.Random;
public class MatrixOperations {

     public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int[] numbers = {3, 5, 7, 4, 8, 12, 45, 49, 1, 4, 19, 18, 17, 15, 35};
        Random random = new Random();

        // Заповнення матриці випадковими числами з масиву
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = numbers[random.nextInt(numbers.length)];
            }
        }

        // Виведення матриці
        System.out.println("Матриця:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }

        int sumEvenRows = 0, sumOddRows = 0;
        int productEvenCols = 1, productOddCols = 1;

        // Обчислення сум рядків та добутків стовпців
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) {
                    sumEvenRows += matrix[i][j];
                } else {
                    sumOddRows += matrix[i][j];
                }
                if (j % 2 == 0) {
                    productEvenCols *= matrix[i][j];
                } else {
                    productOddCols *= matrix[i][j];
                }
            }
        }

        // Виведення результатів
        System.out.println("Сума парних рядків(рядок 0, 2): " + sumEvenRows);
        System.out.println("Сума непарних рядків(рядок 1, 3): " + sumOddRows);
        System.out.println("Добуток парних стовпців (стовпець 0, 2): " + productEvenCols);
        System.out.println("Добуток непарних стовпців (стовпець 1, 3) : " + productOddCols);

        // Перевірка на магічний квадрат
        boolean isMagic = true;
        int magicSum = 0;

        for (int j = 0; j < 4; j++) {
            magicSum += matrix[0][j];
        }

        for (int i = 1; i < 4; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                isMagic = false;
                break;
            }
        }

        if (isMagic) {
            for (int j = 0; j < 4; j++) {
                int colSum = 0;
                for (int i = 0; i < 4; i++) {
                    colSum += matrix[i][j];
                }
                if (colSum != magicSum) {
                    isMagic = false;
                    break;
                }
            }
        }

        if (isMagic) {
            int diag1 = 0, diag2 = 0;
            for (int i = 0; i < 4; i++) {
                diag1 += matrix[i][i];
                diag2 += matrix[i][3 - i];
            }
            if (diag1 != magicSum || diag2 != magicSum) {
                isMagic = false;
            }
        }

        System.out.println("Матриця " + (isMagic ? "є магічним квадратом" : "не є магічним квадратом"));
    }
}
