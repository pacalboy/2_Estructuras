import java.util.Random;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        /*
        * 0. Matriz de tipo string va a almacenar 5 libros. Un libro son dos
        * strings (título y autor). Pide por pantalla título y autor y rellena la 
        * matriz. Imprime la matriz.
        */
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        scan = scan.useDelimiter("\n");
        
        String libros [][] = new String [5][2];
        
        for (int i=0; i<5; i++){
            System.out.println("\nIntroduzca título y autor");
            for (int j=0; j<2; j++){
                libros [i][j] = scan.next();                
            }
        }
        
        for (int i=0; i<5; i++){
            System.out.println('\n');
            for (int j=0; j<2; j++){
                System.out.print(libros[i][j]+ " - ");
            }
        }
        
        
        /*
        * 1. Matriz que contiene notas trimestrales de los alumnos, tantos alumnos
        * como indique el usuario. Cada fila es un alumno y cada columna nota trimestral.
        * Rellena la matriz con números aleatorios double. Haz la nota media de 
        * cada alumno e introdúcela en un array.
        */       
        System.out.println("\nIntroduzca número de alumnos");
        int alumnos = scan.nextInt();
        
        float notasTrimestres [][] = new float [alumnos][3];
        float notasFinales [] = new float [alumnos];
        
        for (int i=0; i<alumnos; i++){
            for (int j=0; j<3; j++) {
                notasTrimestres [i][j] = (float)random.nextInt(100)/10;
            }
        }
       
        for (int i=0; i<alumnos; i++){
            for (int j=0; j<3; j++){
                notasFinales[i] += notasTrimestres [i][j];
            }
        }
        
        for (int i=0; i<alumnos; i++){
            notasFinales[i] /=3;
        }
        
        for (float nota:notasFinales){
            System.out.println(nota);
        }
        
    }
    
}
