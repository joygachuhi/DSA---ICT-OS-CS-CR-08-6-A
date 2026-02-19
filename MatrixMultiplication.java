package Array;
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter rows of Matrix A:");
		int rowsA = scanner.nextInt();
		System.out.println("Enter columns of Matrix A:");
		int colsA = scanner.nextInt();
		System.out.println("Enter rows of Matrix B:");
		int rowsB = scanner.nextInt();
		System.out.println("Enter columns of Matrix B");
		int colsB = scanner.nextInt();
		
		if(colsA == rowsB) {
			System.out.println("Matrices are not compatible for multiplication");
			return;
		}
		int[][]A=new int[rowsA][colsA];
		int[][]B=new int[rowsB][colsB];
		int[][]C=new int[rowsA][colsB];
		
		System.out.println("Enter elements of Matrix A:");
		for(int i=0; i<rowsA; i++) {
			for(int j=0; j<colsA; j++) {
				A[i][j]= scanner.nextInt();
			}
		}
		System.out.println("Enter elements of Matrix B:");
		for(int i=0; i<rowsA; i++) {
			for(int j=0; j<colsB;j++) {
		}
		}
	}
}
		

	


