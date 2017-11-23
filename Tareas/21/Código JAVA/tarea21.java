/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea21{
	public static void main (String[] args){
		String entrada;
		int i, p=0, pro=0, mes=0, mayor=0, num=0;
		int[] vector = new int[12];

		String[] meses = new String[12];
		meses[0]="Enero"; meses[1]="Febrero"; meses[2]="Marzo"; meses[3]="Abril"; meses[4]="Mayo"; meses[5]="Junio";
		meses[6]="Julio"; meses[7]="Agosto"; meses[8]="Septiembre"; meses[9]="Octubre"; meses[10]="Noviembre"; meses[11]="Diciembre";

		for(i=0; i<12; i++){
			entrada = JOptionPane.showInputDialog(null,"Ingrese las toneladas de cereales producidas en:\n"+meses[i]);
			vector[i] = Integer.parseInt(entrada);
			p = p + vector[i];
		}
		pro = p/12;

		for(i=0; i<12; i++){
			if(vector[i]>pro){ mes = mes + 1; }

			if(vector[i]>mayor){
				mayor = vector[i];
				num = i;
			}
		}

		JOptionPane.showMessageDialog(null,"Promedio anual de toneladas cosechadas: "+pro+"\n"+mes+" meses tuvieron una cosecha superior al promedio\nMes de mayor produccion "+meses[num]+" con "+vector[num]+" toneladas");
	} //Fin de función main
} //Fin de clase tarea21