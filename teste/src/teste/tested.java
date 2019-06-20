package teste;
import javax.swing.*;

public class tested {
	public static void main(String args[]){
		
		String sigla;
		sigla = JOptionPane.showInputDialog("Digite uma sigla");
		switch (sigla.toUpperCase()) {
		case "SP" :
			JOptionPane.showMessageDialog(null,"São paulo");
			
			break;
		case "Rj":
			JOptionPane.showMessageDialog(null,"Rio de Janeiro");
			break;
		case "MG":
			JOptionPane.showMessageDialog(null,"Minas Gerais");
			break;
		case "ES":
			JOptionPane.showMessageDialog(null,"Espírito santo");
			
		default:
			JOptionPane.showMessageDialog(null,"Opção inválida!");
			break;
		}
	}

}
