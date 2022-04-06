import java.util.InputMismatchException;
import java.util.Scanner;

public class MasaCorporal {

    public static void main(String[] args) {
        //inicializamos las variables que vamos a usuar
        double peso = 0, altura = 0, IMC = 0;
        Scanner sc = new Scanner(System.in);

        //controlamos que no introduzca caracteres.
        try {
            //realizamos el programa asta que se introduzca un número negativo en peso o en altura
            while(peso >= 0 && altura >= 0) {
                //preguntamos por el valor del peso y la altura
                System.out.println("A continuación calcularemos tu indice de masa corporal.");
                System.out.print("Introduce tu peso en kilogramos: ");
                peso = sc.nextDouble();
                System.out.print("Introduce tu altura en metros: ");
                altura = sc.nextDouble();
                //solo si los valores de peso y alturas son mayores o iguales a cero se ejecuta el resto del programa
                if(peso >= 0 && altura >= 0) {
                    //si la altura es cero no podemos dividir
                    if(altura == 0) {
                        System.out.println("No se puede dividir entre cero");
                    } else {
                        IMC = calculo(peso, altura);
                        if(IMC < 18.49) {
                            System.out.println("Tu índice de masa corporal es de: " + IMC + " Y perteneces a la categoría de 'Peso bajo'");
                        } else {
                            if(IMC < 24.9) {
                                System.out.println("Tu índice de masa corporal es de: " + IMC + " Y perteneces a la categoría de 'Normal'");
                            } else {
                                if(IMC < 29.9) {
                                    System.out.println("Tu índice de masa corporal es de: " + IMC + " Y perteneces a la categoría de 'Sobre peso'");
                                } else {
                                    if(IMC < 34.9) {
                                        System.out.println("Tu índice de masa corporal es de: " + IMC + " Y perteneces a la categoría de 'Obesidad leve'");
                                    } else {
                                        if(IMC < 39.9) {
                                            System.out.println("Tu índice de masa corporal es de: " + IMC + " Y perteneces a la categoría de 'Obesidad Media'");
                                        } else {
                                            System.out.println("Tu índice de masa corporal es de: " + IMC + " Y perteneces a la categoría de 'Obesidad Mórbida'");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        } catch(InputMismatchException e) {
            System.out.println("Error. Solo se pueden introducir números");
        }
        //finalizamos el programa
        System.out.println("El programa a finalizado");
        sc.close();
    }
    //hacemos en un método a parte la operación
    private static double calculo(double peso, double altura) {
        double IMC;
        IMC = peso/(altura*altura);
        return IMC;
    }
}