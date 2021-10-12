package com.example.m2_Testing_David_Sans_FullDep;

import com.example.m2_Testing_David_Sans_FullDep.repositories.PerroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class M2TestingDavidSansFullDepApplication implements CommandLineRunner {
	@Autowired
	PerroRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(M2TestingDavidSansFullDepApplication.class, args);
	}

	public void menuShow() {
		System.out.println("Bienvenidos a la APP del centro de Adopción: ");
		System.out.println("0- Salir: ");
		System.out.println("1- Crear nuevo registro: ");
		System.out.println("2- Modificar por Id: ");
		System.out.println("3- Buscar: ");
		System.out.println("4- Borrar por Id: ");
		System.out.println("5- Borrar todos los registros: ");
	}

	@Override
	public void run(String... args) throws Exception {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			menuShow();
			try {
				int opcion = scanner.nextInt();
				scanner.nextLine();

				if (opcion == 0) {
					System.out.println("Hasta la próxima");
					break;
				} else if (opcion == 1) {
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

