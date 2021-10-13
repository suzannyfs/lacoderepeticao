package lacoderepetição;
import javax.swing.JOptionPane;

public class exercicio5_laco {

    public static void main(String[] args) {

        int numero;
    
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        long fatorial = 1;
        int i = 1;

        while (i <= numero) {
            fatorial = fatorial * i;
            i++;
        }

        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fatorial);

    }
}