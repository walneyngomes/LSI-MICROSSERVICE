package br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.alunos.alunosmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AlunosMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlunosMicroserviceApplication.class, args);
	}

}
