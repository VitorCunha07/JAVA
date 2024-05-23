public class OlaMundo {
    public static void main(String[] args){
        System.out.println("Olá Mundo!");
    }
}




public class Quadrado {
    private int lado; //atributo

    public int calcularPerimetro(){
        return this.lado*4;
    }
    public int calcularArea(){
        return this.lado*this.lado;
    }
    public void setLado(int l){
        this.lado=l;
    }
}




public class OlaMundo {
    public static void main(String[] args){
        Quadrado q1; //declaração de objeto do tipo "quadrado"
        q1 = new Quadrado(); //instanciação de obj q1
        q1.setLado(6);
        System.out.println(q1.calcularPerimetro());
        System.out.println(q1.calcularArea());
    }
}


