import java.util.Scanner; //Import scannera
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
	  int xy;
    Scanner sc = new Scanner (System.in); //vyvolanie scannera, pomenovanie
      System.out.println ("Vitaj na porovnávaní menšieho a väèšieho èísla. BY MARCUSKOYA\n");
      System.out.println ("Zadaj poèet cisel:");
      xy = sc.nextInt(); //Nacitanie pre premennnu pocet cisel
	   if(xy <= 0) { //Ak 0 cisel alebo - hodnota poctu cisel = Zle cislo
    	System.out.println("Zle cislo");
    }
    int c = xy + 1; //Pridanie kvôli forku +1 aby sa vypisovali od jednotky
    int cislo;
    int[] pole = new int[c];  //Vytvorenie pola, c znaci pocet cisel v poli
    for (int i = 1; i < c; i++) //For pre zadavanie cisel postupne a ich citanie a nahravanie
      {
	System.out.println ("Zadaj èíslo " + i +":");
	cislo = sc.nextInt();
	pole[i] = cislo;
      }
    for (int y = 1; y < c; y++) //Vypis indexov a cisel z pola
      {
	int cislopola = pole[y];
	System.out.println ("Èíslo " + y + " sa rovná: " + cislopola + ".");
      }
    Arrays.sort(pole); //Zoradenie pola
    System.out.println("Minimum = " + pole[0]); //Pole index 0, najmensi
    System.out.println("Maximum = " + pole[pole.length-1]); //Pole index najvacsi = najv. cislo
  }
}


