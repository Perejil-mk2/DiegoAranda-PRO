
import java.util.Scanner;

    public class ejercicio {
    static Scanner sc = new Scanner(System.in);
    public void main(String[] args) {
//ej11F();
        //ejrnuevo();
        //ejercicio13();
        ejerecicio15f();
    }
    public static void ej11F(){
        System.out.println("de que lado quieres el cuadrado");
        int lado = sc.nextInt();
        for (int i = 0; i < lado; i++) {
            System.out.println("\t+\t");
            for (int j = 0; j < lado; j++) {
                if (i!=0 || i== lado-1){
                System.out.print("\t+\t");
            } else if (j == 0 || j == lado-1) {
                } else
                    System.out.println("\t \t");
            }
            System.out.println();
        }



    }


    public static void ejrnuevo(){
        System.out.println("introduce una palabra");
        String palabra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);
            System.out.println(letra);

        }

        palabra= palabra.replaceAll("", "");



    }


public static void ejercicio13(){

    System.out.println("introduce una palabra que quieras invertir");
    String palabra = sc.next();

    for (int i = palabra.length()-1; i >=0 ; i--) {

        System.out.println(palabra.charAt(i));

    }
    }


        }


    public static void ejerecicio14f() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una palabra que quieras invertir");
        String palabra = sc.next();
        palabra= palabra.toLowerCase().replaceAll("á", "a"); palabra= palabra.replaceAll("é", "e"); palabra= palabra.replaceAll("í", "i"); palabra= palabra.replaceAll("ó", "o"); palabra= palabra.replaceAll("ú", "u");
       String palabrainversa = "";


            boolean palindromo= true;

            for (int i = 0; i < palabra.length()/2 ; i++) {
                if (palabra.charAt(i)!= palabra.charAt(palabra.length()-1-i)){
                    palindromo= false;
                    break;
                }

            }
        }


        public static void ejerecicio15f(){

        String frase  = "Esta es la frase que analizamos. Con esto aprendesmos el for. Que todo el mundo atienda.";

int numeroletras= frase.length();
String numeroletrasnada = frase.replaceAll(" ","").replaceAll(".","");

int numerooraciones=0,numeropalabras=0;
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i)=='.'){
                    numerooraciones++;
                } else if (frase.charAt(i)== ' ') {
                    numeropalabras++;
                }
            }

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");

        }


public static void ejerecicio17f() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe un numero entre 0 y 20 para calcular su factorial");
    int numero = sc.nextInt();
    int factorial = 1;
    if (numero < 1) {
        System.out.println("no puedo calcular este factorial");
    } else {
        for (int i = 1; i <= numero ; i++) {
       factorial= factorial*i;
        }
        System.out.printf("El factorial del numero %d es %d ",numero,factorial);
    }


}


    public static void main(String[] args) {
        ejercicioDoWhile1();
    }
public static void ejercicio16f(){
    Scanner sc = new Scanner(System.in);
    int aleatorio = (int)(Math.random()*30)+1;

    int intentos= 0;

    for (int i = 1; i <11 ; i++) {
        System.out.println("por favor dime tu numero");
        int numeroUsuario = sc.nextInt();
        intentos++;
        if (aleatorio == numeroUsuario){
            System.out.println("oeleoleole cholo simeone");
            break;
        }else{
            System.out.println("Lo siento mi bro esta la fallaste");
    }

}
    }


    public static void ejerciciopWhl(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numerousuario = sc.nextInt();
        int i=0;
        while(numerousuario !=0){

            i++;
            System.out.println("introduce otro numero");
            numerousuario = sc.nextInt();

            if (numerousuario == 0){
                System.out.println("fin");
                System.out.println("has introducido "+i);
            }
        }


    }


    public static void ejerciciopWhl1(){
        Scanner sc = new Scanner(System.in);
      int numero;
      int i=0;
      do {

          System.out.println("introduce numero");
          numero= sc.nextInt();
          i++;
      }while (numero!=0);

        System.out.println("el numero introducido es"+i);
    }

    public static void ejercicioDoWhile1 (){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Opcion añadir");
            System.out.println("2. Opcion borrar");
            System.out.println("3. Opcion listar");
            System.out.println("4. Opcion buscar");
            System.out.println("5. Opcion salir");
            System.out.println("------------------");
            System.out.println("Que quieres hacer?");

            opcion= sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("ejecutando opcion añadir\n");
                    break;
                case 2:
                    System.out.println("ejecutando opcion borrar\n");
                    break;
                case 3:
                    System.out.println("ejecutando opcion listar\n");
                    break;
                case 4:
                    System.out.println("ejecutando opcion buscar\n");
                    break;
            }


        }while (opcion!=5);

        System.out.println("borrando system 32...");





    }