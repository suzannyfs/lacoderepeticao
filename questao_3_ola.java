import javax.swing.JOptionPane;

public class questao_3_ola{
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe o seu nome: ");

        JOptionPane.showMessageDialog(null, "Olá, " + nome);
    }
}