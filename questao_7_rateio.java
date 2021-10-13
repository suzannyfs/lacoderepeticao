import javax.swing.JOptionPane;

public class questao_7_rateio {
    public static void main(String[] args) {


        float valorconta, rateio;
        int qtdpessoas;

        valorconta = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da conta:"));
        qtdpessoas = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas pessoas irão dividir a conta:"));

        rateio = valorconta / qtdpessoas;

        JOptionPane.showMessageDialog(null, "Cada pessoa paragá R$ " + rateio);

        }
}
