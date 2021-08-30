import java.util.Scanner;

public class ForDificil {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        //1. Escriba un programa que pida la altura de un triángulo y lo dibuje con caracteres producto (*): 
        System.out.println("Introduzca altura del triángulo");
        int h1 = scan.nextInt();
        for (int i=0; i<h1; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print('\n');
        }
        
        
        //2. Escriba un programa que pida la altura de un triángulo y lo dibuje con caracteres producto (*):
        System.out.println("Introduzca altura del triángulo");
        int h2 = scan.nextInt();
        for (int i=0; i<h2; i++){
            for (int j=h2; j>i; j--){
                System.out.print("* ");
            }
            System.out.print('\n');
        }
        
        
        //3. a)Escriba un programa que pida la altura de una línea y lo dibuje con caracteres producto (*) y resta (-): 
        System.out.println("Introduzca altura del triángulo");
        int h3a = scan.nextInt();
        for (int i=0; i<h3a; i++){
            for (int j=0; j<=i; j++){
                System.out.print("- ");
            }
            System.out.print("*\n");
        }
        
        
        //3. b)A partir del programa anterior, escriba un programa que pida la altura de una línea y lo dibuje con caracteres producto (*) y resta (-):  
        System.out.println("Introduzca altura del triángulo");
        int h3b = scan.nextInt();
        for (int i=0; i<h3b; i++){
            for (int j=0; j<i; j++){
                System.out.print("- ");
            }
            System.out.print("*\n");
        }
        
        
        //3. c)A partir del programa anterior, escriba un programa que pida la altura de una línea y lo dibuje con caracteres producto (*) y espacios:   
        System.out.println("Introduzca altura del triángulo");
        int h3c = scan.nextInt();
        for (int i=0; i<h3c; i++){
            for (int j=0; j<i; j++){
                System.out.print("  ");
            }
            System.out.print("*\n");
        }
        
        
        //4. a)Escriba un programa que pida la altura de una línea y lo dibuje con caracteres producto (*) y resta (-): 
        System.out.println("Introduzca altura del triángulo");
        int h4a = scan.nextInt();
        for (int i=0; i<h4a; i++){
            for (int j=h4a; j>i; j--){
                System.out.print("- ");
            }
            System.out.print("*\n");
        }
        
        
        //4. b)A partir del programa anterior, escriba un programa que pida la altura de una línea y lo dibuje con caracteres producto (*) y resta (-): 
        System.out.println("Introduzca altura del triángulo");
        int h4b = scan.nextInt();
        for (int i=0; i<h4b; i++){
            for (int j=h4b-1; j>i; j--){
                System.out.print("- ");
            }
            System.out.print("*\n");
        }
        
        
        //4. c)A partir del programa anterior, escriba un programa que pida la altura de una línea y lo dibuje con caracteres producto (*) y espacios:
        System.out.println("Introduzca altura del triángulo");
        int h4c = scan.nextInt();
        for (int i=0; i<h4c; i++){
            for (int j=h4c-1; j>i; j--){
                System.out.print("  ");
            }
            System.out.print("*\n");
        }  
        
        
        //5. a)Escriba un programa que pida la altura de un triángulo y lo dibuje con caracteres producto (*) y resta (-):
        System.out.println("Introduzca altura del triángulo");
        int h5a = scan.nextInt();
        for (int i=0; i<h5a; i++){
            for (int j=h5a; j>i; j--){
                System.out.print("- ");
            }
            for (int k=0; k<=i; k++){
                    System.out.print("* ");
            }
            System.out.print('\n');
        }
        
        
        //5. b)A partir del programa anterior, escriba un programa que pida la altura de un triángulo y lo dibuje con caracteres producto (*) y resta (-):
        System.out.println("Introduzca altura del triángulo");
        int h5b = scan.nextInt();
        for (int i=0; i<h5b; i++){
            for (int j=h5b-1; j>i; j--){
                System.out.print("- ");
            }
            for (int k=0; k<=i; k++){
                    System.out.print("* ");
            }
            System.out.print('\n');
        }
        
        
        //5. c)A partir del programa anterior, escriba un programa que pida la altura de un triángulo y lo dibuje con caracteres producto (*) y espacios: 
        System.out.println("Introduzca altura del triángulo");
        int h5c = scan.nextInt();
        for (int i=0; i<h5c; i++){
            for (int j=h5c-1; j>i; j--){
                System.out.print("  ");
            }
            for (int k=0; k<=i; k++){
                    System.out.print("* ");
            }
            System.out.print('\n');
        }
        
        
        //6. a)Escriba un programa que pida la altura de un triángulo y lo dibuje con caracteres producto (*) y resto (-):
        System.out.println("Introduzca altura del triángulo");
        int h6a = scan.nextInt();
        for (int i=0; i<h6a; i++){
            for (int j=0; j<=i; j++){
                System.out.print("- ");
            }
            for (int k=h6a; k>i; k--){
                    System.out.print("* ");
            }
            System.out.print('\n');
        }
        
        
        //6. b)A partir del programa anterior, escriba un programa que pida la altura de un triángulo y lo dibuje con caracteres producto (*) y resto (-): 
        System.out.println("Introduzca altura del triángulo");
        int h6b = scan.nextInt();
        for (int i=0; i<h6b; i++){
            for (int j=0; j<i; j++){
                System.out.print("- ");
            }
            for (int k=h6b; k>i; k--){
                    System.out.print("* ");
            }
            System.out.print('\n');
        }
        
        
        //6. c)A partir del programa anterior, escriba un programa que pida la altura de un triángulo y lo dibuje con caracteres producto (*) y espacios: 
        System.out.println("Introduzca altura del triángulo");
        int h6c = scan.nextInt();
        for (int i=0; i<h6c; i++){
            for (int j=0; j<i; j++){
                System.out.print("  ");
            }
            for (int k=h6c; k>i; k--){
                    System.out.print("* ");
            }
            System.out.print('\n');
        }
        
        
        //7. Escriba un programa que pida la anchura de un triángulo y lo dibuje con caracteres producto (*):
        System.out.println("Introduzca anchura del triángulo");
        int h7 = scan.nextInt();
        
        for (int i=0; i<h7; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print('\n');
        }
        
        for (int i=0; i<h7; i++) {
            for (int j=h7-1; j>i; j--){
                System.out.print("* ");
            }
            System.out.print('\n');
        }
        
        
        //8. Escriba un programa que pida la anchura de un triángulo y lo dibuje con caracteres producto (*):
        System.out.println("Introduzca altura del triángulo");
        int h8 = scan.nextInt();
        for (int i=0; i<h8; i++){
            for (int j=h8-1; j>i; j--){
                System.out.print("  ");
            }
            for (int k=0; k<=i; k++){
                    System.out.print("* ");
            }
            for (int l=0; l<i; l++) {
                System.out.print("* ");
            }
            System.out.print('\n');
        }
        
        
        //9. Escriba un programa que pida la altura del dibujo y lo dibuje con caracteres producto (*):
        System.out.println("Introduzca altura del triángulo");
        int h9 = scan.nextInt();
        for (int i=0; i<h9; i++){
            for (int j=h9-1; j>i; j--){
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int k=1; k<i*2; k++){
                System.out.print("  ");
            }
            if (i!= 0){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}