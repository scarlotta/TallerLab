import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu();

    }
    public static void Menu(){
        Scanner teclado = new Scanner(System.in);
        String[][] libros = new String[100][3];

        int continuar = 1;

        do {

            System.out.println("Que operacion desea realizar? \n[0]Agregar Libro \n[1]Buscar Libro \n[2]Mostrar Espacios Usados \n[3]Mostrar Espacios Disponibles \n[4] Mostrar Toda la Coleccion");
            int opcion = teclado.nextInt();

            while (opcion <0 || opcion>4) {
                System.out.println("Que operacion desea realizar? \n[0]Agregar Libro \n[1]Buscar Libro \n[2]Mostrar Espacios Usados \n[3]Mostrar Espacios Disponibles \n[4] Mostrar Toda la Coleccion");
                opcion = teclado.nextInt();
            }

            switch(opcion){
                case 0:
                    System.out.println("Por favor introduzca el titulo");
                    String z = teclado.nextLine();
                    String titulo = teclado.nextLine();
                    System.out.println("Por favor introduzca el autor");
                    String autor = teclado.nextLine();
                    System.out.println("Por favor introduzca la editorial");
                    String editorial = teclado.nextLine();

                    agregarLibro(libros, titulo, autor, editorial, totalLibros(libros));
                    break;
                case 1:
                    buscarLibro(libros);
                    break;
                case 2:
                    System.out.println("Espacios ocupados: " + totalLibros(libros));
                    break;
                case 3:
                    System.out.println("Espacios disponibles: " + espaciosDisponibles(libros));
                    break;
                case 4:
                    mostrarTodaColeccion(libros);
                    break;

            }

            System.out.println("Si desea realizar otra operacion introduzca cualquier numero entero. [0] Para terminar.");
            continuar = teclado.nextInt();
        }while (continuar != 0);


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
    public static void buscarLibro(String[][] misLibros){
        Scanner teclado = new Scanner(System.in);
        boolean encontrado = false;

        System.out.println("Por que metodo desea buscar: \n [0] Titulo \n [1] Autor \n [2] Editorial");
        int eleccion = teclado.nextInt();
        while (eleccion<0 || eleccion >2) {
            System.out.println("Por que metodo desea buscar: \n [0] Titulo \n [1] Autor \n [2] Editorial");
            eleccion = teclado.nextInt();
        }
        switch (eleccion){
            case 0:
                System.out.println("Por favor ingrese el titulo del libro.");
                String z = teclado.nextLine(); // para que no se buggee el scanner
                String titulo = teclado.nextLine();
                for (int i = 0; i < misLibros.length; i++) {
                    if (titulo.equals(misLibros[i][0])){
                        System.out.println("Libro encontrado: " + misLibros[i][0] +" "+ misLibros[i][1] +" "+ misLibros[i][2]);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("El libro no se encuentra en la coleccion.");
                }
                break;
            case 1:
                System.out.println("Por favor ingrese el autor del libro.");
                z = teclado.nextLine(); // para que no se buggee el scanner
                String autor = teclado.nextLine();
                for (int i = 0; i < misLibros.length; i++) {
                    if (autor.equals(misLibros[i][1])){
                        System.out.println("Libro encontrado: " + misLibros[i][0] +" "+ misLibros[i][1] +" "+ misLibros[i][2]);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("El libro no se encuentra en la coleccion.");
                }
                break;
            case 2:
                System.out.println("Por favor ingrese la editorial del libro.");
                z = teclado.nextLine(); // para que no se buggee el scanner
                String editorial = teclado.nextLine();
                for (int i = 0; i < misLibros.length; i++) {
                    if (editorial.equals(misLibros[i][2])){
                        System.out.println("Libro encontrado: " + misLibros[i][0] +" "+ misLibros[i][1] +" "+ misLibros[i][2]);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("El libro no se encuentra en la coleccion.");
                }
                break;
        }
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
    public static void mostrarTodaColeccion(String [][] misLibros){

        System.out.println("Coleccion de libros completa:");
        for (int i = 0; i < misLibros.length; i++) {

            if (misLibros[i][0] != null && misLibros[i][1] != null && misLibros[i][2] != null){
                System.out.println("Libro " + i + ": Titulo: " + misLibros[i][0] +" Autor: "+ misLibros[i][1] +" Editorial: "+ misLibros[i][2]);
            }

        }
    }
}
