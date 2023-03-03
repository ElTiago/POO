import java.util.Scanner;
public class Inicio {
    
    public static void main(String[] args) {

        int x;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor ");
        x = entrada.nextInt();
        
        
        System.out.println("El cuadrado de " + x + " es: " + (int)(Math.pow(x, 2)));
        System.out.println("El cubo de " + x + " es: " + (int)(Math.pow(x, 3)));

    }
}
