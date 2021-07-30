import java.util.Scanner;

public class Exerciocio01 {

	public static void main(String[] args) {

		int cont = 0;
        int positivo = 0;;
        
       //continue a solucao de acordo com o solicitado no enunciado

        while (cont < 6 ) {
          
          Scanner leitor = new Scanner(System.in);
          
          double x = leitor.nextDouble();
                            
        	if ( x >= 0) {
        	  positivo++;
        	}
        	cont++;
          }	  
        System.out.println(positivo + " Valores positivos");
	}

}
