import javax.swing.JOptionPane;
public class Exercicio9 {
    public static void main(String[] args) throws Exception{
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:"));
        int resultado;
        int i = 0;
        while(i<=10){
        resultado=numero*i;
        i=i+1;
        System.out.println(resultado);
        }
    }
}
