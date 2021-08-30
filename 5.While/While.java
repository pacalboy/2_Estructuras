import java.util.Random;
import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        /*
        * 0. Crea un programa en el que la luz esté encendida por defecto. 
        * El programa muestra que la luz está encendida y preguntará al usuario 
        * si quiere apagar la luz. Mientras que el usuario no responsa con una
        * 'S' o 's' el sistema seguirá diciendo que la luz está encendida y 
        * preguntará si quiere apagarla.
        */
        
        char letraApagar = 'n';
        boolean luzEncendida = letraApagar != 's';
        
        while (luzEncendida) {
            System.out.println("Luz encendida\n¿Desea apagar la luz? S o N");
            letraApagar = scan.next().toLowerCase().charAt(0);
            luzEncendida = letraApagar != 's';            
        }
        
        
        /*
        * 1. Crea una calculadora que sume números hasta que el número introducido
        * sea el -1. 1. Crea una calculadora que sume números hasta que el número
        * introducido sea el -1. Crea y utiliza la constante ERROR = -1;
        */
        
        int suma = 0;
        final int ERROR = -1;
        
        System.out.println("Introduzca número a sumar\nIntroduzca -1 para finalizar");
        int numIntro = scan.nextInt();
        
        boolean seguir = numIntro != ERROR;
        
        while (seguir) {
            suma += numIntro;
            System.out.println("Introduzca número a sumar\nIntroduzca -1 para finalizar");
            numIntro = scan.nextInt();            
            seguir = numIntro != ERROR;            
        }
        System.out.println("La suma es " +suma);
        
        // 2. Diseña un problema propio que necesite estructura while y resuelvelo.
        /*
        * El usuario debe acertar el resultado de la multiplicación.
        * Primero introduce las veces que puede fallar.
        * El juego acaba cuando falle más veces de las permitidas 
        */
        System.out.println("¿Cuántos fallos permitimos?");
        int fallos = scan.nextInt()+1;
        
        int num1, num2;
        int aciertos = 0;
        
        boolean sigue = fallos>0;
        
        while (sigue) {
            num1 = random.nextInt(10);
            num2 = random.nextInt(10);
            System.out.println("\nResultado de " + num1+ "*" +num2);
            if (scan.nextInt() == num1*num2){
                aciertos++;
            }else{
                fallos--;
                System.out.println("Error, la solución era "+ num1*num2);
            }
            sigue = fallos>0;
        }
        System.out.println("\nHas acertado "+aciertos+ " veces.");
    
        
        /*
        * 3. Crea un programa que muestre un contador de pulsaciones de la tecla
        * intro. El programa debe salir cuando se escriba cualquier palabra + la tecla intro. 
        */
        
        int contador = 0;

        System.out.println("Contador de pulsaciones de la tecla intro, "
                + "introduzca una palabra para detener");
        String tecladoIntro = scan.nextLine();
        
        boolean continuar = tecladoIntro.equals("");
        
        while (continuar) {
            contador ++;
            tecladoIntro = scan.nextLine();
            continuar = tecladoIntro.equals("");
        }
        System.out.println("Has pulsado " + contador + " veces la tecla intro");
        
        
        /*
        * 4. Crea un programa que muestre la tabla de multiplicar del número 8. 
        * Crea y utiliza la constante TABLA_NUM = 8; El usuario pulsará la tecla
        * intro para obtener la siguiente iteración de la tabla. 
        * Cuando el usuario escriba la palabra exit se parará.
        */
        
        final int TABLA_NUM = 8;
        int multiplicador = 0;
        System.out.println("Tabla del 8. \nPulsar Intro para mostrar siguiente, "
                + "escribir exit para salir.");
        String str = scan.nextLine().toLowerCase();
               
        boolean go = !str.equals("exit");
        
        while (go) {
            System.out.println(TABLA_NUM + " * " +multiplicador+ " = " +(TABLA_NUM*multiplicador));
            multiplicador ++;
            System.out.println("Pulsar Intro para mostrar siguiente, "
                    + "escribir exit para salir");
            go = !scan.nextLine().toLowerCase().equals("exit");
        }
        
        
        /*
        * 5. Crea un programa sobre la capacidad de un camión de 100 cajas. Crea
        * y utiliza una constante para la capacidad. El programa pedirá el número
        * de cajas que traen los clientes y las meterá en el camión. El programa
        * aceptará cajas mientras que la suma sea menor que 100. El último usuario
        * podrá sobrepasar la capacidad, pero se comunicará cuántas de sus cajas
        * sobran. Es decir, si la suma es 90 y un usuario añade 15 cajas, se 
        * aceptarán todas, pero no se sumarán más cajas de otros clientes.  
        * Al salir del bucle se muestra el exceso de cajas que llevará el camión. 
        */
        
        final int CARGA_MAX = 100;
        
        System.out.println("Introduzca nº de cajas");
        int carga = scan.nextInt();
        
        boolean cargaNoExcedida = carga < CARGA_MAX;
        
        while (cargaNoExcedida) {
            System.out.println("Introduzca nº de cajas");
            carga += scan.nextInt();
            cargaNoExcedida = carga < CARGA_MAX;
        }
        int exceso = carga - CARGA_MAX;
        
        System.out.println("Camión completo\nSe ha excedido en " +exceso+ " cajas.");
        
        
        
        /*
        * 6. Crea un programa que lleva la cuenta del inventario de una fábrica 
        * de latas. El inventario está en 1000 unidades actualmente. Mientras el
        * número de unidades sea superior a 200, los clientes pueden llevarse el
        * número de unidades que deseen (si hay suficientes). Cuando el inventario
        * sea inferior a 200 se deja de repartir y se notifica que se deben fabricar más latas. 
        */
        
        int inventario = 1000;
        int reparto;
        boolean superior200 = inventario > 200;
        while (superior200) {
            System.out.println("¿Cuantas latas desea llevarse?");
            reparto = scan.nextInt();
            if (reparto > inventario){
                System.out.println("No hay suficientes para este pedido");
            }else{
                inventario -= reparto;
                superior200 = inventario > 200;
            }
        }
        System.out.println("Existencias bajas, fabricar más latas");
        
    }
    
}