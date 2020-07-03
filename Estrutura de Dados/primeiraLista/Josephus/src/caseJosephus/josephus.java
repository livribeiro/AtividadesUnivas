package caseJosephus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class josephus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o numero de pessoas: ");
		int pessoa = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Inicio: ");
		int iniciar = scanner.nextInt();
		
		System.out.println("Pular: ");
		int passar = scanner.nextInt();
		scanner.nextLine();
		ArrayList<String> nomes = new ArrayList();
		
		System.out.println("Insira os nomes: ");
		for(int i = 0; i < pessoa; i++) {
			nomes.add(scanner.nextLine());
		}
		
		
		List<Integer> result;
		
		System.out.println(result = josephus(nomes.size(), passar, iniciar));                    
        System.out.printf("Parabens %s, você pode pegar o cavalo.", nomes.get(result.size() - 1));  
		
	}
	
	static List<Integer> josephus(int N, int parar, int rodar)
    {
        if (N < 1 || parar < 1 || rodar < 1) return null;

        List<Integer> p = new LinkedList<Integer>();
        for (int i = 0; i < N; i++)
            p.add(i+1);

        List<Integer> r = new LinkedList<Integer>();
        int i = (rodar - 2) % N;
        for (int j = N; j > 0; j--) {
            i = (i + parar) % N--;
            r.add(p.remove(i--));
        }

        return r;
    }
		
	}

