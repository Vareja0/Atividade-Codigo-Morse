public class Arvore {
    Node raiz;
    
    public Arvore(){
        this.raiz = new Node(null, null);
    }
    
    public void inserir(String codigo, String letra){
        int tamanhoCodigo = codigo.length();
        Node atual = raiz;
        String soma = "";

        for (int i = 0; i < tamanhoCodigo; i++){
            char charAtual = codigo.charAt(i);
            soma += charAtual;

            if (charAtual == '-'){
                if (atual.direita == null){
                    atual.direita = new Node(null, soma);
                }
                atual = atual.direita;
            }
            else if (charAtual == '.'){
                if (atual.esquerda == null){
                    atual.esquerda = new Node(null, soma);
                }
                atual = atual.esquerda;
            }
        }

        atual.letra = letra;
        atual.codigoMorse = codigo;
    }

    public String buscar(String codigo){
        int tamanhoCodigo = codigo.length();
        Node atual = raiz;

        for (int i = 0; i < tamanhoCodigo; i++){
            char charAtual = codigo.charAt(i);


            if (atual == null){
                System.out.println("codigo invalido");
                return null;
            }
            else if (charAtual == '-'){
                atual = atual.direita;
            }
            else if (charAtual == '.'){
                atual = atual.esquerda;
            }
        }

        return atual.letra;
    }

    public void printarArvore() {
        printarArvoreRec(raiz, 0);
    }


    private void printarArvoreRec(Node atual, int nivel) {
        if (atual == null) return;

        printarArvoreRec(atual.direita, nivel + 1);

        for (int i = 0; i < nivel; i++) {
            System.out.print("         ");
        }

        if (atual == this.raiz) System.out.println("start");
        else if (atual.letra == null) System.out.println("| " + "*" + " |");
        else System.out.println("| " + atual.letra + " |");


        printarArvoreRec(atual.esquerda, nivel + 1);
    }

    public String remover(String codigo){
        Node atual = raiz;
        int tamanhoCodigo = codigo.length();
        char charAtual;

        for (int i = 0; i < tamanhoCodigo; i++){
            charAtual = codigo.charAt(i);

            if (atual == null){
                System.out.println("codigo invalido");
                return null;
            }
            else if (charAtual == '-'){
                atual = atual.direita;
            }
            else if (charAtual == '.'){
                atual = atual.esquerda;
            }
        }

        String retornar = atual.letra;
        atual.letra = null;
        atual.codigoMorse = null;

        return retornar;
    }
}
