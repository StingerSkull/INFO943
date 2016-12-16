import java.util.Random;


/*
 cette classe génère une personne avec un nom, prénom, email et numéro de telephone 
 de manière aléatoire. 
 */

public class Personnes {

private int number = 1;  				
//informations relatives à chacun
private String firstName;
private String lastName;
private String cel;
private String email;

public Personnes(int n){
	number = n;	
	System.out.println("le site a reçu " +n + " visite(s) \n" );
} 

public void createPersonnes(String nom, String prenom, String tel, String courier){
firstName = prenom;
lastName = nom;
cel = tel;
email = courier;	
}	

/* géneration de personnes et attribution d'une identité 
*/

public void genPersonnes(){
	int i;
	
	//infromations personnelles des individus
	String[] nom = {"Leblanc","Lenoir","Lapou","Cochet","Cidre","Ladouille"};
	String[] pnom = {"Aurelien", "Adrien","clement","hariette","diane","nadine" };
	String[] tele = {"02365472","07896543","05421445","03654896","036521459","03698754","05469875"};
	String[] lettre = {"yahoo.fr","voila.fr","hotmail.fr","gmail.fr","messenger.fr","hi5.fr"};
	
	
	
for(i=1;i <= number;i++){
	//generation d'un nombre aléatoire entre 0 et 5 
	Random r = new Random();
	int Low = -1;
	int High = 5;
	// pour les informations personnelles (0 = Aurelien Leblanc; tel:02365472;yahoo.fr)
	int selection = (int)r.nextInt(High-Low);
	// pour le nombre d'articles achetés 
	int nombreArticles = (int)r.nextInt(High-Low);
		
	System.out.println("M " + pnom[selection]+" "+ nom[selection]+"\nEmail: "
	+ lettre[selection]+ "\nTelephone: "+ tele[selection]+ "\n" );
	// achat d'article
	Articles achats = new Articles(nombreArticles);
	achats.GenArticles();
	System.out.println("\n");
	
}
}

}
