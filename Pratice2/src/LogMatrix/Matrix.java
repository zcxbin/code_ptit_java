package LogMatrix;

import java.util.Arrays;

public class Matrix {
    private Integer row;
    private Integer column;
    private Integer[][] matrix;
    public Matrix(Integer row, Integer column) {
        this.row = row;
        this.column = column;
        matrix = new Integer[row][column];

    }

    public void createMatrix(int n, int m, int data){
        this.matrix[n][m] = data;
    }
    public void sortColumns(int k) {
        int[] col = new int[row];
        for(int i = 0; i < row; i++){
            col[i] = matrix[i][k - 1];
        }
        Arrays.sort(col);
        for(int i = 0; i < row; i++){
            matrix[i][k - 1] = col[i];
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                sb.append(matrix[i][j] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
