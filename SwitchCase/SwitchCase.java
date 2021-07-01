import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        /* 1. El usuario introduce un mes un visualiza el número de días de ese mes. 
         * Si es febrero pedirá el año, calculará si es bisiesto y mostrará el número de días.
         */
        Scanner scan = new Scanner(System.in);
        scan = scan.useDelimiter("\n");
        
        String error = "Error al introducir datos";

        System.out.println("Introduzca mes");
        String mes = scan.next().toLowerCase();

        switch (mes){
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println("El mes de " +mes+ " tiene 31 días\n");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println("El mes de " +mes+ " tiene 30 días\n");
                break;
            case "febrero":
                System.out.println("Introduzca el año");
                int anio = scan.nextInt();
                if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0))
                    System.out.println("El mes de " +mes+ " del año " +anio+ " tiene 29 días\n");
                else
                    System.out.println("El mes de " +mes+ " del año " +anio+ " tiene 28 días\n");
               
                break;
            default:
                System.out.println(error + '\n');
        }
        
        
        /* 2. Calculadora. El sistema pide dos números y un operador. 
         * Realiza y muestra el resultado de la operación con los dos valores. 
         * Implementa +, -, *, /, %
         */
        System.out.println("Introduzca primer número");
        int x = scan.nextInt();
        System.out.println("Introduzca operador de suma(+) resta(-) multiplicación(*) o división(/)");
        String oper = scan.next();
        System.out.println("Introduzca segundo número");
        int y = scan.nextInt();

        switch (oper){
            case "+":
                System.out.println(x+ "+" +y+ "= " + (x+y) + '\n');
                break;
            case "-":
                System.out.println(x+ "-" +y+ "= " + (x-y) + '\n');
                break;
            case "*":
                System.out.println(x + "*" +y+ "= " + (x*y) + '\n');
                break;
            case "/":
                if (y == 0){
                    System.out.println("Imposible dividir entre 0\n");
                    break;
                }
                float sol = (float) x/y;
                System.out.println(x+ "/" +y+ "= " +sol+ '\n');
                break;
            default:
                System.out.println(error + '\n');      
        }
        
        
        /* 3. Calculador número de día anual. El usuario introduce día y mes. 
         * El sistema muestra en qué día del año nos encontramos. 
         */
        System.out.println("Introduzca día");
        int dia = scan.nextInt();
        System.out.println("Introduzca mes");
        String mes2 = scan.next().toLowerCase();

        switch (mes2){
            case "enero":
                break;
            case "febrero":
                dia += 31;
                break;
            case "marzo":
                dia += 60; //febrero del año en curso tiene 29 días
                break;
            case "abril":
                dia += 91;
                break;
            case "mayo":
                dia += 121;
                break;
            case "junio":
                dia += 152;
                break;
            case "julio":
                dia += 182;
                break;
            case "agosto":
                dia += 213;
                break;
            case "septiembre":
                dia += 244;
                break;
            case "octubre":
                dia += 274;
                break;
            case "noviembre":
                dia += 305;
                break;
            case "diciembre":
                dia += 335;
                break;
            default:
                dia = -1;
        }
        if (dia > 0)
            System.out.println("El día del año es " +dia+ '\n');
        else
            System.out.println(error + '\n');
        

        /* 4. Un programa que aumenta el salario de sus trabajadores según el rango en el que se encuentra. 
         * [0-9000) 20%, [9000-15000) 10%, [15000-20000] 5%, más de 20000 3%.
         */
        System.out.println("Introduzca salario del trabajador");
        int sal = scan.nextInt();
        float porcen;
        char caso;
        
        if (sal>=0 && sal<9000) 
            caso = 'a';
        else if (sal>8999 && sal<15000) 
            caso = 'b';
        else if (sal>14999 && sal<20001) 
            caso = 'c';
        else if (sal > 20000) 
            caso = 'd';
        else
            caso = 'e';
        
        switch (caso){
            case 'a':
                porcen = 0.2f;
                break;
            case 'b'    :
                porcen = 0.1f;
                break;
            case 'c'    :
                porcen = 0.05f;
                break;
            case 'd':
                porcen = 0.03f;
                break;
            default:
                porcen = -1;         
        }

        if (porcen >= 0){
            System.out.println("El incremento salarial es del " + porcen* 100 + '%');
            System.out.println("El salario se incrementa en " + sal*porcen);
            System.out.println("El nuevo salario es de " + (sal + (sal*porcen)) + '\n');
        }else
            System.out.println(error + '\n');

        
        /* 5. Crea un programa que muestre 4 nombres de usuario, 
         * el usuario introduzca uno de dichos nombres y el sistema le de un mensaje 
         * de bienvenida personalizado para dicho usuario.
         */
        System.out.println("Introduzca nombre de usuario\nAna, Pablo, Amanda o Pedro");
        String nombre = scan.next().toLowerCase();

        switch (nombre) {
            case "ana":
                System.out.println("Hola Ana, bienvenida\n");
                break;
            case "pablo":
                System.out.println("¿Qué tal Pablo? ¿Cómo andas?\n");
                break;
            case "amanda":
                System.out.println("Amanda está aquí. ¡Larga vida a Amanda!\n");
                break;
            case "pedro":
                System.out.println("Buenas Pedro, agraciados somos por tu presencia\n");
                break;
            default:
                System.out.println(error + '\n');
        }

        /* 6. Crea un programa que lea cualquier palabra introducida por el usuario. 
         * Captura la primera vocal de dicha palabra. 
         * Muestra un mensaje para el caso de cada vocal especificando: 
         * "la primera vocal de la palabra <palabra> es <vocal>".
         */
        System.out.println("Introduzca una palabra");
        String palabra = scan.next().toLowerCase();

        int posA, posE, posI, poso, posO, posU;
        posA = posE = posI = posO = posU = 1000;

        if (palabra.contains("a")) 
            posA = palabra.indexOf('a');
        if (palabra.contains("e"))
            posE = palabra.indexOf('e');
        if (palabra.contains("i"))
            posI = palabra.indexOf('i');
        if (palabra.contains("o"))
            posO = palabra.indexOf('o');
        if (palabra.contains("u"))
            posU = palabra.indexOf("u");
        
        int menor = posA;
        if (posE < menor)
            menor = posE;
        if (posI < menor)
            menor = posI;
        if (posO < menor)
            menor = posO;
        if (posU < menor)
            menor = posU;
        
        System.out.println("La primera vocal de la plabra " +palabra+ " es " +palabra.charAt(menor)+ '\n');     
        
        
        /* 7. Reto extra. El usuario introduce un nombre con letras minúsculas y mayúsculas mezcladas 
         * y el sistema lo muestra con la inicial en mayúscula y el resto en minúscula.
         */
        System.out.println("Introduzca un nombre");
        String nick = scan.next().toLowerCase();
        
        nick = nick.substring(0,1).toUpperCase() + nick.substring(1).toLowerCase();
        System.out.println("Hola " +nick+ '\n');
               
               
        /* EXTRA: Crear un programa que solicite el nombre completo del ciclo formativo que realiza el usuario. 
         * El sistema capturará la inicial de cada palabra significativa y las concatenará en un String. 
         * Comparará esta cadena con "DAM", "DAW", "SMR" o "ASIR" y asignará un precio de matrícula y una mensualidad al usuario. 
         * Finalmente mostrará por pantalla el precio total que pagará el usuario por el curso completo. 
         */
        System.out.println("Introduzca el nombre del ciclo formativo");        
        String ciclo = scan.next();
        
        String palabras[] = ciclo.split(" ");
        int numPalabras = palabras.length;
        
        String iniciales = Character.toString(palabras[0].charAt(0));
        
        if (palabras[1].length() > 2)
            iniciales = iniciales + Character.toString(palabras[1].charAt(0));
        if (palabras[2].length() > 2)
            iniciales = iniciales + Character.toString(palabras[2].charAt(0));
        if (numPalabras > 3){
            if (palabras[3].length() > 2)
            iniciales = iniciales + Character.toString(palabras[3].charAt(0));
        }
        if (numPalabras > 4){
            if (palabras[4].length() > 2)
            iniciales = iniciales + Character.toString(palabras[4].charAt(0));
        }
        if (numPalabras > 5){
            if (palabras[5].length() > 2)
            iniciales = iniciales + Character.toString(palabras[5].charAt(0));
        }
        if (numPalabras > 6){
            if (palabras[6].length() > 2)
            iniciales = iniciales + Character.toString(palabras[6].charAt(0));
        }
        iniciales = iniciales.toUpperCase();

        int mensualidad, matricula;  
        switch (iniciales){
            case "DAM":
                mensualidad = 250;
                matricula = 200;
                break;
            case "DAW":
                mensualidad = 300;
                matricula = 275;
                break;
            case "SMR":
                mensualidad = 325;
                matricula = 295;
                break;
            case "ASIR":
                mensualidad = 350;
                matricula = 300;
                break;
            default:
                mensualidad = -1;
                matricula = -1;
        }
        if (mensualidad > 0)
            System.out.println("Ciclo: " +iniciales + "\nMatrícula: " +matricula+ "\nMensualidad: " +mensualidad+ "\nTotal a pagar: " +((mensualidad*10) + matricula));
        else 
            System.out.println("El ciclo no se encuentra en este instituto");
    }

}