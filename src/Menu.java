public class Menu {
    public static void main(String[] args) {
        Figuras3D Cubo=new Figuras3D(6,5);
        System.out.println("AREA DEL CUBO: " + Cubo.areaCubo());
        System.out.println("PERIMETRO DEL CUBO: " + Cubo.perimetroCubo());
        Figuras3D Piramide = new Figuras3D(4,7);
        System.out.println("PERIMETRO DE LA PIRAMIDE: " + Piramide.perimetroPiramide());
        System.out.println("AREA DE LA PIRAMIDE: " + Piramide.areaPiramide());
    }
}
