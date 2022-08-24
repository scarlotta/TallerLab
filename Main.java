import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String libros[][] = new String[100][3];
        Menu();

    }
    public static void Menu(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la opcion a realizar: \n 1.- Agregar libro  \n 2.-Buscar libro \n 3.- Mostrar espacios usados \n 4.- Mostrar espacios disponibles \n 5.- Mostrar toda la coleccion \n 6.- Salir");
        int r = teclado.nextInt();
        switch (r){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                mostrarEspaciosDisponibles();
                break;
            case 5:
                mostrarTodaColeccion();
                break;
            case 6:
                break;
        }

    }
    public static String[][] crearLibro(){

        return new String[0][];
    }
    public static void agregarLibro(String[][] misLibros, String titulo, String autor, String editorial, int contador){
        String libro[] = new String[]{titulo, autor, editorial};

        misLibros[contador][0] = titulo;
        misLibros[contador][1] = autor;
        misLibros[contador][2] = editorial;

        System.out.println("El libro: " + titulo + " Ha sido agragado exitosamente.");
    }
    public static int totalLibros(String[][] libros){

        int contador = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i][0] != null && libros[i][1] != null && libros[i][2] != null){
                contador++;
            }
        }
        return contador;

    }

    public static int espaciosDisponibles(String[][] libros) {

        int contador = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i][0] == null && libros[i][1] == null && libros[i][2] == null){
                contador++;
            }
        }
        return contador;
    }
    public static void mostrarTotalLibros(){}
    public static void mostrarEspaciosDisponibles(){}
    public static void mostrarBusquedaLibroAutor(){}
    public static void mostrarTodaColeccion(){

    }



}
