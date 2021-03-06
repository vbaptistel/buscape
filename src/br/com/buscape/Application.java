package br.com.buscape;

import java.util.Scanner;

/**
 * Aplicação para movimentar um {@link Submarine} com comandos para girar e mover
 * 
 * @author viniciusbaptistel
 *
 */
public class Application {

	public static void main(String[] args) throws InterruptedException {
		String commandos = "Comandos permitidos: \nL (gira esquerda) \nR (gira direita) \nM (ir pra frente) \nD (descer) \nU (subir)";

		System.out.println("                   _	");
		System.out.println("   .         _____|___");
		System.out.println("  .      ___/  o o o  \\__");
		System.out.println("  .     /    ---------    \\");
		System.out.println("   .   |     ---------     |");
		System.out.println("     8-=\\_________________/\n");
		System.out.println("Seja bem-vindo à exploração não tripulada ao fundo do mar!!!");
		System.out.println(commandos + "\n");
		
		Scanner scanner = new Scanner(System.in);
		
		Submarine sub = new Submarine();
		
		while (true) {
			System.out.print("Digite um comando (0 para sair): ");
			String input = scanner.nextLine();
			
			if ("0".equals(input)) {
				break;
			}
			
			try {
				sub.move(input);
				System.out.println(sub.getLocalization());
			} catch (RuntimeException e) {
				System.out.println("Comando não encontrado :-(");
				System.out.println(commandos);
			}
			System.out.println("");
		}
		
		System.out.print("\n\nDesligando sistema subaquatico");
		
		for (int i = 0; i < 5; i++) {
			Thread.sleep(700);
			System.out.print(".");
		}
		System.out.print(" Good bye :-)");

		scanner.close();
	}

}
