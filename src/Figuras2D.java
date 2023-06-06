public class Figuras2D {
    //triangulo equilatero y cuadrado
    private int nLados;//número de lados
    public float lado;//longitud del lado

    //Constructor
    public Figuras2D(int nLados) {
        this.nLados = nLados;
    }

    public Figuras2D(float lado) {
        this.lado = lado;
    }

    public Figuras2D(int nLados, float lado) {
        this.nLados = nLados;
        this.lado = lado;
    }

    //Setters y getters
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }


    public float areaCuadrado(int lado) {
        return this.lado * this.lado;
    }

    ;

    public float perimetroCuadrado() {
        return nLados * lado;
    }

    ;

    public float areaTriangulo() {
        return (this.lado * this.lado) / 2;

    }

    ;

    public float perimetroTriangulo() {
        return nLados * lado;

    }

    ;
}
