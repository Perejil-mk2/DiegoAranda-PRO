public class Apuntes {
    public static void main(String[] args) {
 whileDoWhile();
    }
    public static void If() {
        int nota = 10;

        if (nota >=0 && nota<=10){

            System.out.println("La nota es correcta");

            if (nota < 5){
                System.out.println("suspenso");
            }else if (nota <7){
                System.out.println("aprobado");
            }else if (nota < 9) {
                System.out.println("notable");
            }else if (nota <10) {
                System.out.println("sobresalinte");
            }else{
                System.out.println("matricula de honor");
            }


        } else {

            System.out.println("La nota no es correcta");
        }

        System.out.println("Terminando la ejecucion");
    }


    public static void Switch() {

        int numero= 7;

        switch (numero){
            case 1:
                //cuerpo
                break;
            case 3:
                break;
            case 5:
                break;
            default:
        }

    }


    public static void f0r() {


        for (int i=0; i<6; i++){
            System.out.println("operacion numero: "+i);

        }

    }


    public static void whileDoWhile(){


        int i =10;
        while (i>0){
            System.out.println("El valor de i es "+i);
            i--;
        }



    }





}



