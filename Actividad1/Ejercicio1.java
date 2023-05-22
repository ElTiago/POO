import java.util.Scanner;
public class Inicio {
    
    public static void main(String[] args) {

        int ej, eal, ea, em;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la edad de Juan ");
        ej = entrada.nextInt();
        
        eal = (ej*2)/3;
        ea = (ej*4)/3;
        em = (ej+eal+ea);
        
        System.out.println("la edad de juan es " + ej);
        System.out.println("la edad de alberto es " + eal);
        System.out.println("la edad de ana es " + ea);
        System.out.println("la edad de la mamá de juan es " + em);
                
    }
}
