package Two_Dimensional_Arrays;

import java.util.Scanner;

public class Processing_Two_Dimensional_Arrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][5];

        System.out.print("Please enter " + matrix.length + " rows and " +
                matrix[0].length + " columns;");

        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextInt();
            }
        }

//        for (int row = 0; row < matrix.length; row++){
//            for (int column = 0; column< matrix[row].length; column++){
//                matrix[row][column] = (int)(Math.random()*100);
//            }
//        }

        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column< matrix[row].length; column++){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

        int total = 0;
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                total = total + matrix[row][column];
            }
           // System.out.println("sum of all elements = " + total);
        }
        System.out.println("sum of all elements = " + total);


        for (int column = 0; column < matrix[0].length; column++){
            int sumForEachColumns = 0;
            for (int row = 0; row < matrix.length; row++){
                sumForEachColumns = sumForEachColumns + matrix[row][column];

            }
            System.out.println("Sum by columns = " + sumForEachColumns);
        }

        for (int row = 0; row < matrix[0].length; row++){
            int sumForEachRows = 0;
            for (int column = 0; column < matrix.length; column++){
                sumForEachRows = sumForEachRows + matrix[row][column];
            }
            System.out.println("sum by rows = " + sumForEachRows);
        }

        int maxRow = 0;
        int indexOfMaxRow = 0;

        //get sum of the first row
        for (int column = 0; column < matrix[0].length; column++){
            maxRow = maxRow + matrix[0][column];
        }

        for (int row = 1; row < matrix.length; row++){
            int totalOfThisRow = 0;
            for (int column = 0; column< matrix[row].length; column++){
                totalOfThisRow = totalOfThisRow + matrix[row][column];

                if (totalOfThisRow > maxRow){
                    maxRow = totalOfThisRow;
                    indexOfMaxRow = row;
                }
            }
        }

        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
    }
}
