import java.util.Scanner;

//programa que permite a 2 usarios ingresar datos y jugar piedra , papel o tijeras y de acuerdo a sus condiciones imprime el ganador.

public class Ejercicio4 {

	public static void main(String[] args) {
		//codigo para que persona 1 ingrese datos
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    Scanner s1 = new Scanner(System.in);
	    String j1 = s1.nextLine();
	  //codigo para que persona 2 ingrese datos
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in);
	    String j2 = s2.nextLine();
	   
	    if (j1.equals(j2)) {
			System.out.println("Empate");
	      } else {
	      
	        int g = 2;
	        switch(j1) {
	          case "piedra":
	            if (j2.equals("tijeras") ) {
	              g = 1;
	            }
	            break;
	          case "papel":
	            if (j2.equals("piedra")) {
	              g = 1;
	            }
	            break;
	          case "tijeras":
	            if (j2.equals("papel")) {
	              g = 1;
	            } else {
	            	g = 2;
	            }
	            break;
	          default:
	        }
	        System.out.println("Gana el jugador " + g);
	      }//else
	    
	    //se cierran los scan
	    s1.close();
	    s2.close();
	}//main
}//class
