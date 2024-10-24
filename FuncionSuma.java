import java.util.Scanner;

/**
*@version  V1.0
*@author Miquel
*@see Para mas informacion ver Google
*
*/

public class FuncionSuma {

	/**
	*
	*@param Variable para guardar el primer sumando
	*/
	private static int primerSumando;
	/**
	*
	*@param Variable para guardar el segundo sumando
	*/
	private static int segundoSumando; 
	/**
	*
	*@args Funcion principal del programa
	*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Introduce el primer sumando:");
		primerSumando = in.nextInt();
		in.nextLine();
		System.out.println("Introduce el segundo sumando:");
		segundoSumando = in.nextInt();
		in.nextLine();
		System.out.println("La suma es: " + suma(primerSumando, segundoSumando));
		
		in.close();

	}
	
	
	/**
	*
	*@args Funcion que realiza la suma de los dos operadores
	*/
	private static int suma (int sumando1, int sumando2) {
		return sumando1+sumando2;
	}

}
