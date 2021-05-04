package rectangulo;


import java.util.ArrayList;

public class Rectangulo {

    private double altura;
    private double base;
    private double area = 0.0;
    private double perimetro = 0.0;
    boolean rangeBase;
    boolean rangeAltura;
    double min = 1.00;
    double max = 30.00;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo() {
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
            this.altura = altura;
    }

    public void setBase(double base) {
            this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String toString() {
        return "Rectangulo: " + "altura = " + altura + ", base = " + base + ", " + (area == 0.0 ? "Perimetro: " + perimetro : "Area: " + area);

    }

    public double calcularArea(double base, double altura) {
        this.area = base * altura;
        return area;
    }

    public double calculaPerimetro(double base, double altura) {
        this.perimetro = (2 * base) + (2 * altura);
        return perimetro;
    }

    public String verDetalle(ArrayList<Rectangulo> rectangulos, int index){
        return "Rectangulo " + index +": " + "altura = " + rectangulos.get(index).altura + ", base = " + rectangulos.get(index).base + ", " +
                (rectangulos.get(index).area == 0.0 ? "Perimetro: " + rectangulos.get(index).perimetro : "Area: " + rectangulos.get(index).area);
    }

    public void eliminar(ArrayList<Rectangulo> rec, int numero){
        rec.remove(numero);
    }

    public boolean getRangeBase(double base){
        rangeBase = (base < min || base > max);

        if (rangeBase) {
            System.out.println("Debe ingresar un valor entre 1 y 30");
        }
        return rangeBase;
    }

    public boolean getRangeAltura(double altura){
        rangeAltura =(altura < min || altura > max);

        if (rangeAltura) {
            System.out.println("Debe ingresar un valor entre 1 y 30");
        }
        return rangeAltura;
    }

}
