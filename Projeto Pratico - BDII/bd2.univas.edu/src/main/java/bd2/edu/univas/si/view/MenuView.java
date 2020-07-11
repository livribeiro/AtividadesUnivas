package bd2.edu.univas.si.palestrante.view;

import java.util.Scanner;

public class MenuView {
    public int mostrarMenuOpcoes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção");
        System.out.println("-------------------------\n");
        System.out.println("1 - Inserir Palestrante");
        System.out.println("2 - Atualizar Palestrante");
        System.out.println("3 - Apagar Palestrante");
        System.out.println("4 - Listar todos os palestrantes");
        System.out.println("5 - Pesquisar palestrante pelo nome");
        System.out.println("6 - Pesquisar palestrante pelo cpf");
        System.out.println("20 - Quit");

        System.out.println("-------------------------\n");

        System.out.print("Digite a opção escolhida: ");
        return scanner.nextInt();
    }

    public void tratarOpcaoEscolhida(int opcao) {
        PalestranteView palestranteView = new PalestranteView();
        switch (opcao) {
            case 1:
                palestranteView.criarPalestrante();
                break;
            case 2:
                // Perform "encrypt number" case.
                break;
            case 3:
                // Perform "decrypt number" case.
                break;
            case 4:
                // Perform "quit" case.
                break;
            default:
                System.out.print("Opção inválida!");
        }
    }
}
