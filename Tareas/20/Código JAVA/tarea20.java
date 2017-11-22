/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea20{
	public static void main (String[] args){
		String entrada;
		int i, n,sum=0, prom=0, c =0, m=0;
		double por=0.0;

		entrada = JOptionPane.showInputDialog(null,"Ingrese la cantidad de alumnos:");
		n = Integer.parseInt(entrada);
		int[] vector = new int[n];

		for(i=0; i<n; i++){
			entrada = JOptionPane.showInputDialog(null,"Calificacion aprobatoria >= 1300\n\nIngrese la calificacion del alumno: "+(i+1));
			vector[i] = Integer.parseInt(entrada);
		}

		for(i=0; i<n; i++){
			sum = sum + vector[i];
			if(vector[i]>=1300){
				c = c + 1;
				if(vector[i]>=1500){ m = m + 1;}
			}
		}
		prom = sum/n;
		por = (c*100)/n;

		JOptionPane.showMessageDialog(null,"Promedio general del grupo: "+prom+"\nPorcentaje de alumnos aprobados: "+por+"%\nNumero de alumnos cuya calificacion es mayor o igual a 1500: "+m);
	} //Fin de función main
} //Fin de clase tarea20