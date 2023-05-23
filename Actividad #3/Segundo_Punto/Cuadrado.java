package segundo_punto;

public class Cuadrado {
    int lado;
    public Cuadrado(int lado) {
    this.lado=lado;
}
    double calcularArea() {
        return lado*lado;
    }
    double calcularPerimetro() {

        return (4*lado);

    }

}
