public class ExercicioMetodosEx{
    //2- Criar 1 metodo com retorno que monte uma frase com os valores que recebeu por parâmetros

    public static String texto (String primeiroTexto, String segundoTexto){
        String resultado = primeiroTexto +segundoTexto;
        return resultado;
    }                     

    public static void main(String[]args){
        String primeiroTexto = "Primeiro texto leitura";
        String segundoTexto = "Segundo texto concatena";
        System.out.println(texto(primeiroTexto, segundoTexto));
            }
    }