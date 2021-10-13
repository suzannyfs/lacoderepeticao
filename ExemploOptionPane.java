import javax.swing.JOptionPane;

public class ExemploOptionPane {

    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null,"Você deseja continuar?",
        "Confirme", JOptionPane.YES_NO_OPTION);

        if(opcao == 0){
            JOptionPane.showMessageDialog(null,"Bem-Vindo","Alerta",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Até logo!","Alerta",JOptionPane.ERROR_MESSAGE);
        }
        
    }
}