package br.com.ada.polotech925;
import java.util.*;

public class Notificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> mapNotificacao = new HashMap<String, String>();
        int i = 0;
        int quantidadePessoas = 1;

        while(quantidadePessoas != 0){
            System.out.println();
            System.out.println("Digite o numero de pessoas que irá receber a notificação: ");
            quantidadePessoas = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite a mensagem");
            String mensagem = scanner.nextLine();

            System.out.println("Digite os nomes: ");
            while (i < quantidadePessoas) {
                String nome = scanner.nextLine();
                mapNotificacao.put(nome, new String(mensagem));
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
        }
    }
}
