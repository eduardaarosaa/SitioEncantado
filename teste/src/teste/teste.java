package teste;
import javax.swing.*;
public class teste {
	public static void main(String args[]){
		int n1,n2,media;
		
		n1=Integer.parseInt(JOptionPane.showInputDialog("Digite uma nota"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outra nota"));
		media = (n1+n2)/2;
		
		if (media>=6){
			JOptionPane.showMessageDialog(null, "Aprovado!");
		}else if(media >=3 && media <6){
			JOptionPane.showMessageDialog(null,"Recuperação!");
		}else{
			JOptionPane.showMessageDialog(null,"Reprovado");
		}
	}
}
