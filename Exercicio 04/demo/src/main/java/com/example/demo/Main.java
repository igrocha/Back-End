package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {


		GeradorJogador gerador = new GeradorJogador();
		gerador.atualizaListas();

		for (int i = 0; i < 10; i++) {
			Jogador jogador = gerador.geraJogador();
			System.out.println(jogador.toString());
		}
	}
}
