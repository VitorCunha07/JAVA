public class Trapezio{
    private double baseMaior;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;

    public void setBaseMaior (double x){
        if (x<=0)
            return;
        this.baseMaior = x;
    }

    public void setBaseMenor(double x){
        if (x<=0)
            return;
        this.baseMenor = x;
    }

    public void setLado1(double x){
        if (x<=0)
            return;
        this.lado1 = x;
    }

    public void setLado2(double x){
        if (x<=0)
            return;
        this.lado2 = x;
    }

    public double calcularAltura(){

    }

    public double calcularPerimetroTrapezio(){
        return this.lado1 + this. + this.baseMaior + this.baseMenor;
    }

    public double calcularAreaTrapezio() {
        return ((this.baseMenor + this.baseMaior) * altura) /2;

    }


}