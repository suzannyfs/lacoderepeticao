import javax.swing.JOptionPane;

public class questao_12_macas {
    
    public static void main(String[] args) {

        float qtdmacas, mduzia, duzia;

        qtdmacas = Float.parseFloat(JOptionPane.showInputDialog("Quantas maçãs você comprou: "));

        float x = 0.30f;
        float y = 0.25f;

        if (qtdmacas < 12) {
            mduzia = (qtdmacas*x);
            JOptionPane.showMessageDialog(null, "O valor da compra é R$ " + mduzia);           
        } else {
            duzia = (qtdmacas*y);
            JOptionPane.showMessageDialog(null, "O valor da compra é R$ " + duzia);
        }
      }
}
