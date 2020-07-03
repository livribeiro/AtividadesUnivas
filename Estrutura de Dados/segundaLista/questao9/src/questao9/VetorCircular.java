package questao9;

import java.util.*;

public class VetorCircular {
	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> array = new ArrayList<>();

		int opcao = 0;
		int tArray = 5;
		int aux = 1;
	
		System.out.println("Insira os valores na lista.");
		for(int i = 0; i < tArray; i++) {
			array.add(scanner.nextInt());
			System.out.println(array);
		}
		
		
		
		
		
		while (opcao != 9) {
			System.out.println("1 - Modificar valores.");
			System.out.println("2 - Remover um valor.");
			System.out.println("9 - Sair.");
			opcao = scanner.nextInt();
			
			if(opcao == 1) {
				for(int i = 0; i < tArray; i++) {
					array.set(i, scanner.nextInt());
					System.out.println(array);
				}
				aux = 1;
			}else if(opcao == 2) {
				System.out.println("Valor " + array.get(tArray - 1) + " removido.");
				array.remove(tArray - aux);
				array.add(null);
				System.out.println(array);
				aux++;
			}
			
			

		}
	}

}
