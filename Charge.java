import java.util.Random;
import java.util.Scanner;
/*  
le programe simule la visite d'un site par des utilisateurs qui y achètent ou pas des articles
le programme tourne pour autant de jours de visite que défini dans la variable "ittérations"
   */
import java.util.concurrent.TimeUnit;

public class Charge {

public static void main(String[] args) throws InterruptedException {

	Random r = new Random();
	// on fixe le nombre de jours de visite
	Scanner sc = new Scanner(System.in);
	System.out.println("Veuillez entrer le nombre d'ittérations: ");
	int n = sc.nextInt();
	int p = 1;
	
	while(p <= n){  //(àfaire évoluer en boucle infinie)
		// on fixe le nombre d'ittérations (à changer pour le contenaire)
		int	ittérations = 20;
		
		for(int i = 1; i<=ittérations ;i++){
			// le nombre de visites est aléatoire
			int Low = 1;
			int High = 5;
			int nombrePersonnes = (int)r.nextInt(High-Low);
		
			Personnes hi = new Personnes(nombrePersonnes);
			hi.genPersonnes();
			System.out.println("\n");
		
	}	
		
	if(p == n) break;
	
		// le temps de pause est aléatoire compris entre 0 et 10 secondes
	int H = 10;
	int L = -1; 
	int pause = (int)r.nextInt(H-L);
	System.out.println("pause de " + pause + " secondes \n");
	TimeUnit.SECONDS.sleep(pause);
	p += 1; 
}

	System.out.println("fin du programme ");
	}
}
