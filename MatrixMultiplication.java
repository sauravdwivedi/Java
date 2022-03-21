/** Write a method to read two matrices from StdIn and print
 *  their product matrix.
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;

class MatrixMultiplication {
  static int[][] matMult(
    int[][] matA,
    int[][] matB,
    int rowsA,
    int colsA,
    int colsB) {
    int[][] prodMat = new int[rowsA][colsB];
    for (int i = 0; i < rowsA; i++) {
      int[] prodMatRow = new int[colsB];
      for (int j = 0; j < colsB; j++) {
        int prodMatIJ = 0;
        for (int k = 0; k < colsA; k++) {
          prodMatIJ += matA[i][k] * matB[k][j];
        }
        prodMatRow[j] = prodMatIJ;
      }
      prodMat[i] = prodMatRow;
    }
    return prodMat;
  }
  
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Matrix A rows: ");
    int rowsA = scan.nextInt();
    System.out.println("Matrix A cols: ");
    int colsA = scan.nextInt();
    System.out.println("Space separated Matrix A entries (e.g. '1 2 3'): ");
    int[] matARaw = Arrays.stream(br.readLine().trim().split(" "))
      .mapToInt(Integer::parseInt).toArray();
    int[][] matA = new int[rowsA][colsA];
    for (int i = 0; i < rowsA; i++) {
      matA[i] = Arrays.copyOfRange(matARaw, i*colsA, i*colsA + colsA);
    }
    System.out.println("Matrix B rows: ");
    int rowsB = scan.nextInt();
    System.out.println("Matrix B cols: ");
    int colsB = scan.nextInt();
    System.out.println("Space separated Matrix B entries (e.g. '1 2 3'): ");
    int[] matBRaw = Arrays.stream(br.readLine().trim().split(" "))
      .mapToInt(Integer::parseInt).toArray();
    int[][] matB = new int[rowsB][colsB];
    for (int i = 0; i < rowsB; i++) {
      matB[i] = Arrays.copyOfRange(matBRaw, i*colsB, i*colsB + colsB);
    }
    if (colsA == rowsB) {
      System.out.println("The product Matrix is: ");
      int[][] prodMat = matMult(matA, matB, rowsA, colsA, colsB);
      String result = "";
      for (int i = 0; i < rowsA; i++) {
        result += "\t" + Arrays.toString(prodMat[i]) + "\n";
      }
      System.out.println(result);
    } else {
      System.out.println("Matrices can't be multiplied!");
    }
  }
}
