import javax.swing.JOptionPane;

   public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        // 3-)Faça um algoritmo para ler dois valores, armazenar em variáveis, e exibir os valores das variáveis, trocados.
    String palavra1= JOptionPane.showInputDialog("valor1");
    String palavra2= JOptionPane.showInputDialog("valor2");
    String palavra3="";
 palavra3=palavra1;
 palavra1=palavra2;
 palavra2=palavra3;


    System.out.println(palavra1);
    System.out.println(palavra2);}

}
