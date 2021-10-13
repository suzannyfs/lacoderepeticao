import javax.swing.JOptionPane;

public class questao_9_media {

    public static void main(String[] args) {

        float nota1, nota2, media;

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 1ª nota:"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a 2ª nota:"));

        media = (nota1+nota2)/2;

        JOptionPane.showMessageDialog(null, "A média é " + media);


    }
}    