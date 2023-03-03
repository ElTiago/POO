import java.util.Scanner;
public class Inicio {
    
    public static void main(String[] args) {

        double x, area, longcir;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del radio ");
        x = entrada.nextInt();
        area = Math.PI * Math.pow(x,2);
        longcir = 2* Math.PI * x;
        
        
        System.out.println("El radio es " + (int)x);
        System.out.println("El area es " + area);
        System.out.println("La longitud de la circunferencia es " + longcir);

    }
}
