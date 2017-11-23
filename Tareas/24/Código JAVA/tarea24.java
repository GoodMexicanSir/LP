/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea24{
	public static void main (String[] args){
		String entrada ="";
		String salidaC = "";
		int i, j, cA, cB, fA, fB;

		entrada = JOptionPane.showInputDialog(null,"[A]\nIngrese el numero de filas:");
		fA = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog(null,"[A]\nIngrese el numero de columnas:");
		cA = Integer.parseInt(entrada);
		int[][] matrizA = new int[fA][cA];

		for(i=0; i<fA; i++){
			for(j=0; j<cA; j++){
				entrada = JOptionPane.showInputDialog(null,"Ingrese el valor de A["+i+"]["+j+"]");
				matrizA[i][j] = Integer.parseInt(entrada);
			}
		}

		entrada = JOptionPane.showInputDialog(null,"[B]\nIngrese el numero de filas:");
		fB = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog(null,"[B]\nIngrese el numero de columnas:");
		cB = Integer.parseInt(entrada);
		int[][] matrizB = new int[fB][cB];

		for(i=0; i<fB; i++){
			for(j=0; j<cB; j++){
				entrada = JOptionPane.showInputDialog(null,"Ingrese el valor de B["+i+"]["+j+"]");
				matrizB[i][j] = Integer.parseInt(entrada);
			}
		}

		if(cA == fB){
			int[][] matrizC = new int[fB][cA];

			for(i=0; i<fB; i++){
				for(j=0; j<cA; j++){
					matrizC[i][j] += matrizA[i][j] + matrizB[j][i];
				}
			}

			for(i=0; i<fB; i++){
				for(j=0; j<cA; j++){
					salidaC = salidaC + matrizC[i][j] + "   ";
				}
				salidaC = salidaC + ("\n");
			}
		}else if(cB == fA){
			int[][] matrizC = new int[fA][cB];

			for(i=0; i<fA; i++){
				for(j=0; j<cB; j++){
					matrizC[i][j] += matrizB[i][j] + matrizA[j][i];
				}
			}

			for(i=0; i<fA; i++){
				for(j=0; j<cB; j++){
					salidaC = salidaC + matrizC[i][j] + "   ";
				}
				salidaC = salidaC + ("\n");
			}
		}else{
			JOptionPane.showMessageDialog(null,"Las matrices no son multiplicables");
		}

		JOptionPane.showMessageDialog(null,"[A]*[B] = [C]\n"+salidaC);
	} //Fin de función main
} //Fin de clase tarea24