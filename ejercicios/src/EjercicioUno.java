import java.awt.geom.Arc2D;
import java.util.Scanner;

public class EjercicioUno {
static Scanner lectorTeclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("introduce tu nombre:" );
            String nombre = lectorTeclado.next();
        System.out.println("introduce tus apellidos:" );
            String apellidos = lectorTeclado.next();
        System.out.println("introduce tu edad:");
            int edad = lectorTeclado.nextInt();
        System.out.println("introduce tu altura:");
            float altura = lectorTeclado.nextFloat();
        System.out.println("introduce tu peso:");
            float peso = lectorTeclado.nextFloat();
        System.out.println("introduce tu sexo:");
            String sexo = lectorTeclado.next();
            float imc = calculoIMC(peso,altura);
        System.out.printf("hola mi nombre es %s, tu IMC teniendo en  cuenta tu altura de %.2fm y tu peso de %.2fkg y tiene un valor de %2f\n",nombre, altura,peso,imc);
    }

    public static float calculoIMC(float peso, float altura) {
        return (float) (peso / Math.pow(altura, 2));
    }











}
