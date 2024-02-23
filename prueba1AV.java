import java.util.Scanner;

public class prueba1AV{
	public static void main (String args[]){

		Scanner in = new Scanner(System.in);
		String Nombre_Compl = "";
		int Num1 = 0;
		int Num2 = 0; 
		int Num3 = 0;		
		
		System.out.println("Escribe tu nombre completo :D");
		Nombre_Compl = in.nextLine();
				
		System.out.println("\nAcontinuacion escribe 3 numeros ENTEROS");
		System.out.println("Escribe tu primer numero:");
		Num1 = in.nextInt();

		System.out.println("\nEscribe tu segundo numero:");
		Num2 = in.nextInt();

		System.out.println("\nEscribe tu tercer numero: \n");
		Num3 = in.nextInt();

		System.out.println ("\nBievenido " + Nombre_Compl );
		System.out.println ( "\nTus numeros son :\n" + Num1);  
		System.out.println (+ Num2); 
		System.out.println (+Num3);		
  }	
}