/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea12{
	public static void main (String[] args){
		String entrada;
		String serie = "";
		int n,i,j,a;

		entrada = JOptionPane.showInputDialog("Ingrese el numero de terminos: ");
		n = Integer.parseInt(entrada);

		for (i=0; i<n; i++){
			if(i%2==0){
				a = i;
				j = 0;
				while(i<n){
					if( j<a ){
						serie = serie+a+", ";
						i++;
						j++;
						JOptionPane.showMessageDialog(null,serie);

					}else{JOptionPane.showMessageDialog(null,"");}
				}
			}else{
				serie = serie+" -"+i+", ";
			}
		} //Fin del ciclo for
		JOptionPane.showMessageDialog(null,serie);
	} //Fin de función main
} //Fin de clase tarea12