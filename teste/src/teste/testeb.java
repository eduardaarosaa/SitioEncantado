package teste;
import javax.swing.*;

public class testeb {
	public static void main(String args[]){
	int hora;
	hora = Integer.parseInt(JOptionPane.showInputDialog("Digite uma hora"));
	if(hora==6 && hora <=12){
		
		JOptionPane.showMessageDialog(null,"Bom dia");
	}else if(hora >=13 && hora <=18){
		JOptionPane.showMessageDialog(null,"Boa tarde");
		
	}else if(hora>=19 && hora<=24 || hora ==0 ){
		JOptionPane.showMessageDialog(null,"Boa noite");
		
	}else if(hora>=1 && hora <=5){
		JOptionPane.showMessageDialog(null,"Boa madrugada");

}else{
	JOptionPane.showMessageDialog(null,"Hora inválida");
}
	}
}

