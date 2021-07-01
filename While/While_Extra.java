import java.util.Scanner;

public class While_Extra {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*
        * 1. Escriba un programa que pida dos números enteros. El programa 
        * pedirá de nuevo el segundo número mientras no sea mayor que el primero. 
        * El programa terminará escribiendo los dos números.
        */
        System.out.println("NÚMERO MAYOR");
        System.out.println("Escriba un número");
        int num1 = scan.nextInt();
        System.out.println("Escriba un número mayor que "+num1);
        int num2 = scan.nextInt();
        boolean mayor = num2>num1;
        while (!mayor) {
            System.out.println(num2 +" no es mayor que "+num1+". Inténtelo de nuevo");
            num2 = scan.nextInt();
            mayor = num2>num1;
        }
        System.out.println("Los números que ha escrito son " +num1+ " y " +num2 );
        
        
        /*
        * 2. Escriba un programa que pida números decimales mientras el usuario 
        * escriba número mayores que el primero.
        */
        System.out.println("\nNÚMEROS MAYORES");
        System.out.println("Escriba un numero decimal");
        float float1 = scan.nextFloat();
        System.out.println("Escriba un número mayor que "+float1 );
        float float2 = scan.nextFloat();
        boolean floatMayor = float2>float1;
        while (floatMayor) {
            System.out.println("Escriba un número mayor que "+float1 );
            float2 = scan.nextFloat();
            floatMayor = float2>float1;
        }
        System.out.println(float2 + " no es mayor que " +float1 );
        
        
        /*
        * 3. Escriba un programa que pida números enteros mientras sean cada vez
        * más grandes.
        */
        System.out.println("\nCADA VEZ MÁS GRANDES");
        System.out.println("Escriba un numero");
        int numero1 = scan.nextInt();
        System.out.println("Escriba un número mayor que "+numero1);
        int numero2 = scan.nextInt();
        
        boolean numeroMayor = numero2>numero1;
        
        while (numeroMayor) {
            numero1 = numero2;
            System.out.println("Escriba un número mayor que "+numero1 );
            numero2 = scan.nextInt();
            numeroMayor = numero2>numero1;
        }
        System.out.println(numero2 + " no es mayor que " +numero1 );
        
        
        /*
        * 4. Escriba un programa que pida la cantidad de números positivos que 
        * se tienen que escribir y a continuación pida números hasta que se haya
        * escrito la cantidad de números positivos indicada.
        */
        System.out.println("\nNÚMEROS POSITIVOS");
        System.out.println("Escriba la cantidad de números positivos a escribir");
        int objetivo = scan.nextInt();
        while (objetivo<1) {
            System.out.println("La cantidad debe ser mayor que 0. Inténtelo de nuevo");
            objetivo = scan.nextInt();
        }
        
        int numTotal = 0;
        int numPositivo = 0;
        
        System.out.println("\nEscriba un número");
        int numIntroducido = scan.nextInt();
        numTotal++;
        if (numIntroducido>=0) {
            numPositivo++;
            objetivo--;
        }
        while (objetivo>0) {
            System.out.println("Escriba otro número"); 
            numIntroducido = scan.nextInt();
            numTotal++;
            if (numIntroducido>=0){
                numPositivo++;
                objetivo--;
            }
        }
        System.out.println("Ha escrito "+numTotal+ " números, "+numPositivo+" de ellos positivos.");
        
        
        /*
        * 5. Escriba un programa que pida números mientras no se escriba un 
        * número negativo. El programa terminará escribiendo la suma de los 
        * números positivos introducidos
        */
        System.out.println("\nSUMA DE NÚMEROS");
        System.out.println("Escriba un número");
        
        int eseNum = scan.nextInt();
        int suma = 0;
        while (eseNum >0) {
            suma += eseNum;
            System.out.println("Escriba otro número");
            eseNum= scan.nextInt();        
        }
        System.out.println("La suma de los números positivos es "+suma);
        
        
        /*
        * 6. Escriba un programa que pida un valor límite positivo y a 
        * continuación pida números hasta que la suma de los números 
        * introducidos supere el límite inicial.
        */
        System.out.println("\nHASTA EL LÍMITE");
        System.out.println("Escriba el valor límite");
        
        int limite = scan.nextInt();
        while (limite<1) {
            System.out.println("El límite debe ser mayor que 0. Inténtelo de nuevo");
            limite = scan.nextInt();
        }
        System.out.println("Escriba un número");
        float sumaNum = scan.nextFloat();
        while (sumaNum<limite) {
            System.out.println("Escriba otro número");
            sumaNum += scan.nextFloat();        
        }
        System.out.println("Ha superado el límite. La suma de los números introducidos es "+sumaNum);
        
        
        /*
        * 7. Escriba un programa que pida primero dos números enteros 
        * (mínimo y máximo) y que después pida números enteros situados entre 
        * ellos. El programa terminará cuando se escriba un número que no esté 
        * comprendido entre los dos valores iniciales. El programa termina 
        * escribiendo la cantidad de números escritos.
        */
        System.out.println("ENTRE DOS VALORES");
        System.out.println("Escriba un número");
        int numMenor = scan.nextInt();
        System.out.println("Escriba un número mayor que "+numMenor);
        int numMayor = scan.nextInt();
        while (numMayor<=numMenor){
            System.out.println(numMayor+ " no es mayor que "+numMenor+". Inténtelo de nuevo");
            numMayor = scan.nextInt();
        }
        
        System.out.println("Escriba un número entre "+numMenor+ " y "+numMayor);
        int enterNumber = scan.nextInt();
        int contador = 0;
        while (enterNumber>numMenor && enterNumber<numMayor) {
            contador++;
            System.out.println("Escriba otro número entre "+numMenor+ " y "+numMayor);
            enterNumber = scan.nextInt();
        }
        
        if (contador == 0) {
            System.out.println("No ha escrito ningún número entre "+numMenor+ " y "+numMayor); 
        }else
            System.out.println("Ha escrito "+contador+ " número entre "+numMenor+ " y "+numMayor);
        
        
        /*
        * 8. Escriba un programa que pida números pares mientras el usuario 
        * indique que quiere seguir introduciendo números. Para indicar que 
        * quiere seguir escribiendo números, el usuario deberá contestar S o s .
        * a la pregunta.
        */
        System.out.println("CUENTA PARES");
        System.out.println("Escriba un número par");
        int numPar = scan.nextInt();
        while (numPar%2 != 0) {
            System.out.println(numPar + " no es un número par. Inténtelo de nuevo");
            numPar = scan.nextInt();
        }
        
        System.out.println("¿Quiere escribir otro número par? S/N");
        char quiere = scan.next().toUpperCase().charAt(0);
        
        int contadorPares = 1;
        while (quiere == 'S') {
            System.out.println("Escriba un número par");
            numPar = scan.nextInt();
            while (numPar%2 != 0) {
            System.out.println(numPar + " no es un número par. Inténtelo de nuevo");
            numPar = scan.nextInt();
            }
            contadorPares++;
            System.out.println("¿Quiere escribir otro número par? S/N");
            quiere = scan.next().toUpperCase().charAt(0);
        }
        
        if (contadorPares == 1) {
            System.out.println("Ha escrito " +contadorPares+ " número par");
        }else{
            System.out.println("Ha escrito " +contadorPares+ " números pares");
        }
    }
    
}
