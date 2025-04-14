package exemplos;

import javax.swing.JOptionPane;

public class LeituraGrafico {

	public static void main(String[] args) {
		String num1=	JOptionPane.showInputDialog("Número1: ");
		String num2=	JOptionPane.showInputDialog("Número2: ");
		
		double numero1 = Double.parseDouble(num1);
		double numero2 = Double.parseDouble(num2);
		
		JOptionPane.showMessageDialog(null,  "Resultado" + (numero1+numero2)/2);
	}

}
