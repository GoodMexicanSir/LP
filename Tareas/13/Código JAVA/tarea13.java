/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea13{
	public static void main (String[] args){
		String entrada;
		String serie = "";
		int n,i,x=0,y=2,z=1,a=0,b=-3,c=2;

		entrada = JOptionPane.showInputDialog("Ingrese el numero de terminos: ");
		n = Integer.parseInt(entrada);

		if(n>0){
			serie = serie + "2";

			for(i=1; i<n; i++){
				serie = serie + ", ";
				if(z==0){
					c = c + 2;
					serie = serie + c;

					if(x<a){
						x++;
					}else{
						z = 1;
						x = 0;
					}
				}else if(z==1){
					serie = serie + b;
					b = b - 2;
					if(x<y){
						x++;
					}else{
						z = 0;
						x = 0;
						a++;
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null,serie);
	} //Fin de función main
} //Fin de clase tarea13