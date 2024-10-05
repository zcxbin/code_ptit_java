package LogMatrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            Matrix matrix = new Matrix(n, m);
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    matrix.createMatrix(i, j, sc.nextInt());
                }
            }
            matrix.sortColumns(k);
            System.out.println(matrix.toString());
        }
    }
}
