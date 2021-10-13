package lacoderepetição;
import javax.swing.JOptionPane;
 
public class exercicio6_laco {
     
    public static void main(String[] args) {    
        int numprimo;
        int numdivisor = 0;
        
        numprimo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));

        for(int i = 1; i <= numprimo; i++){
            if(numprimo % i == 0){
                numdivisor++;
            }
        }

        if(numdivisor == 2){
            JOptionPane.showMessageDialog(null, "O número " + numprimo + " é primo.", "Messagem", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numprimo + " não é primo.", "Messagem", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
