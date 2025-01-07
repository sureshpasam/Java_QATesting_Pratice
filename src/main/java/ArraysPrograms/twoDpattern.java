package ArraysPrograms;

public class twoDpattern {

    static int[][] a = new int[10][10];

    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("* ", a[i][j]);
            }
            System.out.println("");
        }
    }
}

