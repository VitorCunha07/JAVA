public class Retangulo {
    private int base;
    private int altura;

    public void setBase (int x){
        if (x <= 0)
            return;
        this.base = x;
    }

    public void setAltura (int x){
        if (x <= 0)
            return;
        this.altura = x;
    }

    public int calcularArea(){
        return (this.base*2) + (this.altura*2);
    }

    public int calcularPerimetro(){
        return this.base*this.altura;
    }

}
