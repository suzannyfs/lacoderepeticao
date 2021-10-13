import javax.swing.JOptionPane;

public class exemplo_JOPane {

    public static void main(String[] args) {



    String nome = JOptionPane.showInputDialog("Digite seu nome");
    String temp = JOptionPane.showInputDialog("Digite sua idade");
    int idade = Integer.parseInt(temp);
    String msg = "";

    if(idade >=18){
    msg = ". Você é maior de idade";
    } else{
        msg = ". Você é menor de idade";

    }
    JOptionPane.showMessageDialog(null, "Bem vindo, " + nome + msg);
    }
}