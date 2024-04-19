public class TrianguloRegular {

    private double lado;

    public void setLado (double x){
        if (x <= 0)
            return;
        this.lado = x;
    }

    public double  calcularPerimetroT(){
        return this.lado*3;
    }

    public double calcularAreaT(){
        return ( this.lado * this.lado) /2;
    }


}
