/**
 * Write a method to read two integer matrices from StdIn and print
 * their product matrix.
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;

class MatrixMultiplication {
  String name;
  int rows;
  int cols;
  int[][] matrix;

  void setMatrix() {
    try {
      Scanner scan = new Scanner(System.in);
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.printf("Matrix %s rows: ", this.name);
      int rows = scan.nextInt();
      System.out.printf("Matrix %s cols: ", this.name);
      int cols = scan.nextInt();
      System.out.printf("Space separated Matrix %s entries (e.g. '1 2 3'): ", this.name);
      int[] matRaw = Arrays.stream(br.readLine().trim().split(" "))
          .mapToInt(Integer::parseInt).toArray();
      int[][] mat = new int[rows][cols];
      for (int i = 0; i < rows; i++) {
        mat[i] = Arrays.copyOfRange(matRaw, i * cols, i * cols + cols);
      }
      this.rows = rows;
      this.cols = cols;
      this.matrix = mat;
    } catch (Exception e) {
      System.out.println(e);
      System.out.println("Caught an error. Please try again!");
      this.setMatrix();
    }
  }

  static int[][] matMult(
      MatrixMultiplication matA,
      MatrixMultiplication matB) {
    int[][] prodMat = new int[matA.rows][matB.cols];
    for (int i = 0; i < matA.rows; i++) {
      int[] prodMatRow = new int[matB.cols];
      for (int j = 0; j < matB.cols; j++) {
        int prodMatIJ = 0;
        for (int k = 0; k < matA.cols; k++) {
          prodMatIJ += matA.matrix[i][k] * matB.matrix[k][j];
        }
        prodMatRow[j] = prodMatIJ;
      }
      prodMat[i] = prodMatRow;
    }
    return prodMat;
  }

  public static void main(String[] args) {
    MatrixMultiplication matA = new MatrixMultiplication();
    matA.name = "A";
    matA.setMatrix();
    MatrixMultiplication matB = new MatrixMultiplication();
    matB.name = "B";
    matB.setMatrix();
    if (matA.cols == matB.rows) {
      System.out.println("The product Matrix is: ");
      int[][] prodMat = matMult(matA, matB);
      String result = "";
      for (int i = 0; i < matA.rows; i++) {
        result += "\t" + Arrays.toString(prodMat[i]) + "\n";
      }
      System.out.println(result);
    } else {
      System.out.println("Matrices can't be multiplied!");
    }
  }
}
