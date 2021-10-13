package lacoderepetição;
import javax.swing.JOptionPane;

public class exercicio2_laco {

    public static void main(String[] args) {
    
    int x = 30;

        do {
        JOptionPane.showMessageDialog(null, x);

        x = x - 1;
    }
        while(x >= 0);
    }
}        