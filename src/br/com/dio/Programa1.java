package br.com.dio;

import br.com.dio.model.Animal;

public class Programa1 {

    public static void main(String[] args) {

        Animal animal = new Animal();

        Veterinario vet = new Veterinario();

        System.out.println(animal);
        System.out.println(vet);

        /*
         * int a = 3; int b = 3; System.out.println("w " +(a+b));
         */
    }

}

class Veterinario {
    private String nome;
    private String telefone;
}
