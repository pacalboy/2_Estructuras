public class ForFacil {

    public static void main(String[] args) {
        // Ej 0. Muestra el usuario 5 veces
        for (int i = 0; i < 5; i++) {
            System.out.println("el usuario");
        }

        // Ej 1. Muestra los números del 1 al 10
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // Ej 2. Muestra los números del 10 al 0
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        // Ej 3. Muestra los números del 0 al 20 de 2 en dos
        for (int i = 0; i < 21; i+=2) {
            System.out.println(i);
        }

        // Ej 4. Muestra los múltiplos de 3 del 0 al 50. (0, 3, 6, 9, 12, 15, ..., 48)
        for (int i = 0; i < 50; i+=3) {
            System.out.println(i);
        }

        //  Ej 5. Muestra el nombre del usuario 30 veces mostrando el número de cada vez
        for (int i = 1; i < 31; i++) {
            System.out.println(i + " - Ángela");
        }
    }
    
}