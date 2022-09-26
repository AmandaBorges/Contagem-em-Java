import java.util.Scanner;

public class Contagem {
//    Contagem: Dado um valor N números de entrada em um conjunto de dados, conte quantos valores inteiros existem, neste
//    conjunto de dados, entre o primeiro dado (inclusive) e N (inclusive).

    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println( "Informe o total de números que você deseja digitar : ");
        int n =  ler.nextInt();

 //armazenamento dos valores pedidos igual a N

        String [] valores = new String [n];

        System.out.println( "Insira os valores : ");
        for(int i = 0; i< valores.length; i++){
            Scanner ler2 = new Scanner(System.in);
            valores[i] = ler2.nextLine();
        }
        int contadorInteiros = 0;
        for(int i = 0; i< valores.length; i++){
            if (isInteger(valores[i])) {
                contadorInteiros++;
            }
        }

        System.out.println("Foram inseridos um total de inteiros de: " + contadorInteiros);
    }

    private static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }

}
