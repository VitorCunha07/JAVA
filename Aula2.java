public class Retangulo {
    private int base;
    private int lado;

    public void setBase (int x){
        if (x <= 0)
            return;
        this.base = x;
    }

    public void setLado (int x){
        if (x <= 0)
            return;
        this.lado = x;
    }

    public int calcularPerimetro(){
        return (this.base*2) + (this.lado*2);
    }

    public int calcularPerimetro(){
        return this.base*this.lado;
    }

}



public class Principal {
    public static void main (String[] args){
        Retangulo r1,r2,r3; //declaração
        r1 = new Retangulo();
        r2 = new Retangulo();
        r3 = new Retangulo();

        r1.setBase(6);
        r1.setAltura(4);
        System.out.println(r1.calcularPerimetro());
        System.out.println(r1.calcularArea());
    }
}



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




public class Principal {

        TrianguloRegular t1;
        t1 = new TrianguloRegular();

        t1. setLado(3);
        System.out.println(t1.calcularPerimetroT());
        System.out.println(t1.calcularAreaT());
    }


}
