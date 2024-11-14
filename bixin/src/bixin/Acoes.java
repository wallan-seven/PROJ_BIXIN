package bixin;
import java.util.Scanner;

public class Acoes {

    private Bixin animal;
    private Scanner scanner;

    public Acoes() {
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("Bem-vindo ao Jogo do Bichinho Virtual!");
        criarAnimal();
        while (animal.isVivo()) {
            mostrarMenu();
            int escolha = scanner.nextInt();
            executarAcao(escolha);
        }
        System.out.println("Jogo encerrado. " + animal + " se foi.");
    }

    private void criarAnimal() {
        System.out.println("Digite o nome do animal:");
        String nome = scanner.next();
        System.out.println("Digite a classe do animal:");
        String classe = scanner.next();
        System.out.println("Digite a família do animal:");
        String familia = scanner.next();
        animal = new Bixin(nome, classe, familia);
    }

    private void mostrarMenu() {
        System.out.println("\nEscolha uma ação:");
        System.out.println("1 - Comer");
        System.out.println("2 - Correr");
        System.out.println("3 - Dormir");
        System.out.println("4 - Sair");
    }

    private void executarAcao(int escolha) {
        switch (escolha) {
            case 1 -> animal.comer();
            case 2 -> animal.correr();
            case 3 -> animal.dormir();
            case 4 -> {
                animal.morrer();
                System.out.println("Encerrando o jogo...");
            }
            default -> System.out.println("Opção inválida. Tente novamente.");
        }
    }

}



