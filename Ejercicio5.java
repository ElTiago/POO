public class Inicio {
    
    public static void main(String[] args) {

        int suma, x, y;
        suma = 0;
        x = 20;
        suma += x;
        y = 40;
        x = (int) (x + Math.pow(y,2));
        suma = suma + x/y;

        System.out.println("El valor de la suma es de " + suma);

    }
}
