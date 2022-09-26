import java.util.Scanner;

public class FIbonaci {
    public  static  void  main ( String [] args ){

        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos termos deseja vizualizar da serie de Fibonnaci");

        int numeroFibo = ler.nextInt();

        int  num1 = 1 , num2 = 0 ;

        System.out.println ( num2 );
        System.out.println ( num1 );

        for ( int  i = 0 ; i < numeroFibo ; i ++){
            num1 = num1 + num2 ;
            num2 = num1 - num2 ;
            System.out.println ( num1 );
        }
    }


}
