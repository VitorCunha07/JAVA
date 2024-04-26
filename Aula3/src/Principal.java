public class Principal {
    public static void main (String[] args){
        Circulo c1;
        c1 = new Circulo();

        Trapezio t1;
        t1 = new Trapezio()


        c1.setRaio(6);
        System.out.println(c1.calcularPerimetroCirculo());
        System.out.println(c1.calcularAreaCirculo());

        t1.setBaseMaior(6);
        t1.setBaseMenor(6);
        t1.setLado1(6);
        t1.setLado2(6);
        System.out.println(t1.calcularPerimetroTrapezio());
        System.out.println(t1.calcularAreaTrapezio());
    }
}
