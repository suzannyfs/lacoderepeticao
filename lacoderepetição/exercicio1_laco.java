package lacoderepetição;
import javax.swing.JOptionPane;

public class exercicio1_laco {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {

        if (i % 2 != 0) {

        JOptionPane.showMessageDialog(null," Números Ímpares: " + i);
        }
        }
    }
}
