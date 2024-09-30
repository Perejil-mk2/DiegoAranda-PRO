import java.util.Scanner;

public class Entrada {



    public static void main (String[] args) {

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
        //ejercicio14();
        //ejercicio15();
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

    public static void ejercicio7() {

        System.out.println("Introduce un radio entero ...");
    int valorRadio= lectorTeclado.nextInt();

    float longitudCircunferencia = 2*(float)Math.PI*valorRadio;
        System.out.printf("La longitud de la circunferencia es: %2f\n",longitudCircunferencia);

        float areaCirculo =(float)Math.PI*(valorRadio*valorRadio);
        System.out.printf("El area de la circunferencia es: %2f",areaCirculo);
    }

    public static void ejercicio8() {


        System.out.println("introduce los grados centigrados...");
        float centigrados = lectorTeclado.nextFloat();

       float kelvin = centigrados+(float)273.15;
       float farenheit = ((9*centigrados)/5)+32;
        System.out.printf("La conversion a kelvin es: %1f\nLa conversion a farenheit es: %1f\n",kelvin,farenheit);

        System.out.println("introduce los grados kelvin...");
        float gKelvin = lectorTeclado.nextFloat();

        float gcentigrados = gKelvin-(float)273.15;
        float gfarenheit = (9*(gKelvin-(float)273.15)/5)+32;
        System.out.printf("La conversion a centigrados es: %1f\nLa conversion a farenheit es: %1f\n",gcentigrados,gfarenheit);

        System.out.println("introduce los grados farenheit...");
        float f = lectorTeclado.nextFloat();

        float c = (5*(f-(float)32))/9;
        float k = ((5*(f-(float)32))/9)+(float)273.15;
        System.out.printf("La conversion a centigrados es: %1f\nLa conversion a kelvin es: %1f",c,k);
    }

    public static void ejercicio9() {

        System.out.println("introduce el numero de bocatas");
        int nummeroBocatas = lectorTeclado.nextInt() ;
        System.out.println("introduce el numero de bebidas");
        int numeroBebidas= lectorTeclado.nextInt();
        System.out.println("introduce el precio de los bocatas");
        float precioBocatas = lectorTeclado.nextFloat();
        System.out.println("introduce el precio de las bebidas");
        float precioBebidas = lectorTeclado.nextFloat();
        System.out.println("introduce el numero alumnos");
        int numeroAlumnos = lectorTeclado.nextInt();

        float costeTbocatas = precioBocatas*nummeroBocatas;
        float costeTbebidas = precioBebidas*numeroBebidas;
        float costeTotaltodo = costeTbebidas+costeTbocatas;
        System.out.printf("\t ARTICULO \t CANTIDAD \t PRECIO \t COSTE\n" +
                "\tBEBIDAS\t\t  %d  \t\t %2f\t\t %2f\n" +
                "\tBOCATAS\t\t  %d  \t\t %2f\t\t %2f\n" +
                "TOTAL\t \t\t\t \t \t\t\t\t %2f",numeroBebidas,precioBebidas,costeTbebidas,nummeroBocatas,precioBocatas,costeTbocatas,costeTotaltodo);

    }

    public static void ejercicio10() {

        System.out.println("introduce las decenas de mil");
        int dcMil = lectorTeclado.nextInt();
        System.out.println("introduce las milesimas");
        int mls = lectorTeclado.nextInt();
        System.out.println("introduce las centenas");
        int ctn = lectorTeclado.nextInt();
        System.out.println("introduce las decenas");
        int dc = lectorTeclado.nextInt();
        System.out.println("introduce las unidades");
        int uds = lectorTeclado.nextInt();
        System.out.println("cargando numero...");
        int numeroPedido = uds+dc*10+ctn*100+mls*1000+dcMil*10000;
        System.out.printf("tu numero es %d", numeroPedido);

    }

    public static void ejercicio11() {
        System.out.println("introduce un numero entero comprendido entre 0 y 100");
        int numeroEntero = lectorTeclado.nextInt();
        boolean par = (numeroEntero %2 == 0);
        System.out.printf("Es par?: %b\n",par);
        boolean mayor50 = numeroEntero > 50;
        System.out.printf("Mayor de 50?: %b",mayor50);




    }

    public static void ejercicio12() {

        System.out.println("Escribe una palabra . . . ");
            String palabra1= lectorTeclado.next();
        System.out.println("Escribe otra palabra . . . ");
            String palabra2= lectorTeclado.next();
        boolean comparacionA = palabra1.equals(palabra2);
        System.out.printf("Son iguales las palabras?: %b\n",comparacionA);
        boolean comparacionB = palabra1.compareTo(palabra2)==0;
        System.out.printf("La primera es menor que la segunda?: %b\n", comparacionB);
        boolean comparacionC = !comparacionA;
        System.out.printf("Son distintas las palabras?: %b",comparacionC);

    }

    public static void ejercicio13() {
        System.out.println("Escriba un numero entre 0 y 9");
        int numero1 = lectorTeclado.nextInt();
        System.out.println("Escriba otro numero entre 0 y 9");
        int numero2 = lectorTeclado.nextInt();
        boolean comparacion1 = (numero1 %2==0);
        boolean comparacionA = (numero2 %2 == 1);
        boolean realComparacion = comparacion1 && comparacionA;
        System.out.printf("El primero es par y el segundo impar: %b\n", realComparacion);
        boolean comparacion2 = numero1> numero2*2;
        boolean comparacionB = numero1<8;
        boolean realcomparacion2 = comparacion2 && comparacionB;
        System.out.printf("El numero es mayor que el doble del segundo e inferior a 8: %b\n",realcomparacion2);
        boolean comparacion3 = numero1==numero2;
        boolean comparacionC = numero1-numero2<2;
        boolean realComparacion3 = comparacion3 && comparacionC;
        System.out.printf("Son iguales o la diferencia entre el primero y el segundo es menor que 2: %b\n",realComparacion3);




    }

    public static void ejercicio14(){

        System.out.println("Introduce tu edad. . .");
            int edad = lectorTeclado.nextInt();
        System.out.println("Introduce tu nivel de estudios. . .");
            int estudios = lectorTeclado.nextInt();
        System.out.println("Introduce tus ingresos. . .");
            int sueldo = lectorTeclado.nextInt();

        boolean comparacion1 = edad>40;
        boolean comparacionEstudios1 = 5>=estudios;
        boolean comparacionEstudios2 = 8>=estudios;
            boolean comparacion2 = comparacionEstudios1&&comparacionEstudios2;
        boolean comparacion3 = 15000>sueldo;
        boolean padreBoolean = comparacion1&&comparacion2&&comparacion3;
        System.out.printf("Mas de 40 años y estudios entre 5 y 8 y gana menos de 15000: %b",padreBoolean);
    }

    public static void ejercicio15(){
        System.out.println("Introduce un numero entero . . .");
            int numeroEntero = lectorTeclado.nextInt();
        int aumento = numeroEntero+=5;
        int decremento = numeroEntero-=3;
        int mutiplicar = numeroEntero *=10;
        int dividir = numeroEntero /=2;
        System.out.printf("Numero entero; %d\n",numeroEntero);
        System.out.printf("Incremento: %d\n",aumento);
        System.out.printf("Decremento: %d\n",decremento);
        System.out.printf("Multiplicacion: %d\n",mutiplicar);
        System.out.printf("Division: %d",dividir);



    }

    }





