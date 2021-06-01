package matriz;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Simetrica {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int matriz[][], nFilas, nCol;
		boolean simetrica = true;

		nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digita el número de filas"));
		nCol = Integer.parseInt(JOptionPane.showInputDialog("Digita el número de columnas"));

		matriz = new int[nFilas][nCol];

		System.out.println("Digita una matriz");

		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nCol; j++) {
				System.out.print("Digita los números de la matriz [" + i + "] [" + j + "]");
				matriz[i][j] = entrada.nextInt();
			}
		}

		if (nFilas == nCol) {
			int i, j;

			i = 0;
			while (i < 5 && simetrica == true) {
				j = 0;

				while (j < 5 && simetrica == true) {
					if (matriz[i][j] != matriz[j][i]) {
						simetrica = false;
					}
					j++;
				}

				i++;
			}

			if (simetrica == true) {
				JOptionPane.showMessageDialog(null, "La matriz es simétrica");
			} else {
				JOptionPane.showMessageDialog(null, "La matriz no es simétrica");
			}

		}

		else {
			System.out.println("La matriz no es simétrica");
		}

	}
}
