import java.util.Scanner;
public class tareap2{

   public static void main(String[] args){
        Scanner nm = new Scanner (System.in);
        System.out.println("Escribe tu nombre ");
        String nombre = nm.nextLine();
        System.out.println("Nombre: " + nombre);

        Scanner cm = new Scanner (System.in);
        System.out.println("Escribe tu profesión ");
        String profesion = cm.nextLine();
        System.out.println("Profesion: " + profesion);

        Scanner dm = new Scanner (System.in);
        System.out.println("¿En qur pais vives? ");
        String pais = dm.nextLine();
        System.out.println("Pais: " + pais);
   }
}
