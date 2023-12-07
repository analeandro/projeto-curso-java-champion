package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class ProgramChampion {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Champion championA, championB;
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();		
		System.out.print("Vida Inicial: ");
		int life = sc.nextInt();
		sc.nextLine();		
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		sc.nextLine();		
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		sc.nextLine();		
		championA = new Champion(name, life, attack, armor);		
				
		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		name = sc.nextLine();		
		System.out.print("Vida Inicial: ");
		life = sc.nextInt();
		sc.nextLine();		
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		sc.nextLine();		
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		sc.nextLine();	
		championB = new Champion(name, life, attack, armor);
				
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");		
		int quantity = sc.nextInt();		
		System.out.println();		
		int i=1;
		do {			
			System.out.println("Resultado do turno " + i + ":" );									
			championA.takeDamage(championB);						
			System.out.println(championA.status());			
			
			championB.takeDamage(championA);
			System.out.println(championB.status());	
			System.out.println();
			i ++;
			
		} while (i <= quantity && championA.getLife() > 0 && championB.getLife() > 0 );
		
		System.out.println("FIM DO COMBATE");
						
		sc.close();


	}

}
