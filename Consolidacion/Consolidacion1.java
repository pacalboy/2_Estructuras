import java.util.Random;
import java.util.Scanner;

public class Consolidacion1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        
        /*
        * 0. Calcula la diferencia entre dos números enteros. 
        * Haz el cálculo sólo si el primer dígito es menor que el segundo.
        */
        System.out.println("Introduzca dos números");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        int resta = 0;
        boolean restable = num1<num2;
        if (restable){
            resta = num1 - num2;
        }else
            System.out.println("El segundo numero ha de ser menor");
        
        
        /*
        * 1. Pide al usuario si quiere encender la luz. El usuario introducirá 
        * S o N (también debes aceptar s o n). Si la letra introducida no se 
        * corresponde se mostrará un mensaje de error y la luz quedará apagada. 
        * Si introduce la letra n la luz quedará apagada. Si introduce la letra 
        * s la luz quedará encendida. luzEncendida es un booleano. 
        */        
        System.out.println("Quiere encender la luz?\nS N");
        char respuesta = scan.next().toUpperCase().charAt(0);
        
        boolean luzEncendida;
        if (respuesta == 'S'){
            luzEncendida = true;
        }else if(respuesta == 'N'){
            luzEncendida = false;
        }else{
            luzEncendida = false;
            System.out.println("Letra incorrecta");
        }
        
        
        /*
        * 2. El usuario introduce un número. Si el número es negativo no funciona.
        * El programa sólo se ejecuta si el número es menor que 100. El programa
        * genera un número aleatorio mayor que el número dado por el usuario y 
        * menor que 100. El sistema pide otro número al usuario. El sistema dice
        * si ese número está más cerca de 100 o más cerca del número inicial que
        * introdujo el usuario. 
        */        
        System.out.println("Introduzca un número entre 0 y 99");
        int num = scan.nextInt();
        
        boolean válido = num>=0 && num<100;
        
        if (válido){
            int random1 = random.nextInt(100-num)+num;
            
            
            boolean cerca100 = (100-random1)<(random1-num);
            if(cerca100){
                System.out.println("Está más cerca de 100");
            }else{
                System.out.println("Está más cerca de "+num);
            }           
        }else{
            System.out.println("Fuera de los límites");
        }
        
        
        /*
        * 3. El usuario introduce un número. Si el número es negativo no funciona.
        * El sistema genera un número aleatorio entre 0 y el número introducido.
        * El sistema pide de nuevo un número al usuario. Si el número coincide 
        * con el número aleatorio generado, el sistema felicita el usuario. 
        */        
        System.out.println("Introduzca un numero mayor de 0");
        int number1 = scan.nextInt();
        
        boolean positive = number1>0;
        
        if(positive){
            int aleatorio = random.nextInt(number1);
            System.out.println("Introduzca otro número para intentar acertar");
            int number2 = scan.nextInt();
            boolean acierto = number2 == number1;
            if(acierto){
                System.out.println("Has acertado");
            }else{
                System.out.println("Has fallado");
            }
        }else
            System.out.println("Dije mayor de 0");
        
        
        /*
        * 4. Crea un array de 5 posiciones con 5 números aleatorios. Este número
        * será el premiado en la lotería de navidad. El sistema comprobará si el
        * número del usuario es premiado. El usuario introduce su número, si el
        * número coincide asigna un premio de un millón. Si sólo los 3 últimos 
        * números coinciden asigna un premio de 100.000€. Si sólo coincide el 4º
        * número, el premio es de 20€.
        */        
        int lotería [] = new int [5];
        int billete [] = new int [5];
        
        for (int i=0; i<lotería.length; i++){
            lotería [i] = random.nextInt(10);
        }
        
        System.out.print("El numero premiado es ");
        for (int i=0; i<billete.length; i++){
            System.out.print(lotería[i]);
        }
        System.out.println("\nIntroduzca el número de su billete cifra a cifra");        
        for (int i = 0; i<billete.length; i++) {

            billete [i] = scan.nextInt();
        }
        
        boolean acierto [] = new boolean [5];
        for (int i=0; i<billete.length; i++) {
            if (billete [i] == lotería [i])
                acierto [i] = true;
        }
        
        boolean premio1 = acierto[0] && acierto[1] && acierto [2] && acierto [3] && acierto [4];
        boolean premio2 = acierto [2] && acierto [3] && acierto [4];
        boolean premio3 = acierto [3];
        
        int ganancias = 0;
        if (premio1){
            ganancias = 1000000;
        }else if (premio2){
            ganancias = 100000;
        }else if (premio3){
            ganancias = 20;
        }
        
        System.out.println("Has ganado " +ganancias);
    }
    
}