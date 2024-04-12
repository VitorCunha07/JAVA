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

