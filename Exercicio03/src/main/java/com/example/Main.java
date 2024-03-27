package com.example;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Jogador jogador1 = context.getBean(Jogador.class, "silva", 26);

        ServiceJogador serviceJogador = context.getBean(ServiceJogador.class);
        ServiceJogador.listar(jogador1);

    }
}