import java.util.Scanner;

public class Entrada {



    public static void main (String[] args) {

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        ejercicio6();
    }

    public static void ejercicio1() {


        final String NOMBRE = "Diego Aranda Diaz";
        final String DIRECCION = "C/ barcelona";
        final int PORTAL= 25;
        final int PISO =5;
        final char LETRA ='A';
        final String POBLACION = "Mostoles";
        final String PROVINCIA ="Madrid";
        final String PAIS ="España";
        final int CODIGO = 28937;
        System.out.println(NOMBRE);
        System.out.printf("%s nº %d %d%c\n",DIRECCION, PORTAL, PISO, LETRA);
        System.out.printf("%d %s %s \n", CODIGO, POBLACION, PROVINCIA);
        System.out.println(PAIS);
    }
    static Scanner lectorTeclado = new  Scanner(System.in);
    public static void ejercicio2(){

    String nombre;
    int edad;
    System.out.println("Escriba su nombre");
    nombre = lectorTeclado.nextLine();
        System.out.println("Escriba su edad");
    edad = lectorTeclado.nextInt();

        System.out.printf("Te llamas %s y tienes %d años\n",nombre, edad);
    }

    public static void ejercicio3() {
        int numero1;
        System.out.println("Introduce el primer numero entero");
        numero1 = lectorTeclado.nextInt();

        int numero2;
        System.out.println("introduce el segundo numero");
        numero2 = lectorTeclado.nextInt();

        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int multiplicacion = numero1*numero2;
        int division = numero1/numero2;
        int resto = numero1%numero2;
        float divisionReal = (float) numero1/numero2;
        float restoReal = (float) numero1%numero2;

        System.out.printf("la suma de los digitos es: %d\nLa resta de los digitos es: %d\nLa multiplicacion de los digitos es: %d\nLa division sin decimales de los digitos es de: %d\nEl resto sin decimales de los digitos es: %d\nLa division con decimales de los digitos es: %f\nEl resto con decimales de los digitos es: %f\n",suma, resta, multiplicacion, division, resto, divisionReal, restoReal);
    }

    public static void ejercicio4() {
        double costeBebidas = 1.25;
        double costeBocadillos = 2.05;
        int bebidas;
        System.out.println("cuantas bebidas quieres?");
        bebidas = lectorTeclado.nextInt();

        int bocadillos;
        System.out.println("cuantos bocadillos qieres?");
        bocadillos = lectorTeclado.nextInt();

        double preciobebidas = bebidas*costeBebidas ;
        double precioBocadillos = bocadillos*costeBocadillos;
        double costeTotal = preciobebidas + precioBocadillos;
        System.out.printf("Nº bebidas %d\nNº bocadillos %d\nCoste de bebidas%.2f\ncoste de bocadillos %.2f\nCoste total%.2f",bebidas, bocadillos, preciobebidas, precioBocadillos,costeTotal);


    }

    public static void ejercicio5() {
        int segundosPedidos;
        System.out.println("cuantos segundos quieres convertir en horas minutos y segundos??");
        segundosPedidos = lectorTeclado.nextInt();
        int horas = segundosPedidos/3600;
        segundosPedidos= segundosPedidos%3600;
        int minutos = segundosPedidos/60 ;
        segundosPedidos= segundosPedidos%60;


        System.out.printf("horas: %d\n" +
                "minutos: %d\n" +
                "segundos: %d", horas, minutos,segundosPedidos);

    }

    public static void ejercicio6() {

        System.out.println("cuanto te ha costado el articulo");

        float precioarticulo = lectorTeclado.nextFloat();

        System.out.println("cuanto iva has pagado");
        int iva= lectorTeclado.nextInt();

        float precioNeto = precioarticulo* ((float) iva/100);

        System.out.printf("has pagado %2f de iva", precioNeto);


    }


    }





