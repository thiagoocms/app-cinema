package cineSpeed;

import java.util.Scanner;

public class Cinespeed {
	public static void ingresso(String ses1, int preco) {
		try (Scanner sc = new Scanner(System.in)){
			char ingresso;
			while(true) {
				System.out.print("Filme em sessão única as "+ ses1 +" Deseja reservar o ingresso?(S/N) ");
				ingresso = sc.next().charAt(0);
		   
			   
			   if(ingresso == 'N' || ingresso == 'n'){

				   System.out.println("");
			       System.out.print("Operação encerrada. Por favor, comece novamente!");
			       break;
			   }else if(ingresso == 'S' || ingresso == 's') {
				   valorPagar( preco);
				   break;
			   }else {
				   System.out.println("Comando nao reconhecido, tente novamente...");
				   System.out.println("");
				   
					   
				   }
		   }
		}
		
	}
	
	public static void valorPagar(int preco) {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("");
			System.out.println("Hoje não há meia-entrada");
			System.out.print("Quantos ingressos deseja?  ");
			int qtn = sc.nextInt();
			int valor = qtn * preco;
			while(true) {
				if(qtn >= 1) {
					System.out.println("Valor total da compra: R$"+ valor + ",00");
					System.out.print("Forma de pagamento disponível: DÉBITO ou CREDITO [D/C]:  ");
					char pagamento = sc.next().charAt(0);
					if(pagamento == 'D' || pagamento == 'd' ) {
						System.out.println("Ingresso pago no debito, comprovante sendo impresso. Obrigado pela preferencia!");
						break;
					}else if(pagamento == 'C' || pagamento == 'c') {
						System.out.print("voce deseja dividir em quantas vezes? ");
						int parcelas = sc.nextInt();
						double parcela = valor / parcelas;
						System.out.printf("Ingresso pago no credito em "+ parcelas +"x de R$ %.2f ", parcela );
						System.out.print(", comprovante sendo impresso. Obrigado pela preferencia!");
						break;
					}else {
						System.out.println("");
						System.out.println("metodo de pagamento não identificado, tente novamente...");
						System.out.println("");
						
					}
				}
				break;
			}
		}catch(Exception e) {
			
		}
		
	}
	
	public static void horariofuc( String ses1, String ses2,String ses3, int preco) {
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.print("horarios de sessao "+ ses1+ ","+ ses2+ ","+ ses3+", Deseja reservar o ingresso?(S/N) ");
				char ingresso = sc.next().charAt(0);
				if(ingresso == 'N' || ingresso == 'n'){
				   System.out.println("");
			       System.out.print("Operação encerrada. Por favor, comece novamente!");
			       break;
				}else if(ingresso == 'S' || ingresso == 's') {
					System.out.println("");
					while(true) {
						System.out.print("Qual sessão você quer? 1ª, 2ª, 3ª:  ");
						int sessao = sc.nextInt();
						switch(sessao) {
						case 1:
							System.out.println("");
							System.out.println("      sessão de "+ ses1 +" escolhida");
							
							break;
						case 2:
							System.out.println("");
							System.out.println("      sessão de "+ ses2 +" escolhida");
							
							break;
						case 3: 
							System.out.println("");
							System.out.println("      sessão de "+ ses3 +" escolhida");
							
							break;
						
						default:
							System.out.println("");
							System.out.println("sessão não identificada, tente novamente...");
							
							
						}
						
						break;	
						
					}
				}else {
					System.out.println("");
					System.out.println("comando invalido, tente novamente...");
					System.out.println("");
					continue;
				}
				break;
				
			}
			valorPagar( preco);
			sc.close();
		}
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int preco = 32;
			   System.out.println("Olá, seja bem vindo(a)!");
			   System.out.println("Segue os filmes em cartaz...");
			   System.out.println("----------------------------------------------------------------");
			   System.out.println("1 - Homem Aranha - longe de casa    |        4 - X-man");
			   System.out.println("                                    |                        ");
			   System.out.println("2 - Quarteto Fantastico             |        5 - Matrix");
			   System.out.println("                                    |                        ");
			   System.out.println("3 - Homem de Ferro                  |        6 - Ben 10 O filme");
			   System.out.println("----------------------------------------------------------------");
			   System.out.print("Por favor, digite de 1 a 6 para escolher o filme desejado: ");
			   int filme = sc.nextInt();
			   
			   while(filme > 6){
				   System.out.println("Filme invalido, tente novamente...");
				   System.out.println("");
				   System.out.print("Por favor, digite de 1 a 6 para escolher o filme desejado: ");
				   filme = sc.nextInt();
			   }
			   String ses1;
			   String ses2;
			   String ses3;
			   
			   
			   switch (filme) {
			   case 1:
				   ses1 = "15:00";
				   ingresso(ses1, preco);
				   
				   break;
			   case 2:
				   ses1 = "16:00";
				   ses2 = "17:00";
				   ses3 = "18:30";
				   horariofuc(ses1,ses2,ses3, preco);
				   
				   break;
			   case 3:
				   ses1 = "15:00";
				   ingresso(ses1, preco);
				   
				   break;
			   case 4:
			      ses1 = "17:30";
			      ses2 = "19:10";
			      ses3 = "20:30";
			      horariofuc(ses1,ses2,ses3, preco);
				   
				   break;
			   case 5:
			      ses1 = "14:30";
			      ses2 = "18:10";
			      ses3 = "21:30";
			      horariofuc(ses1,ses2,ses3, preco);
				      
				   break;
			   case 6:
			      ses1 = "15:30";
			      ses2 = "17:45";
			      ses3 = "20:35";
			      horariofuc(ses1,ses2,ses3, preco);
				    		  
				   break;
				   
			   
			   }
			   sc.close();  
		}
	}
}
