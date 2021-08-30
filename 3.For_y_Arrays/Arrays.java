import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        /* 
        * Para cada ejercicio muestra el array de caracteres antes de modificarlo 
        * y después. Utiliza un bucle como este para mostrar:
        * for( <tipo> elemento : <nombreArray>)
        *   sout(elemento)
        */
        
        
        /*
        * 0. Crea un array con 5 caracteres. Accede al último elemento y 
        * modifícalo por el carácter '*'
        */
        char charac[] = {'h', 'o', 'l', 'a', '!'};
        for (int c:charac){
            System.out.println((char)c);
        }
        charac[4] = '*';
        for (int c:charac){
            System.out.println((char)c);
        }
        
        
        /*
        * 1. Pide al usuario que introduzca un número. Crea un array de ese tamaño. 
        * No es necesario que introduzcas valores. 
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca tamaño del array");
        int size = scan.nextInt();
        int array[] = new int [size];
        
        
        /*
        * 2. Crea un array de 4 posiciones de tipo entero. 
        * Accede a cada elemento y asígnale el valor 0. 
        */
        int fourPos[] = new int [4];
        fourPos[0] = 0;
        fourPos[1] = 0;
        fourPos[2] = 0;
        fourPos[3] = 0;
        for (int pos:fourPos){
            System.out.println(pos);
        }
        
        
        /*
        * 3. Crea un array de 3 elementos de tipo float. 
        * Pide al usuario que introduzca 3 valores y almacénalos en cada elemento. 
        */
        float decimals[] = new float [3];
        System.out.println("Introduzca tres valores numéricos (pueden incluir decimales)");
        decimals[0] = scan.nextFloat();
        decimals[1] = scan.nextFloat();
        decimals[2] = scan.nextFloat();
        for (int i=0; i<3; i++){
            System.out.println(decimals[i]);
        }
        
        
        /*
        * 4. Crea un array de 5 posiciones de int. Pide al usuario que 
        * introduzca un entero. Asigna ese entero a cada elemento del array. 
        * Es decir, todos los elementos tendrán el mismo valor. 
        */
        int fivePos[] = new int [5];
        System.out.println("Introduzca un valor numérico");
        int num = scan.nextInt();
        
        fivePos[0] = num;
        fivePos[1] = num;
        fivePos[2] = num;
        fivePos[3] = num;
        fivePos[4] = num;
        
        for (int pos:fivePos){
            System.out.println(pos);
        }
        
        
        /*
        * 5. Crea un array de 6 elementos e inicialízalo con la siguiente instrucción:
        *   int valores[] = {2,4,5,6,2,4};
        * Haz que tu programa acceda a todos los elementos y almacene 
        * la suma de todos los valores. 
        */
        int valores[] = {2,4,5,6,2,4};
        int suma = 0;
        suma += valores[0];
        suma += valores[1];
        suma += valores[2];
        suma += valores[3];
        suma += valores[4];
        suma += valores[5];
        
        System.out.println("La suma es: " + suma);
        
        
        /*
        * 6. Crea e inicializa un array de 4 elementos de tipo char, 
        * todos los elementos serán la letra 'c'. Ahora cambia el valor de todos
        * los elementos para que almacenen el carácter 'y'. 
        */
        char elements[] = {'c', 'c', 'c', 'c'};
        elements[0] = 'y';
        elements[1] = 'y';
        elements[2] = 'y';
        elements[3] = 'y';
        
        for (char ch:elements){
            System.out.println(ch);
        }
    }
    
}