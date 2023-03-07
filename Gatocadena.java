import java.util.Scanner;

public class gato {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu cadena, recuerda que son 9 caracteres entre X, O, _ ");
        String input = scanner.nextLine().toUpperCase();
        while (!input.matches("[XO_]{9}")) {
            System.out.print("LEE BIEN, SOLO CARACTERES ENTRE X, O, _. Intentalo de nuevo : ");
            input = scanner.nextLine().toUpperCase();
        }
        char[] chars = input.toCharArray();
        System.out.printf(" %c | %c | %c \n", chars[0], chars[1], chars[2]);
        System.out.println("---+---+---");
        System.out.printf(" %c | %c | %c \n", chars[3], chars[4], chars[5]);
        System.out.println("---+---+---");
        System.out.printf(" %c | %c | %c \n", chars[6], chars[7], chars[8]);
        System.out.println("Trabajo finalixado, PERDISTE gracias por participar" );
    }

}