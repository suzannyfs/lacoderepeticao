package lacoderepetição;
import javax.swing.JOptionPane;

public class exercicio3_laco { 

    public static void main(String[] args) {

        int num; 

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Valor: "));
        
        for(int i = 0; i<= 10; i++) {
            
        JOptionPane.showMessageDialog(null, "Resultado: "+ num + " x " + i + " = "+ (num*i));

        }

    }
}