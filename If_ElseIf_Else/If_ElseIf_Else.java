import java.util.Scanner;

public class If_ElseIf_Else {

    public static void main(String[] args) {
        /* 
        * Ej 1: Escribir un programa que pida dos números para calcular la división. 
        * Gestionar el error si se introduce un divisor 0 con una estructura condicional.
        */
        Scanner sc = new Scanner(System.in);
              
        int a , b;
        float res;
        
        System.out.println("Introduzca dos números para dividir");
        a = sc.nextInt();
        b = sc.nextInt();
        
        if (b != 0){
            res = (float) a/b;
            System.out.println("El resultado de la división es " + res);
        } else{
            System.out.println("Imposible dividir entre 0\n");
        }
        
        
        /* 
        * Ej 2: Para poder tributar es necesario ser mayor de 16 años y tener ingresos mensuales superiores a 1000€. 
        * El sistema pide al usuario edad e ingresos y si cumple los requisitos le aplica un 2.18% de impuestos.
        */
        int edad , ingresos;
        float impuestos;
        
        System.out.println("Introduzca su edad");
        edad = sc.nextInt();
                
        if (edad>16){
            System.out.println("Introduzca sus ingresos mensuales");
            ingresos = sc.nextInt();
            
            if (ingresos>1000){
            impuestos = (float) (ingresos*0.0218);
            System.out.println("Tendrá que pagar " + impuestos + " euros de impuestos\n");
            } else{
                System.out.println("No llega a los ingresos mínimos para tributar\n");
            }           
        }else
            System.out.println("No tiene la edad mínima para tributar\n");
        
            
        /* 
        * Ej 3: Se van a dividir los alumnos de la clase en tres grupos por orden alfabético. 
        * A-J K-S T-Z. El usuario introduce un nombre y el sistema dice a qué grupo pertenece. 
        */
        String nombre, apellido; 
        
        System.out.println("Introduzca su primer apellido");        
        apellido = sc.next();
        System.out.println("Introduzca su nombre");
        nombre = sc.next();
        
        char inicial = apellido.toUpperCase().charAt(0);
        int i = (int) inicial;
        
        if (i>64 && i<75){
            System.out.println("El alumno "+nombre+" "+apellido+" está en el grupo 1\n");
        }else if (i>74 && i<84){
            System.out.println("El alumno "+nombre+" "+apellido+" está en el grupo 2\n");
        }else 
            System.out.println("El alumno "+nombre+" "+apellido+" está en el grupo 3\n");
        
        
        /* 
        * Ej 4: Para la calidad de los productos de una empresa se establecen 3 niveles de rendimiento y unas puntuaciones: 
        * Inaceptable [0.0 - 0.4], Aceptable (0.4-0.6], Meritorio (0.6-1]. 
        * El precio del producto va en función de su calidad siendo éste factor multiplicado por 5.00€  (precio máximo). 
        * Crea un sistema que reciba una puntuación. Si la puntuación no está en los límites se acabará el programa. 
        * Si se introduce una puntuación correcta el sistema dirá a qué nivel pertenece y calculará su precio. 
        */
        float punt, precio;
        System.out.println("Introduzca puntuación de calidad entre 0 y 1");
        punt = sc.nextFloat();
        System.out.println("Puntuacion "+ punt);
        precio = punt*5;
        
        if (punt>=0.0 && punt<=0.4){
            System.out.println("El producto es \"Inaceptable\" y su precio es de " + precio);           
        } else if (punt>0.4 && punt<=0.6){
            System.out.println("El producto es \"Aceptable\" y su precio es de " + precio);
        } else if (punt>0.6 && punt<=1.0){
            System.out.println("El producto es \"Meritorio\" y su precio es de " + precio);
        } else {
            System.out.println("Valor de puntuación fuera de rango \nFin del programa");
        }
    }
    
}