package lacoderepetição;
import javax.swing.JOptionPane;

public class exercicio7_laco {

        public static void main (String[] args) {

            String senha = JOptionPane.showInputDialog("Digite a palavra de acesso: ");

            int contador = 1;

            while(!senha.equals("Java-2021") && contador <=4 ) {

            senha = JOptionPane.showInputDialog("Numero de Tentativas Restantes: " + (5-contador), JOptionPane.ERROR_MESSAGE);
            contador++;
            }
            
            System.out.println();

            if(senha.equals("Java-2021")) {

            JOptionPane.showMessageDialog(null, " Acesso Concedido ", "Login", JOptionPane.INFORMATION_MESSAGE);
            
        } else{

            JOptionPane.showMessageDialog(null, " Acesso Negado ", "Alerta", JOptionPane.ERROR_MESSAGE);
            }
        
        
        }
            
}
