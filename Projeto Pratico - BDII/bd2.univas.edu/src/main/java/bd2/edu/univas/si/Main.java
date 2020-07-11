package bd2.edu.univas.si.palsestrante;

import bd2.edu.univas.si.palestrante.view.MenuView;

public class Main {

    public static void main(String[] args) {
        MenuView menu = new MenuView();
        int opcao = menu.mostrarMenuOpcoes();
        menu.tratarOpcaoEscolhida(opcao);
    }
}
