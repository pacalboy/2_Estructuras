import java.util.Scanner;

public class While_enClase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int suma = 0;
        int actual;
        boolean seguir = true;
        
        while(seguir){
            System.out.println("Introduce número");
            actual = scan.nextInt();
            
            if(actual == -1){
                seguir = false;
            }else{
                suma +=actual;
            }
        }
        
        
        int contador1 = 0;
        char letra1 = 's';
        
        while (letra1 == 's'){
            contador1++;
            letra1 = scan.next().charAt(0);
        }
        System.out.println(contador1);
        
        
        
        int contador2 = 0;
        char letra2 = scan.next().charAt(0);
        
        boolean letraS = letra2 == 's';
        
        while(letraS){
            contador2 ++;
            letra2 = scan.next().charAt(0);
            letraS = letra2 == 's';
        }
        System.out.println(contador2);
        
        
        
        String contraseñaOficial = "poniente";
        String contraseñaIntro;
        boolean passCorrecto = false;
        int nIntentos = 0;
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Introduzca contraseña");
            contraseñaIntro = scan.next();
            nIntentos ++;
            
            if(contraseñaIntro.equals(contraseñaOficial)){
                passCorrecto = true;
            }
        continuar = nIntentos <3 && !passCorrecto;   
        }
        
        
        String contraseñaOficial2 = "poniente";
        String contraseñaIntro2;
        boolean passCorrecto2 = false;
        int nIntentos2 = 0;
        boolean continuar2 = true;
        
        while (continuar2) {
            System.out.println("Introduzca contraseña");
            contraseñaIntro2 = scan.next();
            nIntentos2 ++;
            
            passCorrecto2 = scan.next().equals(contraseñaOficial2);
            
        continuar2 = nIntentos2 <3 && !passCorrecto2;   
        }
    }
    
}
