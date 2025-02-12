public class ArrayFlipTester {
    public static String[][] flip2DArray(String[][] arr) {
        String[][] newArr = new String[arr[0].length][arr.length];
        for (int col = 0; col < arr.length; col++) {
            for (int row = 0; row < arr[col].length; row++) {
                newArr[row][col] = arr[col][row];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {

        String[][] arr = new String[3][4];

        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 4; row++) {
                arr[col][row] = col + row + "";
            }
        }

        for (int col = 0; col < arr.length; col++) {
            for (int row = 0; row < arr[col].length; row++) {
                System.out.print(arr[col][row]);
            }
            System.out.println();
        }

        arr = flip2DArray(arr);
        for (int col = 0; col < arr.length; col++) {
            for (int row = 0; row < arr[col].length; row++) {
                System.out.print(arr[col][row]);
            }
            System.out.println();
        }
    }

}
