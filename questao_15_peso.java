import javax.swing.JOptionPane;

public class questao_15_peso {

    public static void main(String[] args) {

        Double altura;

        Object[] lssexo = { "Feminino", "Masculino" };
        Object sexo = JOptionPane.showInputDialog(null, "Informe o sexo? ",
                "Informe o sexo", JOptionPane.INFORMATION_MESSAGE, null, lssexo, lssexo[0]);
        JOptionPane.showMessageDialog(null, "O sexo informado foi: " + sexo);

        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));

        if (sexo.equals("Feminino")) {
            Double Fem = ((62.1*altura)-44.7);
            JOptionPane.showMessageDialog(null, "O seu peso ideal é: " + Fem);
        } else {
            Double Masc = ((72.7*altura)-58);
            JOptionPane.showMessageDialog(null, "O seu peso ideal é: " + Masc);
        }   
    }

}