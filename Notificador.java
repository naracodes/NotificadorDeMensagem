package br.com.ada.polotech925;
import java.util.*;

public class Notificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> mapNotificacao = new HashMap<String, String>();
        int i = 0;
        int quantidadePessoas = 1;

        System.out.println("Digite o numero de pessoas que irá receber a notificação: ");

        while(quantidadePessoas != 0){
            quantidadePessoas = scanner.nextInt();
            scanner.nextLine();

            String[] nome = new String[quantidadePessoas];

            System.out.println("Digite os nomes: ");
            while (i < quantidadePessoas) {
                nome[i] = scanner.nextLine();
                i++;
            }
            System.out.println("Digite a mensagem");
            String mensagem = scanner.nextLine();

            i=0;
            while (i < quantidadePessoas) {
                mapNotificacao.put(nome[i], new String(mensagem));
                i++;
            }

            /*
             * O método "keySet()" retorna um Set com todas as chaves do
             * nosso HashMap, e tendo o Set com todas as Chaves,
             * podemos facilmente pegar
             * os valores que desejamos
             * */

            for (String key : mapNotificacao.keySet()) {
                //Capturamos o valor a partir da chave
                String value = mapNotificacao.get(key);
                System.out.println(key + " received a mensagem -> " + value);
            }
            mapNotificacao.clear();
            System.out.println();
            System.out.println("Digite o numero de pessoas que irá receber a notificação: ");
            quantidadePessoas = scanner.nextInt();
        }
    }
}
