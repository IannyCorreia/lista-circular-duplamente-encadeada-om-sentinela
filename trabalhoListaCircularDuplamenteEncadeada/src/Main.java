import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] vetor = new int[1000];
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(19999) - 9999; 
        }

        System.out.println("Vetor => ");
        for (int num : vetor) {
            System.out.print(num + ", ");
        }
        System.out.println();
        System.out.println("Quantidade de elementos no vetor original: " + vetor.length);

        for (int num : vetor) {
            lista.inserir(num);
        }

        System.out.println("lista em ordem crescente => ");
        lista.antecessor();

        System.out.println("lista em ordem decrescente => ");
        lista.sucessor();

        System.out.println("Quantidade de elementos na lista: " + lista.contarElementosLista());

        System.out.println("lista sem números primos (desordenada) => ");
        lista.imprimirSemPrimosDesordenado();

        lista.removerPrimos();

        System.out.println("lista em ordem crescente após remover os números primos => ");
        lista.antecessor();

        System.out.println("lista em ordem decrescente após remover os números primos => ");
        lista.sucessor();

        System.out.println("Quantidade de elementos na lista após remover os números primos: " + lista.contarElementosLista());
    }
}
