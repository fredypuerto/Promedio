import java.util.Scanner;


public class promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
        
	       System.out.print("Primer Jugador:" );
	      	
	       String resp1 = s.next();
	       
	        System.out.print("Ingrese el Puntaje:" );
	        
	         int pun1 = s.nextInt();
	       System.out.print("Segundo Jugador:" ); 
	       String resp2 = s.next();
	         System.out.print("Ingrese el Puntaje:" );
	       int pun2 = s.nextInt();
	       System.out.print("Tercer Jugador:" );
	       String resp3 = s.next();
	         System.out.print("Ingrese el Puntaje:" );
	       int pun3 = s.nextInt();
	       
	       System.out.print("*Promedio de Puntajes es: "+(pun1+pun2+pun3)/3);
	  
	       System.out.print("\n *");
	       if (pun1>pun2 && pun1>pun3) {
	           System.out.print("El Mejor Puntaje es: "+resp1+" "+pun1+"\n");
	       } else {
	           if (pun2>pun3) {
	               System.out.print("El Mejor Puntaje es: "+resp2+" "+pun2+"\n");
	           } else {
	              System.out.print("El Mejor Puntaje es: "+resp3+" "+pun3+"\n");
	           }
	       }
	       System.out.print("*");
	       if (pun1<pun2 && pun1<pun3) {
	          System.out.print("El Peor Puntaje es: "+resp1+" "+pun1+"");
	       } else {
	           if (pun2<pun3) {
	               System.out.print("El Peor Puntaje es: "+resp2+" "+pun2+"");
	           } else {
	              System.out.print("El Peor Puntaje es: "+resp3+" "+pun3+"");
	           }
	       }
		}

	
	}


