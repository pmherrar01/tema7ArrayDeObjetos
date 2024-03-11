import java.util.Scanner;

public class Ejercicio2 {

	public static int numerosAleatorios() {
		int aleatorio;
		aleatorio = (int) (Math.random() * (6 - 1 + 1));
		return aleatorio;
	}
	
	 public static int pedirLongitud(Scanner scanner) {
	        int longitud;
	        while (true) {
	            try {
	                longitud = Integer.parseInt(scanner.nextLine());
	                if (longitud >= 1 && longitud <= 10) {
	                    break;
	                } else {
	                    System.out.println("Por favor, introduce un número entre 1 y 10:");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Por favor, introduce un número válido:");
	            }
	        }
	        return longitud;
	    }
	
	public static void rellenarVector(int vNum[]) {
		int i;
		for(i=0;i<vNum.length;i++) {
			vNum[i] = numerosAleatorios();
		}
	}
	
	public static void mostrarVector(int vNum []) {

		for ( int num : vNum ) {
			 System.out.println(num);
		}
	}
	

	
	public static void main(String[] args) {		
		Scanner scanner = null;
		int longitud = pedirLongitud(scanner );
		int[] vNum = new int[longitud];
		rellenarVector(vNum);
		mostrarVector(vNum);
		
	}

}
