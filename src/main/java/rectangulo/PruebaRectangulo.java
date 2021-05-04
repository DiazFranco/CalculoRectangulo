package rectangulo;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaRectangulo {

    public static void main(String[] args) {

        ArrayList<Rectangulo> rectangulos = new ArrayList<>();
        Rectangulo rectangulo = new Rectangulo();

        double base;
        double altura;
        boolean rangeBase;
        boolean rangeAltura;


        Scanner scan = new Scanner(System.in);
        char continuar = 'Y';
        char eliminar;

        System.out.println("Vamos a obtener el perimetro y area de un rectangulo!");

        while (continuar == 'Y' || continuar == 'y' ){

            System.out.println("Que queres calcular? (Opcion 1 area, opcion 2 perimetro): ");
            int option = scan.nextInt();

            if (option == 1) {

            do {
                System.out.println("Ingrese el valor de la base");
                base = scan.nextDouble();

                rangeBase = rectangulo.getRangeBase(base);

            } while (rangeBase);

            do {
                System.out.println("Ingrese el valor de la altura");
                altura = scan.nextDouble();

                rangeAltura = rectangulo.getRangeAltura(altura);

            } while (rangeAltura);

                Rectangulo rect = new Rectangulo(altura, base);

                double area = rect.calcularArea(base, altura);
                System.out.println("El area es: " + area);

                rectangulos.add(rect);

            } else if (option == 2) {

             do {
                 System.out.println("Ingrese el valor de la base");
                 base = scan.nextDouble();

                rangeBase = rectangulo.getRangeBase(base);

             } while (rangeBase);

             do {
                 System.out.println("Ingrese el valor de la altura");
                 altura = scan.nextDouble();

                rangeAltura = rectangulo.getRangeAltura(altura);

             } while (rangeAltura);

                Rectangulo rect = new Rectangulo(altura, base);

                double perimetro = rect.calculaPerimetro(base,altura);
                System.out.println("El perimetro es: " + perimetro);

                rectangulos.add(rect);

            } else {
                System.out.println("Debe ingresar una opcion válida");
            }

            System.out.print("Desea continuar? (Y/N): ");
            continuar = scan.next().charAt(0);

        }
        for (int i=0; i<rectangulos.size();i++){
            System.out.println(rectangulo.verDetalle(rectangulos, i));
        }

        System.out.println("Deseas eliminar algun registro? (Y/N): ");
        eliminar = scan.next().charAt(0);

        if(eliminar == 'Y'|| eliminar == 'y') {
            System.out.println("Elija el número del rectángulo a eliminar");
            int numero = scan.nextInt();
            rectangulo.eliminar(rectangulos, numero);
            System.out.println("El registro se eliminó correctamente: " + rectangulos);
        }
    }
}
