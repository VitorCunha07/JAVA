public class Circulo {
    private double raio;

    public void setRaio(double x) {
        if (x <= 0)
            return;
        this.raio = x;
    }

    public double calcularPerimetroCirculo() {
        return 2 * 3.14 * this.raio;
    }

    public double calcularAreaCirculo() {
        return (this.raio * this.raio) * 3.14;
    }
}
