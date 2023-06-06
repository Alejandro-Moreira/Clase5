public class Figuras3D { //esfera, cubo, cilindro y piramide
    private int nLados;//número de lados
    private float lado;//longitud del lado

    //Constructor

    public Figuras3D(float lado) {
        this.lado = lado;
    }

    public Figuras3D(int nLados, float lado) {
        this.nLados = nLados;
        this.lado = lado;
    }

    //Setters y getters
    private float getLado() {
        return lado;
    }

    private void setLado(float lado) {
        this.lado = lado;
    }

    private int getnLados() {
        return nLados;
    }

    private void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public float areaCubo() {
        return 6 * (this.lado * this.lado);
    }


    public float perimetroCubo() {
        return 12 * lado;
    }


    public float areaPiramide() {
        return ((this.lado * this.lado) + (this.nLados * this.lado) / 2);
    }

    ;
    public float perimetroPiramide() {
        return nLados * lado;
    }
    ;
}

