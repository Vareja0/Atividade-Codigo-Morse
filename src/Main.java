void main() {
    int ct = 0;
    Scanner sc = new Scanner(System.in);
    Arvore av = new Arvore();

    av.inserir(".-", "A");
    av.inserir("-...", "B");
    av.inserir("-.-.", "C");
    av.inserir("-..", "D");
    av.inserir(".", "E");
    av.inserir("..-.", "F");
    av.inserir("--.", "G");
    av.inserir("....", "H");
    av.inserir("..", "I");
    av.inserir(".---", "J");
    av.inserir("-.-", "K");
    av.inserir(".-..", "L");
    av.inserir("--", "M");
    av.inserir("-.", "N");
    av.inserir("---", "O");
    av.inserir(".--.", "P");
    av.inserir("--.-", "Q");
    av.inserir(".-.", "R");
    av.inserir("...", "S");
    av.inserir("-", "T");
    av.inserir("..-", "U");
    av.inserir("...-", "V");
    av.inserir(".--", "W");
    av.inserir("-..-", "X");
    av.inserir("-.--", "Y");
    av.inserir("--..", "Z");


    av.inserir("-----", "0");
    av.inserir(".----", "1");
    av.inserir("..---", "2");
    av.inserir("...--", "3");
    av.inserir("....-", "4");
    av.inserir(".....", "5");
    av.inserir("-....", "6");
    av.inserir("--...", "7");
    av.inserir("---..", "8");
    av.inserir("----.", "9");

    int resposta;
    String resposta2;

    while (ct == 0){
        System.out.println("[1] Buscar");
        System.out.println("[2] Remover");
        System.out.println("[3] Printar Arvore");
        System.out.println("[9] Sair");
        resposta = sc.nextInt();sc.nextLine();

        if (resposta == 1){
            System.out.println("Digite o codigo separando por espaço:");
            resposta2 = sc.nextLine();
            String[] resultado = countString(resposta2);
            for (int i = 0; i < resultado.length; i++){
                // System.out.println(resultado[i] + " = " + av.buscar(resultado[i]));
                System.out.print(av.buscar(resultado[i]));

            } System.out.println();
        } else if (resposta == 2){
            System.out.println("Digite o codigo:");
            resposta2 = sc.nextLine();
            System.out.println("Letra removida: " + av.remover(resposta2));
        } else if (resposta == 3){
            av.printarArvore();
        } else if (resposta == 9){
            ct = 1;
        } else {
            System.out.println("Digite uma opçao valida");
        }

    }
}

public String[] countString(String string){
    int tamanho = string.length();
    char atual;
    int quantidade = 0;
    String soma = "";
    int cont = 0;


    for (int i = 0; i < tamanho; i++){
        atual = string.charAt(i);
        if (atual == ' '){
            quantidade++;
        }
    }

    String[] resultado = new String[quantidade + 1];

    for (int i = 0; i < tamanho; i++){
        atual = string.charAt(i);
        if (atual == ' '){
            resultado[cont] = soma;
            cont++;
            soma = "";
        }
        else {
            soma += atual;
        }
    }
    resultado[cont] = soma;

    return resultado;
}
