import javax.swing.JOptionPane;

public class questao_10_eleicao {
    public static void main(String[] args) {

        int ano;
    
        ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu ano de nascimento: "));

        if (ano <= 2005) {
            JOptionPane.showMessageDialog(null, "Você poderá votar este ano! ");
        } else {
            JOptionPane.showMessageDialog(null, "Você NÃO poderá votar este ano! ");
        }

    }
    
}
