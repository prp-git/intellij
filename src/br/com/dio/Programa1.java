package br.com.dio;

import br.com.dio.model.Animal;

public class Programa1 {

    public static void main(String[] args) {

        Animal animal = new Animal();

        Veterinario vet = new Veterinario();

        System.out.println(animal);
        System.out.println(vet);

        Livro livro = new Livro("Amanhã será outro dia", 300);

        System.out.println(livro);

        /*
         * int a = 3; int b = 3; System.out.println("w " +(a+b));
         */
    }

}

class Veterinario {
    private String nome;
    private String telefone;
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
