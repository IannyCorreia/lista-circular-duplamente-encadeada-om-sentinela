public class ListaDuplamenteEncadeada {
    private No sentinela;
    
    public ListaDuplamenteEncadeada() {
        this.sentinela = new No(0);
        this.sentinela.proximo = this.sentinela;
        this.sentinela.anterior = this.sentinela;
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);
        No atual = sentinela.proximo;

        while (atual != sentinela && atual.dado < valor) {
            atual = atual.proximo;
        }
        novoNo.proximo = atual;
        novoNo.anterior = atual.anterior;
        atual.anterior.proximo = novoNo;
        atual.anterior = novoNo;
    }

    public void antecessor() {
        No atual = sentinela.proximo;
        while (atual != sentinela) {
            System.out.print(atual.dado + ", ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void sucessor() {
        No atual = sentinela.anterior;
        while (atual != sentinela) {
            System.out.print(atual.dado + ", ");
            atual = atual.anterior;
        }
        System.out.println();
    }

    public int contarElementosLista() {
        int contador = 0;
        No atual = sentinela.proximo;
        while (atual != sentinela) {
            contador++;
            atual = atual.proximo;
        }
        return contador;
    }

    public boolean eNumPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void removerPrimos() {
        No atual = sentinela.proximo;
        while (atual != sentinela) {
            if (eNumPrimo(atual.dado)) {
                atual.anterior.proximo = atual.proximo;
                atual.proximo.anterior = atual.anterior;
            }
            atual = atual.proximo;
        }
    }

    public void imprimirSemPrimosDesordenado() {
        No atual = sentinela.proximo;
        while (atual != sentinela) {
            if (!eNumPrimo(atual.dado)) {
                System.out.print(atual.dado + ", ");
            }
            atual = atual.proximo;
        }
        System.out.println();
    }
}
