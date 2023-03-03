public class Inicio {
    
    public static void main(String[] args) {

        double bruto, fuente, neto;
        
     
        bruto = 48*5000;
        fuente = bruto * 0.125;
        neto = bruto - fuente;
        
        System.out.println("El salario bruto es de " + bruto);
        System.out.println("La retención en la fuente es de " + fuente);
        System.out.println("El salario neto es de " + neto);

    }
}
