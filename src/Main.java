import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Bem-vindo aos exercícios 1 a,b,c,d,e,f,g,h do TP3 de Java. Os exercícios estão colocados em sequência. \n Digite qualquer tecla para continuar ...");
        String entradaMenu = scanner.next();

        System.out.println("1-) Faça um programa que a partir de uma String digitada pelo usuário imprima: \n");
        System.out.println("Digite a string a ser usada no exercício 1: ");
        String entradaEx1 = scanner.next();

        System.out.println("\n a) O número de caracteres da string. \n");
        System.out.println(RespostaEx1A(entradaEx1));

        System.out.println("\n b) A string com todas suas letras em maiúsculo. \n");
        System.out.println(RespostaEx1B(entradaEx1));

        System.out.println("\n c) O número de vogais da string. \n");
        System.out.println(ContarVogais.RespostaEx1C(entradaEx1));

        System.out.println("\n d) Se a string digitada começa com 'INF'. \n");
        System.out.println(RespostaEx1D(entradaEx1));

        System.out.println("\n e)  Se a string digitada termina com 'NET'. \n");
        System.out.println(RespostaEx1E(entradaEx1));

        System.out.println("\n f)  f) O número de dígitos (0 a 9) da string. \n");
        System.out.println(ContarDigitos.RespostaEx1F(entradaEx1));

        System.out.println("\n g)  Os 2 primeiros digitos da String. \n");
        System.out.println(RespostaEx1G(entradaEx1));

        System.out.println("\n h) Se a string é um palíndromo ou não. \n");
        System.out.println(Palindromo.RespostaEx1H(entradaEx1));

        scanner.close();
    }
    public static String RespostaEx1A(String userString)
    {
        int resposta = userString.length();
        return "Resposta: " + resposta;
    }

    public static String RespostaEx1B(String userString)
    {
        return "Resposta: " + userString.toUpperCase();
    }

    public class ContarVogais
    {
        public static String RespostaEx1C(String userString)
        {
            int cont = 0;
            String texto = userString.toLowerCase();

            for(int i = 0; i < userString.length(); i++)
            {
                char caracter = texto.charAt(i);
                cont += (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') ? 1 : 0;
            }
            return "Resposta: " + cont;
        }
    }

    public static String RespostaEx1D(String userString)
    {
        String textoComparativo = "inf";

        if(userString.length() <= 2)
        {
            return "Resposta: Não.";
        }
        else if(textoComparativo.equalsIgnoreCase(userString.substring(0,3)))
        {
            return "Resposta: Sim.";
        }
        else
        {
            return "Resposta: Não.";
        }
    }

    public static String RespostaEx1E(String userString)
    {

        if(userString.length() <= 2)
        {
            return "Resposta: Não.";
        }
        else if(userString.toUpperCase().endsWith("NET"))
        {
            return "Resposta: Sim .";
        }
        else
        {
            return "Resposta: Não.";
        }
    }

    public class ContarDigitos
    {
        public static String RespostaEx1F(String userString)
        {
            int cont = 0;

            for (int i = 0; i < userString.length(); i++) {
                char caracter = userString.charAt(i);
                if (Character.isDigit(caracter)) {
                    cont++;
                }
            }
            return "Resposta: " + cont;
        }
    }

    public static String RespostaEx1G(String userString)
    {
        String retorno = userString.substring(0,2);
        return "Resposta: " + retorno;
    }

    public class Palindromo
    {
        public static String RespostaEx1H(String userString)
        {
            String textoTratado =  userString.toLowerCase();

            int startLoop = 0;
            int endLoop = textoTratado.length() - 1;

            while( startLoop < endLoop)
            {
                if(textoTratado.charAt(startLoop) != textoTratado.charAt(endLoop))
                {
                    return "Resposta: Não é palíndromo.";
                }
                startLoop ++;
                endLoop --;
            }

            return "Resposta: É palíndromo";

        }
    }
}