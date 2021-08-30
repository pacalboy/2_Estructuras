import java.util.Random;
import java.util.Scanner;

public class Arrays_ForMedio {

    public static void main(String[] args) {
        /* 
        * 0. Crea un array de 3 posiciones y rellénalo con números aleatorios 
        * dentro del rango que defina el usuario.
        */
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
         
        //El usuario introduce el rango
        System.out.println("Introduzca dos numeros para definir rango (mínimo y máximo):");
        int rangeStart = scan.nextInt();
        int rangeEnd = scan.nextInt();
        
        //Se introducen números aleatorios en el array con un bucle
        int position[] = new int [3];
        for (int i=0; i<3; i++){
            position[i] = random.nextInt(rangeEnd - rangeStart)+rangeStart;
        }

        
        /*
        * 1. Crea un array de tipo carácter que esté inicializado con las letras 
        * de tu nombre en minúscula. Accede al primer elemento y modifícalo para 
        * que sea una mayúscula.
        */
        char name[] = {'á','l','v','a','r','o'};
        name[0] = Character.toUpperCase(name[0]); 
        
                
        /*
        * 2. Crea un array de tamaño 10 enteros. Pide al usuario que introduzca 
        * los 10 valores por teclado. Crea otro bucle para mostrar el contenido.
        */
        
        //Se crea el array y se define la longitud con una variable
        int num = 10;
        int integers[] = new int [num];
        
        //Bucle con el que se introducen los datos en el array
        System.out.println("Introduzca " + num +" valor(es) numérico");
        for (int i=0; i<num; i++){
            integers[i] = scan.nextInt();
        }
        //Bucle con el que se imprimen los datos del array
        for (int i=0; i<num; i++){
            System.out.println(integers[i]);
        }
        for(int n:integers){
            System.out.println(n);
        }
        
        
        /*
        * 3. Haz lo mismo que el ejercicio anterior pero para una cadena de caracteres. 
        * A la vez que introduces los caracteres en el array introdúcelos en un String. 
        * Muestra el contenido del array y muestra también el contenido del String.
        */
        
        //Se crea el array y se define la longitud con una variable. Se inicializa un string vacío.
        int numChar = 10;
        char chars[] = new char [numChar];
        String str ="";
        
        //Bucle con el que se introducen los datos en el array y en el string
        for (int i=0; i<numChar; i++){
            System.out.println("Introduzca un caracter");
            String letter = scan.next();
            chars[i] = letter.charAt(0);
            str += chars[i];    
        }
        //Sin crear variables
        for (int i=0; i<numChar; i++){
            System.out.println("Introduzca un caracter");
            chars[i] = scan.next().charAt(0);
            str += chars[i]; 
        }
        
        //Bucle con el que se imprimen los datos del array
        for (int i=0; i<numChar; i++){
            System.out.print(chars[i]);
        }
        System.out.println('\n' + str);
        
        
        /*
        * 4. Introduce un String por teclado. Crea un array de la longitud 
        * del String introducido. Utilizando un bucle for almacena en cada elemento 
        * del array una letra del String de forma ordenada.
        */
        
        //Se guarda el string en una variable y su longitud en otra
        System.out.println("Introduzca un string");
        String word = scan.next();
        int length = word.length();
        
        //Se crea un array de longitud igual al string
        char letterWord[] = new char [length];
        
        //Bucle en el que guarda en el array cada caracter de forma ordenada
        for (int i=0; i<length; i++){
            letterWord[i] = word.charAt(i);
        }    
        
        
        /*
        * 5. Crea un array de tamaño 100. Inicialízalo con un bucle for para que 
        * almacene los valores de 0-99. Haz otro bucle para calcular 
        * la suma de todos los valores y la media. 
        */
        
        //Se inicializa el array definiendo su longitud con una variable
        int max = 100;
        int haundred[] = new int [max];
        int sum = 0;
                
        //Bucle con el que se introducen los datos en el array y suma cada elemento
        for (int i=0; i<max; i++){
            haundred[i]=i;
            sum += i;            
        }
        float average = (float)sum/max;
        
        
        /*
        * 6. Crea un array del tamaño del abecedario (sin la letra ñ). 
        * Haz que se inicialice automáticamente utilizando un bucle for para que
        * tenga la letra A como primer valor y la Z como último. 
        */
        
        char abc[] = new char [26];
        char c = 'A';
        for (int i=0; i<26; i++){
            abc[i]=c;
            c++;
        }
        for(char d : abc)
            System.out.println(d);
        
        
        /*
        * 7. Crea e inicializa un array con 5 notas decimales. 
        * Crea un bucle que calcule la nota media. Muestra la nota media.
        */
        
        //Se inicializa una variable donde se guardará la suma de las notas
        float sumAverage = 0.0f;
        float grade[] = {7.5f, 8.3f, 5.7f, 5.1f, 6.5f};
        
        //Usamos el bucle para realizar la suma de los elementos del array
        for(int i=0; i<grade.length; i++){
           sumAverage += grade[i];
        }
        //Se calcula la nota media y se imprime
        float gradeAverage = (float) sumAverage/grade.length;
        System.out.println("La nota media es " + gradeAverage);
        
        
        /*
        * 8. Crea un array de tipo entero con 10 posiciones. 
        * Inicialízalo con números aleatorios dentro de un rango 0-9. 
        * Pide al usuario que introduzca un número. El programa comprobará si 
        * el número introducido es alguno de los que están en el array.
        */
        
        //Se inicializa el array de 10 elementos
        int shuffle[] = new int [10];
        
        //Se asigna cada uno de los elementos con un numero aleatorio
        for (int i=0; i<10; i++){
            shuffle[i] = random.nextInt(10);
        }
        //El usuario introduce un número
        System.out.println("Introduzca un número para adivinar");
        int luck = scan.nextInt();
        
        //Se comprueba el numero del usuario con cada uno de los aleatorios, 
        //En caso de coincidir con alguno la variable success pasa a "true"
        boolean success = false;
        for (int i=0; i<10; i++){
            if (luck == shuffle[i]){
                success = true;
            }       
        }
        //Con un While en lugar de un For
        //boolean success = false;
        int iterator =0;
        while (!success && iterator<10){
            if (luck == shuffle[iterator]){
                success = true;
            }
            iterator++;
        }
        
        /*
        * 9. Calcula cuántos (cantidad) números divisibles entre 5 hay en un 
        * intervalo dado por el usuario. Muestra cada uno de los números y 
        * finalmente muestra la cantidad total.
        */
        //El usuario introduce el intervalo
        System.out.println("Introduzca dos numeros para definir intervalo (mínimo y máximo):");
        int rStart = scan.nextInt();
        int rEnd = scan.nextInt();
        int count = 0;
        
        //Bucle para averiguar la longitud del array 
        for (int i=rStart; i<=rEnd; i++){
            if (i%5==0){
                count ++;
            }
        }        
        //Variable para indicar el índice del array de los divisores
        int j = 0;
        //se crea el array de los divisores y el bucle los almacena
        int divider[] = new int [count];
        for (int i=rStart; i<=rEnd; i++){
            if (i%5==0){
                divider[j]=i;
                j++;
            }
        }
        System.out.println("Divisores de 5:");
        for (int i=0; i<j; i++) {
            System.out.print(divider[i] + ", ");
        }
        System.out.println("\nLa cantidad de divisores es: " +j);
    }
    
}