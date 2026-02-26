package exer6;

public class MainRetangulo {
     public static void main(String[] args) {
       Retangulo ret = new Retangulo(5.0, 3.0);
       System.out.println("Largura: " + ret.getLargura());
       System.out.println("Altura: " + ret.getAltura());
       System.out.println("Area: " + ret.calcularArea());
       System.out.println("Perimetro: " + ret.calcularPerimetro());
   }
}