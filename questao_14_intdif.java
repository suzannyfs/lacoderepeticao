import javax.swing.JOptionPane;

public class questao_14_intdif {
    public static void main(String[] args) {

        int numero1, numero2, numero3;
    
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º número: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 3º número: "));

        JOptionPane.showMessageDialog(null, "O maior número é: " + Math.max(Math.max(numero1, numero2), numero3));

    }
    
}