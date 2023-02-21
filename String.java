import java.util.Scanner;
public class String {
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Introduce tu profesion: ");
        String profesion = teclado.nextLine();

        System.out.println("Introduce tu nacionalidad: ");
        String nacionalidad = teclado.nextLine();

        System.out.println("Nombre: " + nombre);
        System.out.println("Profesion: " + profesion);
        System.out.println("Nacionalidad: " + nacionalidad);



    }
}
