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
		int n,i,y=1,x=0,z=1,a=2;

		entrada = JOptionPane.showInputDialog("Ingrese el numero de terminos: ");
		n = Integer.parseInt(entrada);

		if(n>0){
			serie = serie + "-1";

			for(i=1; i<n; i++){
				serie = serie + ", ";
				if(z==0){
					serie = serie + (a*-1);
					z = 1;
					x = 0;
					a++;
				}else if(z==1){
					serie = serie + a;
					if(x<y){
						x++;
					}else{
						z = 0;
						a++;
						y++;
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null,serie);
	} //Fin de función main
} //Fin de clase tarea12