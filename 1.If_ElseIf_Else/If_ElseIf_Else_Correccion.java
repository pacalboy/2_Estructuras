import java.util.Scanner;

public class If_ElseIf_Else_Correccion {

    public static void main(String[] args) {
        /**
         * Ej 1: Escribir un programa que pida dos números para calcular la
         * división. Gestionar el error si se introduce un divisor 0 con una
         * estructura condicional.
         */

        int dividendo, divisor;
        float resultado;

        //Recoge los datos para la división
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola, ¿Quieres hacer una division?"
                + " Vale, introduce el dividendo: ");
        dividendo = teclado.nextInt();
        System.out.println("Ahora introduce el divisor: ");
        divisor = teclado.nextInt();

        //Realiza la división y gestiona error en caso divisor==0
        if (divisor == 0) {
            System.out.println("El divisor es 0 por lo tanto"
                    + " no se puede realizar la operacion");
        } else {
            resultado = (float) dividendo / divisor;
            System.out.println("El resultado de la división de "
                    + dividendo + " y " + divisor + " es igual a " + resultado);
        }

        /**
         * Ej 2: Para poder tributar es necesario ser mayor de 16 años y tener
         * ingresos mensuales superiores a 1000€. El sistema pide al usuario
         * edad e ingresos y si cumple los requisitos le aplica un 2.18% de impuestos.
         */
        int edad;
        float ingresos, impuestos = 0;

        //Solicita datos de edad e ingresos
        System.out.println("Introduce tu edad: ");
        edad = teclado.nextInt();
        System.out.println("Introduce tus ingresos mensuales: ");
        ingresos = teclado.nextInt();

        //Comprueba si el usuario debe pagar
        if (edad > 16 && ingresos >= 1000) {
            impuestos = ingresos * 0.0218f;
        }

        System.out.println("Los impuestos a pagar son" + impuestos + "€");

        /**
         * Ej 3: Se van a dividir los alumnos de la clase en tres grupos por
         * orden alfabético. A-J K-S T-Z. El usuario introduce un nombre y el
         * sistema dice a qué grupo pertenece.
         */
        String usuario;
        System.out.print("Introduzca su nombre: ");
        usuario = teclado.next();

        //Coge la primera letra y la pasa a mayúsculas
        char letra = usuario.charAt(0);
        letra = Character.toUpperCase(letra);

        //Asigna un valor de grupo según la inicial
        String grupo = "";
        if (letra >= 'A' && 'J' >= letra) {
            grupo = "A-J";
        } else if (letra >= 'K' && 'S' >= letra) {
            grupo = "K-S";
        } else if (letra >= 'T' && 'Z' >= letra) {
            grupo = "T-Z";
        }

        //Muestra el grupo gestionando el caso de error
        if (!grupo.equals("")) {
            System.out.println("Estas en el grupo " + grupo);
        } else {
            System.out.println("Nombre no válido");
        }

        /**
         * Ej 4: Para la calidad de los productos de una empresa se establecen 3
         * niveles de rendimiento y unas puntuaciones: Inaceptable [0.0 - 0.4],
         * Aceptable (0.4-0.6], Meritorio (0.6-1]. El precio del producto va en
         * función de su calidad siendo éste factor multiplicado por 5.00€
         * (precio máximo). Crea un sistema que reciba una puntuación. Si la
         * puntuación no está en los límites se acabará el programa. Si se
         * introduce una puntuación correcta el sistema dirá a qué nivel
         * pertenece y calculará su precio.
         */
        //Lectura puntuación del producto
        System.out.println("Dame la puntuacion del producto: "
                + "(introducir decimal con ','");
        float puntuación = teclado.nextFloat();

        //Asigna un valor de puntuación en función de la puntuación
        String rango = null;
        if (puntuación > 0 && puntuación <= 0.4) {
            rango = "Inaceptable";
        } else if (puntuación > 0.4 && puntuación <= 0.6) {
            rango = "Aceptable";
        } else if (puntuación > 0.6 && puntuación <= 1) {
            rango = "Meritorio";
        }

        //Muestra el resultado y gestiona posible error de puntuación fuera de rango
        if (rango != null) {
            System.out.println("Su calidad es " + rango + " y su precio es de: " + puntuación * 5);
        } else {
            System.out.println("El valor introducido no es válido");
        }
    }

}