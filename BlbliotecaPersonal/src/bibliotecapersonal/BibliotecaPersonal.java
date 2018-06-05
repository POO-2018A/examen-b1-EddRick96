package bibliotecapersonal;
import java.util.Scanner;
/**
 *
 * @author ESFOT
 */
public class BibliotecaPersonal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = 0, subcont = 0;
        int numLibros = 1;
        Scanner scan = new Scanner(System.in);
        Libros[] libro = new Libros[numLibros];
        Autor[] autor = new Autor[numLibros];
        System.out.println("\t\tBIENVENIDO A TU BIBLIOTECA PERSONAL\n");
        do{
            System.out.println("\tMenú de opciones");
            System.out.println("1. Ingresar un nuevo libro a la biblioteca");
            System.out.println("2. Ver lista de libros favoritos");
            System.out.println("3. Contar libros de autor");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opción");
            op = scan.nextInt();
            switch(op){
                case 1:
                     if(numLibros == 10){
                            System.out.println("Se ha completado el cupo máximo de libros "+numLibros);
                            break;
                    }
                    for(int i = subcont; i < libro.length; i++ ){
                        System.out.println("Ingrese el título del libro:");
                        String titulo = scan.nextLine();
                        System.out.println("Ingrese el autor del libro:");
                        String nombreAutor = scan.nextLine();
                        System.out.println("Ingrese el pais del autor");
                        String pais =scan.nextLine();
                        autor[i]= new Autor(nombreAutor,pais);
                        System.out.println("Ingrese el año del libro:");
                        int anio = scan.nextInt();
                        System.out.println("Desea guardar en favoritos, SI(1) o No(2):");
                        boolean favorito = false;
                        int guardar = scan.nextInt();
                        if(guardar == 1){
                            favorito = true;
                        }
                        libro[i] = new Libros(titulo,autor,anio,favorito);
                                              
                    }
                    
                    subcont++;
                    numLibros++;
                    break;
                case 2:
                    if(libro == null){
                        System.out.println("No se ha ingresado ningun libro");
                        break;
                    }
                    System.out.println("\tLista de favoritos");
                    System.out.println(libro);
                    break;
                case 3:
                    if(autor == null){
                        System.out.println("No se ha ingresado ningun libro");
                        break;
                    }
                    boolean repetido = false;
                    for(int j = 0; j < autor.length; j++){
                        if(autor.equals(autor[j])){
                            System.out.println(autor);
                            repetido = true;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Adios, gracias por ingresar a su biblioteca personal");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while(op < 4);
    }
    
}
