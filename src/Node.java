public class Node {
    String letra;
    String codigoMorse;
    Node esquerda;
    Node direita;

    public Node(String letra, String codigoMorse){
        this.letra = letra;
        this.codigoMorse = codigoMorse;
        this.esquerda = null;
        this.direita = null;
    }
}
