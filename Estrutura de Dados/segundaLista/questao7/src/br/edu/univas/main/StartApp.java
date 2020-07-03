package br.edu.univas.main;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import br.edu.univas.vo.Jogo;

public class StartApp {
	public static void main(String[] args) {
		Jogo partida = new Jogo();
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		ArrayList mortos = new ArrayList<>();
		
		for(int i = 0; i < 20; i++) {
			partida.getInimigos().add(i+1);	
		}
		
		int option = 1;
		
		while(option != 0) {
			System.out.println("=====================");
			System.out.println("1 - JOGAR.");
			System.out.println("2 - Verificar inimigos vivos.");
			System.out.println("3 - Verificar inimigos mortos.");
			System.out.println("0 - Fim de Jogo.");
			System.out.println("=====================");
			option = scanner.nextInt();
			
			switch(option) {
				case 1:
					int r1 = random.nextInt(19+1);
					if(mortos.contains(r1)) {
						System.out.println("O inimigo já foi eliminado!");
					}else {
						System.out.printf("Inimigo %d Eliminado!\n", r1);
						mortos.add(r1);
						partida.getInimigos().set(r1-1, "x");
						break;
					}

				case 2:
					System.out.println("Inimigo vivos em posição:");
					System.out.println(partida.getInimigos());
					break;
				case 3:
					System.out.println("Inimigos derrotados!");
					System.out.println(mortos);
					break;
			}
			
			if(option == 0) {
				break;
			}
		}
	}
}
