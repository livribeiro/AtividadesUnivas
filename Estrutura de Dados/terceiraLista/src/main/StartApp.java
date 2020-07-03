package main;

import java.util.Scanner;

import vo.No;

public class StartApp {
	public static void main(String[] args) {
		
		int		opcao = 0;
		Scanner scan 		= new Scanner(System.in);
		No no = new No();
		
		do {
			System.out.println("---- PLAYER ----");
			System.out.println("1 - Play.		");
			System.out.println("2 - Stop.		");
			System.out.println("3 - Pause.		");
			System.out.println("4 - Forward.	");
			System.out.println("5 - Rewind.		");
			
			opcao = scan.nextInt();
			
			switch(opcao) {
				case Menu.PLAY:
					System.out.println("Reprosuzindo Musica:");
					System.out.println(no.getMusicas());
				break;
				case Menu.PAUSE:
					System.out.println("Música Pausada!");
				break;
				case Menu.FORWARD:
					System.out.println("Proxima música!");
					no.setProximo();
				break;
				case Menu.REWIND:
					System.out.println("Volta Música!");
					no.setAnterior();
					
				break;
			}
		}while(opcao != 2);
		
	}
}



