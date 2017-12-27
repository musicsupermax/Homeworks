package arrayslesson5;

public class ArrayTwoString {
    public static void main(String[] args) {
        String[][] array = new String[3][6];
        int i, j;
        char c = 'a';

        for (i = 0; i < 3; i++, c++) {
            for (j = 0; j < 6; j++) {
                array[i][j] = c + "" + (j + 1);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
