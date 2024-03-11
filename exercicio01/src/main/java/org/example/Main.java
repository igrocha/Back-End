package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Main {

    public static void main(String[] args) throws Exception {

       /*Declarando variaveis e definindo aleatoriedade pelo site*/

        /*Declarando sobrenome  aleatorio*/
        String listaSobrenomes = retornaListaDaURI("https://venson.net.br/resources/data/sobrenomes.txt");
        String sobrenome = retornaIndiceAleatorio(listaSobrenomes);

        /*Declarando posição em campo  aleatoria*/
        String listaPosicoes = retornaListaDaURI("https://venson.net.br/resources/data/posicoes.txt");
        String posicao = retornaIndiceAleatorio(listaPosicoes);

        /*Declarando nome  aleatorio*/
        String listaNome = retornaListaDaURI("https://venson.net.br/resources/data/nomes.txt");
        String nome = retornaIndiceAleatorio(listaNome);

        /*Declarando clube de futebol  aleatorio*/
        String listaClubes = retornaListaDaURI("https://venson.net.br/resources/data/clubes.txt");
        String clube = retornaIndiceAleatorio(listaClubes);


        /*Não entendi muito bem a parte de como o professor colocou maior e menor ali e simplismente copiei*/

        int idade = geraNumeroAleatorio(17, 40);

        /* Parte do codigo que gerará a frase*/
        System.out.println(nome
                + " "
                + sobrenome
                + " é um futebolista brasileiro de " + idade + " anos que atua como "
                + posicao
                + ". Atualmente defende o "
                + clube
        );
    }

    public static int geraNumeroAleatorio(int menor, int maior) {
        int diferenca = maior - menor + 1;
        int aleatorio = (int) Math.floor(Math.random() * diferenca);
        return aleatorio + menor;
    }

    public static String retornaListaDaURI(String minhaUri) throws Exception{
        // Puxando o arquivo de texto usando HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(minhaUri)).build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String lista = response.body();
        return lista;
    }

    public static String retornaIndiceAleatorio(String stringao) {
        // Quebrando o texto em varias strings (colocando dentro de um vetor)
        String[] listaDeNomes = stringao.split("\n");
        // gera um numero aleatorio entre 0 e o tamanho do meu vetor - 1
        int indiceAleatorio = (int) Math.floor(Math.random() * listaDeNomes.length);
        return listaDeNomes[indiceAleatorio];
    }
}