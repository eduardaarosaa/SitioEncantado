package teste;
import javax.swing.*;

public class testec {
	public static void main(String  args []){
		int valor;
		valor=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 1 a 7"));
		switch (valor) {
		case 1:
			JOptionPane.showMessageDialog(null, "Domingo");
			
			break;
		case 2: 
			
			JOptionPane.showMessageDialog(null, "Sábado");
			break;
		case 3: 
			
			JOptionPane.showMessageDialog(null, "Segunda");
			break;
		case 4: 
			
			JOptionPane.showMessageDialog(null, "Terça");
			break;
		case 5: 
			
			JOptionPane.showMessageDialog(null, "Quarta");
			break;
		case 6: 
			
			JOptionPane.showMessageDialog(null, "Quinta");
			break;
		case 7: 
			
			JOptionPane.showMessageDialog(null, "Sexta");
			break;

		default:
			JOptionPane.showMessageDialog(null,"Valor inválido");
			break;
		}
	}

}
