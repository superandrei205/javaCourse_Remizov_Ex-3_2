import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //        С клавиатуры вводится двумерный массив, длина его строк – 4, столбцов – 3.

        int matrix[][] = new int[4][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0 ; j< matrix[i].length; j++){
                Scanner scan = new Scanner(System.in);
                System.out.println("введите значение для " + i + " строки " + j + " элемента");
                if (scan.hasNextInt()) {
                    matrix[i][j]  = scan.nextInt();
                }

            }
        }


//        1.Напишите программу, которая выводит номера строк и суммы их элементов (пример: Line 2: 17).

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0 ; j< matrix[i].length; j++){
                sum += matrix[i][j];
            }
            System.out.println("Line " + i + " : " + sum);
        }

        // 2.Напишите программу, которая выводит номера столбцов и суммы их элементов (пример:  3: 21).

        for (int col = 0; col < matrix[0].length; col++) {
            int colSum = 0;
            for (int row = 0; row < matrix.length; row++) {
                colSum += matrix[row][col];
            }
            System.out.println("Col " + col + " : " + colSum);
        }

        // 3.Напишите программу, которая заменяет все нечётные элементы массива на 1, а чётные на 0 и выводит его на экран.
        int newMatrix[][] = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0 ; j< matrix[i].length; j++){
                if(matrix[i][j]%2 != 0){
                    newMatrix[i][j] = 1;
                } else {
                    newMatrix[i][j] = 0;
                }
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
        //  4.Напишите программу, которая для в каждой строке находит целое среднее арифметическое и выводит его на экран.

        for (int i = 0; i < matrix.length; i++) {
            double middle = 0;
            for (int j = 0 ; j< matrix[i].length; j++){
                middle += matrix[i][j];
            }
            System.out.println(middle/matrix[i].length);
        }

        //  5.***Напишите программу, которая преобразует двумерный массив в перевёрнутый одномерный и выводит все элементы одномерного массива на экран.

        int[] result = new int[matrix.length* matrix[0].length];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0 ; j< matrix[i].length; j++){
                result[result.length - (count +1)]=matrix[i][j];
                count++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
