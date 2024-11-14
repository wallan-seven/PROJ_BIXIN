package bixin;

public class Bixin {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean vivo;
    private int caloria;
    private int forca;

    // Construtor
    public Bixin(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.vivo = true;
        this.caloria = 10;
        this.forca = 10;
    }

    // Getters e Setters
    public boolean isVivo() {
        return vivo;
    }

    public int getCaloria() {
        return caloria;
    }

    public int getForca() {
        return forca;
    }

    // Métodos do Animal
    public void comer() {
        if (vivo && caloria < 100) {
            caloria = Math.min(caloria + 10, 100);
            forca = Math.max(forca - 2, 0);
            System.out.println(nome + " comeu e ganhou calorias. Caloria: " + caloria + ", Força: " + forca);
        } else {
            System.out.println(nome + " não pode comer.");
        }
    }

    public void correr() {
        if (vivo && caloria > 0) {
            caloria = Math.max(caloria - 5, 0);
            forca = Math.max(forca - 5, 0);
            System.out.println(nome + " correu e gastou energia. Caloria: " + caloria + ", Força: " + forca);
            if (caloria == 0 || forca == 0) {
                morrer();
            }
        } else {
            System.out.println(nome + " não pode correr.");
        }
    }

    public void dormir() {
        if (vivo) {
            forca = Math.min(forca + 10, 100);
            caloria = Math.max(caloria - 2, 0);
            System.out.println(nome + " dormiu e recuperou força. Caloria: " + caloria + ", Força: " + forca);
        } else {
            System.out.println(nome + " não pode dormir.");
        }
    }

    public void morrer() {
        vivo = false;
        forca = 0;
        System.out.println(nome + " morreu.");
    }
}


