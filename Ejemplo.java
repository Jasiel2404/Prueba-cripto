import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del usuario
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = scanner.nextLine();

        // Solicitar la edad del usuario
        System.out.print("¿Cuántos años tienes? ");
        int edad = scanner.nextInt();

        // Imprimir un mensaje de saludo
        System.out.println("\n¡Hola, " + nombre + "! Tienes " + edad + " años.");

        scanner.close();
    }
}
