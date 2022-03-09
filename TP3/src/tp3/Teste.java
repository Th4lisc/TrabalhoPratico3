package tp3;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Teste {
	
	static int id = 0;
	
	public static void main(String[] args) {
		
		int opcao = 0;
		
		do {
			menu();	// Printa o menu
			opcao = opcao_validada();
			switchCase(opcao);
		} while (opcao != 5);
	}
	
	public static int opcao_validada () {							// Lê e valida a opcao escolhida
		boolean k;
		int opcao = 0;
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		try {
			opcao = leia.nextInt();	// Lê a opção
			k = true;
		} catch (java.util.InputMismatchException e) {		// Trata algum caracter indevido
			System.out.println("Entrada inválida, reinicie o programa");
			k = false;
		}
		
		if(k) {				// Retorna a opcao se for validada
			return opcao;
		} else {			// Retorna 0 se for invalida
			return 0;
		}
	}
	
	public static void menu() {
		println("===============================");
		println("=====Aluguel de bicicletas=====");
		println("===============================");
		println("1. Criar usuario");
		println("2. Alugar bicicleta");
		println("3. Registrar corrida");
		println("4. Procurar estação");
		println("5. Sair");
		println("===============================");
	}
	
	public static void switchCase(int opcao) {
		
		switch (opcao) {
			case 1:
				println("Digite o nome: ");
				String nome = palavraValidada();
				println("Digite o sobrenome: ");
				String sobrenome = palavraValidada();
				
				println("Digite o email: ");
				String email = palavraValidada();
				
				println("Digite o pais: ");
				String pais = palavraValidada();
				println("Digite o estado: ");
				String estado = palavraValidada();
				println("Digite o bairro: ");
				String bairro = palavraValidada();
				println("Digite o numero (Apenas numeros): ");
				long numero = numValidado();
				println("Digite o rua/quadra: ");
				String ruaQuadra = palavraValidada();
				println("Digite o cep (Apenas numeros): ");
				long cep = numValidado();
				
				println("Digite o ddd (Apenas numeros): ");
				long ddd = numValidado();
				println("Digite o telefone (Apenas numeros): ");
				long numTelefone = numValidado();
				println("Digite o cpf (Apenas numeros): ");
				long cpf = numValidado();
				println("Digite o plano (Mensal/Anual/Free): ");
				String qualPlano = palavraValidada();
				
				id++;
				int kmPedalado = 0;
				
				GregorianCalendar d= new GregorianCalendar();
				Date agora = d.getTime();
				
				Endereco endereco = new Endereco(cep, pais, estado, bairro, ruaQuadra, numero);
				Telefone telefone = new Telefone(ddd, numTelefone);
				
				Plano plano;
				if(qualPlano == "Mensal") {
					plano = new PlanoMensal(agora);
				} else if(qualPlano == "Anual"){
					plano = new PlanoAnual(agora);
				} else {
					plano = new PlanoFree(agora);
				}
				
				Usuario usuario = new Usuario(id, nome, sobrenome, email, endereco, telefone, cpf, plano, kmPedalado);
				println(usuario.nomecompleto() + " criado com sucesso");
				println("Email: " + usuario.email());
				println("CPF: " + usuario.cpf());
				println("Endereco: " + usuario.endereco());
				println("Telefone: " + usuario.telefone());
				println("Plano: " + usuario.plano());
				println("Km pedalado: " + usuario.kmPedalado());
				break;
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				break;
				
			default:
				println("Opcao invalida, tente novamente");
				println(" ");
				
		}
	}
	
	public static void println(String a) {
		System.out.println(a);
	}
	
	public static void print(String a) {
		System.out.print(a);
	}

	public static String palavraValidada () {						// Lê e valida a palavra digitada
		boolean k;
		String palavra = "";
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		try {
			palavra = leia.nextLine();						// Lê a linha
			k = true;
		} catch (java.util.InputMismatchException e) {		// Trata algum caracter indevido
			System.out.println("Entrada inválida");
			k = false;
		}
		
		if(k) {												// Retorna a palavra se for validada
			return palavra;
		} else {											// Retorna 0 se for invalida
			return "";
		}
	}

	public static long numValidado () {							// Lê e valida a opcao escolhida
		boolean k;
		long num = 0;
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		try {
			num = leia.nextInt();	// Lê a opção
			k = true;
		} catch (java.util.InputMismatchException e) {		// Trata algum caracter indevido
			System.out.println("Entrada inválida, reinicie o programa");
			k = false;
		}
		
		if(k) {				// Retorna a opcao se for validada
			return num;
		} else {			// Retorna 0 se for invalida
			return 0;
		}
	}
}
