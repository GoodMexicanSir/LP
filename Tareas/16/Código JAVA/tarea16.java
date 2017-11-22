/*	
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
*/

import javax.swing.JOptionPane;
public class tarea16{
	public static void main (String[] args){
		String entrada;
		String[] options={"L1","L2","L3","L4","L5","L6","Cancelar"};
		int can=0, ven=0, op=0, l1=300, l2=450, l3=550, l4=670, l5=800, l6=1200,
					 			canT1=0, canT2=0, canT3=0, canT4=0, canT5=0, canT6=0;	

		do{
			int cla = JOptionPane.showOptionDialog(null,"Selecciona el tipo de localidad deseado:\n L1 = $300\n L2 = $450\n L3 = $550\n L4 = $670\n L5 = $800\n L6 = $1200","Localidades",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);

			switch(cla){
				case 0:
					entrada = JOptionPane.showInputDialog("Ingrese la cantidad de boletos deseados: ");
					can = Integer.parseInt(entrada);
					ven = can*l1;
					canT1 = canT1 + can;
					break;
				case 1:
					entrada = JOptionPane.showInputDialog("Ingrese la cantidad de boletos deseados: ");
					can = Integer.parseInt(entrada);
					ven = can*l2;
					canT2 = canT2 + can;
					break;
				case 2:
					entrada = JOptionPane.showInputDialog("Ingrese la cantidad de boletos deseados: ");
					can = Integer.parseInt(entrada);
					ven = can*l3;
					canT3 = canT3 + can;
					break;
				case 3:
					entrada = JOptionPane.showInputDialog("Ingrese la cantidad de boletos deseados: ");
					can = Integer.parseInt(entrada);
					ven = can*l4;
					canT4 = canT4 + can;
					break;
				case 4:
					entrada = JOptionPane.showInputDialog("Ingrese la cantidad de boletos deseados: ");
					can = Integer.parseInt(entrada);
					ven = can*l5;
					canT5 = canT5 + can;
					break;
				case 5:
					entrada = JOptionPane.showInputDialog("Ingrese la cantidad de boletos deseados: ");
					can = Integer.parseInt(entrada);
					ven = can*l6;
					canT6= canT6 + can;
					break;
				case 6:
					System.exit(0);
					break;
				default:
				break;
			}
			JOptionPane.showMessageDialog(null,"Total de la compra:\n$"+ven);
			op = JOptionPane.showConfirmDialog(null,"Desea comprar otra localidad?","Opcion", JOptionPane.YES_NO_OPTION);
		}while(op == 0);
		op = canT1*l1 + canT2*l2 + canT3*l3 + canT4*l4 + canT5*l5 + canT6*l6;
		JOptionPane.showMessageDialog(null,"Total de boletos vendidos:\nL1 = "+canT1+"\nL2 = "+canT2+"\nL3 = "+canT3+"\nL4 = "+canT4+"\nL5 = "+canT5+"\nL6 = "+canT6);
		JOptionPane.showMessageDialog(null,"Recaudacion total = $"+op);
	} //Fin de función main
} //Fin de clase tarea16