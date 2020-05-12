package day21;

public class NestedLoopPracticeShort {

    public static void main(String[] args) {

        // nested for loop
        for (int i = 0; i < 4; i++) {
            System.out.println();

            for (int j = 0; j < 3; j++) {
                System.out.print(" |Row " + i + "-Column " + j);
            }
        }

        System.out.println();
        System.out.println("------------------------------------------------");

        // for each loop
        int[] cols = {1,2,3};
        int[] rows = {1,2,3,4};

        for ( int row : rows ) {
            System.out.println();

            for ( int column : cols ) {
                System.out.print(" |row " + row + "-column " + column);
            }

        }

        System.out.println();
        System.out.println("------------------------------------------------");

        // while loop

        int row = 0;
        while (row < 4) {
            row++;
            System.out.println();

            int col = 0;
            while (col < 3) {
                col++;
                System.out.print(" |row " + row + "-column " + col);
            }

        }

    }

}
