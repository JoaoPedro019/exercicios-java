package exercicios;

import java.util.Scanner;
// Cálculo de Saldo Atual com Tipos Primitivos
public class ValidaTransacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoInicial = scanner.nextDouble();

         double trasacao1 = entrada(scanner);
         double trasacao2 = entrada(scanner);
         double trasacao3 = entrada(scanner);
         
         double saldoFinal = trasacao1 + trasacao2 + trasacao3 + saldoInicial;
        
        System.out.println(saldoFinal);

        scanner.close();
    }
    
    public static double entrada(Scanner scanner){    
    	return scanner.nextDouble();
    }
}
