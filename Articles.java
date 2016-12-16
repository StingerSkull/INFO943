import java.util.Random;

/*
 génère 6 différent types d'articles avec des caractéristiques différentes
 */


public class Articles {
	
private int i;
String couleur;

public Articles(int tours){	
i = tours;	
System.out.println("il(elle) a acheté " + i + " articles");
}

// liste des différents types d'articles
public void voitures(String modele, String couleur,int annee ){	
	System.out.println("une voiture "+modele+ " de couleur "+couleur+" années "
	+annee);
}	

public void moto(String modele, String couleur,int annee ){	
	System.out.println("une moto "+modele+ " de couleur "+couleur+" années "
	+annee);
}

public void chaussures(String modele, String couleur ){	
	System.out.println("une paire de "+modele+ " de couleur "+couleur);
}

public void velo(String couleur ){	
	System.out.println("un velo de couleur "+couleur);
}

public void skateBoard(String couleur ){	
	System.out.println("un velo de couleur "+couleur);
}

public void jeu(String version ){	
	System.out.println("le dernier "+version);
}

// générateur d'articles et attribution de propriété à chacun d'eux
public void GenArticles(){
	
	// propriétés des articles
	String[] coul = {"rouge","vert(e)","noir(e)","blanc(he)","gris(e)","bleu(e)"};
	String[]mod_voiture = {"bentley","cadillac","renault","peugeot","rolls royce","bugatti"};
	String[] mod_moto = {"harley","honda","yamaha","vespa","suziki","aprilia"};
	String[] mod_chaussures = {"timberland","D&G","G-raw","all Star","versace","foot locker"};
	String[] version_jeu = {"fifa","call of duty","overwatch","league of legend","devil may cry","naruto"};
	
	// généraion d'un chiffre entre 0 et 5 pour la sélection d'une propriété d'article
	Random r = new Random();
	int Low = -1;
	int High = 5;
	
	// pour la sélection de l'année de production
	Random l = new Random();
	int L = 1910;
	int H = 2018;
	
	// attribue à chaque objet des propriétés sélectionnées de manière aléatoire
	// le nombre d'itérations est fixé par la valeur passée en paramètre au constructeur de la classe.
	for(int j = 1; j <=i; j++ ){
	// choix d'aticle aléatoire
	int choix = (int)r.nextInt(High-Low) ;
	switch(choix){
	case 0: 
		int selection = (int)r.nextInt(High-Low);		
		int year = (int)l.nextInt(H-L)+L;
		
		voitures(mod_voiture[selection],coul[selection], year )	;
		break;
		
	case 1: 
	int selectio = (int)r.nextInt(High-Low);
	int yea = (int)l.nextInt(H-L) + L;
	
	moto(mod_moto[selectio],coul[selectio], yea );
	break;	
	
	case 2: 
	int selecti = (int)r.nextInt(High-Low);
	
	chaussures(mod_chaussures[selecti],coul[selecti]);
	break;
	
	case 3: 
	int select = (int)r.nextInt(High-Low);
	
	velo(coul[select]);
	break;
	
	case 4: 
	int selec = (int)r.nextInt(High-Low);
	
	skateBoard(coul[selec]);
	break;
	
	case 5: 
	int sele = (int)r.nextInt(High-Low);
	
	jeu(version_jeu[sele]);
	break;
	default:
	System.out.println("invalid number generated");
	break;
	}
	}
	
	
	
}



}
