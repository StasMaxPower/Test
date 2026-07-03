package lesson_2;

public class Main {

    public static void main(String[] args) {

        //Домашнее задание
        //1) Создать массив 6 на 6 сразу с числами (сразу с числами)
        //2) Перезаписать во все ячейки нули (0)
        //3) Вывести диагональ снизу вверх слева направо
        //4) Вывести в шахматном порядке

        int[][] square = {
                {2, 53, 18, 77, 62, 81},
                {48, 5, 57, 1, 98, 17},
                {11, 14, 59, 63, 41, 21},
                {3, 8, 88, 27, 65, 71},
                {66, 74, 16, 29, 39, 9},
                {13, 4, 51, 97, 82, 76}
        };

        int[][] square1 = {
                {2, 53, 18, 77, 62, 81},
                {48, 5, 57, 1, 98, 17},
                {11, 14, 59, 63, 41, 21},
                {3, 8, 88, 27, 65, 71},
                {66, 74, 16, 29, 39, 9},
                {13, 4, 51, 97, 82, 76}
        };





        System.out.println("Массив 6х6 с нулями:");
        for (int indexLine = 0; indexLine < square.length; indexLine++) {
            //int[] line = square[indexLine];
            for (int indexColumn = 0; indexColumn < square[0].length; indexColumn++) {
                square[indexLine][indexColumn] = 0;
                System.out.print(square[indexLine][indexColumn] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Массив 6х6 с нулями по диагонали снизу вверх и слева направо:");
        for (int indexRowTable = 0; indexRowTable < square.length; indexRowTable++) {
            int[] rowTable = square[indexRowTable];
            for (int indexColumnTable = 0; indexColumnTable < rowTable.length; indexColumnTable++) {
                if (indexColumnTable != rowTable.length - 1 - indexRowTable) {
                    System.out.print("  ");
                } else {
                    System.out.print(square[indexRowTable][indexColumnTable]);
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Массив 6х6 с нулями в шахматном порядке:");
        for (int indexRowChess = 0; indexRowChess < square.length; indexRowChess++) {
            int[] rowChess = square[indexRowChess];
            for (int indexColumnChess = 0; indexColumnChess < rowChess.length; indexColumnChess++) {
                if (indexRowChess % 2 == 0) {
                    if (indexColumnChess % 2 == 0) {
                        System.out.print("  ");
                    } else {
                        System.out.print(square[indexRowChess][indexColumnChess]);
                    }
                }
                if (indexRowChess % 2 != 0) {
                    if (indexColumnChess % 2 != 0) {
                        System.out.print("  ");
                    } else {
                        System.out.print(square[indexRowChess][indexColumnChess]);
                    }
                }
            }
            System.out.println();
        }
    }

}
