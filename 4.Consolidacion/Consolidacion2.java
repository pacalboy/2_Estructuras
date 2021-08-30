import java.util.Scanner;

public class Consolidacion2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /* 
        * 0. El usuario introduce una nota. Si la nota es menor que 5 el usuario
        está suspenso. Si la nota es mayor o igual que 5 el usuario está aprobado.
        Si la nota está fuera de los límites (0-10), se notifica el error.
        */           
        System.out.println("Introduzca nota alumno");
        int nota = scan.nextInt();
        
        boolean aprobado;
        if (nota>=5 && nota<11){
            aprobado = true;
        }else if (nota<5 && nota>0){
            aprobado = false;         
        }else
            System.out.println("Nota fuera de los límites");
        

        /*
        * 1. Se pide al usuario que introduzca un día de la semana de forma numérica.
        * Se muestra el día de la semana en texto que le corresponde.
        * Gestionar posibles errores. 
        */        
        System.out.println("Introduzca día de la semana (en número)");
        int nSemana = scan.nextInt();
        
        String dia;
        switch (nSemana) {
            case 1:
                dia = "lunes";
                break;
            case 2:
                dia = "martes";
                break;
            case 3:
                dia = "miércoles";
                break;
            case 4:
                dia = "jueves";
                break;
            case 5:
                dia = "viernes";
                break;
            case 6:
                dia = "sábado";
                break;
            case 7:
                dia = "domingo";
                break;          
            default:
                dia = "error";
        }
        
        if(dia.equals("error")){
            System.out.println("Error al introducir datos");
        }else {
            System.out.println("Hoy es " + dia);
        }
        

        /*
        * 2. Crea un array de 4 enteros, pide un numero al usuario y guarda ese
        * numero y sus consecutivos en el array. Muestra el array.
        */        
        int array [] = new int [4];
        
        System.out.println("Introduzca un número");
        int num= scan.nextInt();
        
        for (int i=0; i<array.length; i++){
            array[i]= num;
            num++;            
        }
        
        for (int i:array) {
            System.out.println(i);
        }
        
        
        /*
        * 3. Crea un array con las letras de tu nombre. Guarda cada elemento del
        * array en un mismo string
        */        
        char nombre [] = {'Á','l','v','a','r','o'};
        String nombreStr = "";
        
        for (int i =0; i<nombre.length; i++){
            nombreStr += nombre[i];
        }
        
        System.out.println(nombreStr);
    }
    
}