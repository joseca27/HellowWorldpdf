import java.util.Scanner;

public class HellowWorld {

	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println(".....................");
		 System.out.println("1-Hola, buenos dias");
		 System.out.println("2-Hola, buenas tardes");
		 System.out.println("3-Hola, buenas noches");
		 System.out.println(".....................");
		 System.out.println("Elige una opcion");
		 
		 int opcion = sc.nextInt();
		 
		 
		 switch (opcion) {
		 	
		 case 1:
			 System.out.println("1-Hola, buenos dias");
			 break;
		 case 2:
			 System.out.println("2-Hola, buenas tardes");
			 break;
		 case 3:
			 System.out.println("3-Hola, buenas noches");
			 break;
		 }
		 
		 
		 
		 
	 }
	
}
