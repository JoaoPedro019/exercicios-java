package exercicios;

import java.util.Scanner;

public class ClassificacaoClientes {
	private static final String NEGATIVADO = "Negativado";
	private static final String BAIXO = "Baixo";
	private static final String CONFORTAVEL = "Confortavel";
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
			String mensagem = valida(saldo);
			System.out.println(mensagem);
	
        scanner.close();
    }

	private static String valida(Double saldo) {
        if (saldo < 0) {
        	return NEGATIVADO;
		} else if (saldo >= 0 && saldo <= 500) {
        	return BAIXO;
		} else if (saldo > 500) {
        	return CONFORTAVEL;
		}
		return null;
	}
}
