import java.util.Scanner;

public class CatalogoPeliculas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] titulos = new String[100];
        String[] directores = new String[100];
        String[] generos = new String[100];
        int[] anios = new int[100];
        double[] calificaciones = new double[100];

        int total = 0;
        int opcion;

        do {
            System.out.println("\n===== CATALOGO DE PELICULAS =====");
            System.out.println("1. Agregar pelicula");
            System.out.println("2. Mostrar peliculas");
            System.out.println("3. Buscar pelicula");
            System.out.println("4. Modificar pelicula");
            System.out.println("5. Eliminar pelicula");
            System.out.println("6. Informacion");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    if (total < 100) {
                        System.out.print("Titulo: ");
                        titulos[total] = sc.nextLine();

                        System.out.print("Director: ");
                        directores[total] = sc.nextLine();

                        System.out.print("Genero: ");
                        generos[total] = sc.nextLine();

                        System.out.print("Año: ");
                        anios[total] = sc.nextInt();

                        System.out.print("Calificacion: ");
                        calificaciones[total] = sc.nextDouble();
                        sc.nextLine();

                        total++;
                        System.out.println("Pelicula agregada.");
                    } else {
                        System.out.println("Catalogo lleno.");
                    }
                    break;

                case 2:
                    if (total == 0) {
                        System.out.println("No hay peliculas.");
                    }

                    for (int i = 0; i < total; i++) {
                        System.out.println("\nPelicula #" + (i + 1));
                        System.out.println("Titulo: " + titulos[i]);
                        System.out.println("Director: " + directores[i]);
                        System.out.println("Genero: " + generos[i]);
                        System.out.println("Año: " + anios[i]);
                        System.out.println("Calificacion: " + calificaciones[i]);
                    }
                    break;

                case 3:
                    System.out.print("Titulo que desea buscar: ");
                    String buscar = sc.nextLine();
                    boolean existe = false;

                    for (int i = 0; i < total; i++) {
                        if (titulos[i].equalsIgnoreCase(buscar)) {
                            System.out.println("Pelicula encontrada.");
                            System.out.println(titulos[i] + " - " + directores[i]);
                            System.out.println(generos[i] + " - " + anios[i]);
                            System.out.println("Calificacion: " + calificaciones[i]);
                            existe = true;
                        }
                    }

                    if (!existe) {
                        System.out.println("Pelicula no encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Titulo que desea modificar: ");
                    String modificar = sc.nextLine();
                    int pos = -1;

                    for (int i = 0; i < total; i++) {
                        if (titulos[i].equalsIgnoreCase(modificar)) {
                            pos = i;
                        }
                    }

                    if (pos != -1) {
                        System.out.println("1. Titulo");
                        System.out.println("2. Director");
                        System.out.println("3. Genero");
                        System.out.println("4. Año");
                        System.out.println("5. Calificacion");
                        System.out.print("Que desea cambiar: ");
                        int cambio = sc.nextInt();
                        sc.nextLine();

                        switch (cambio) {
                            case 1:
                                System.out.print("Nuevo titulo: ");
                                titulos[pos] = sc.nextLine();
                                break;
                            case 2:
                                System.out.print("Nuevo director: ");
                                directores[pos] = sc.nextLine();
                                break;
                            case 3:
                                System.out.print("Nuevo genero: ");
                                generos[pos] = sc.nextLine();
                                break;
                            case 4:
                                System.out.print("Nuevo año: ");
                                anios[pos] = sc.nextInt();
                                break;
                            case 5:
                                System.out.print("Nueva calificacion: ");
                                calificaciones[pos] = sc.nextDouble();
                                break;
                            default:
                                System.out.println("Opcion incorrecta.");
                        }

                        System.out.println("Proceso terminado.");
                    } else {
                        System.out.println("Pelicula no encontrada.");
                    }
                    break;

                case 5:
                    System.out.print("Titulo que desea eliminar: ");
                    String eliminar = sc.nextLine();
                    pos = -1;

                    for (int i = 0; i < total; i++) {
                        if (titulos[i].equalsIgnoreCase(eliminar)) {
                            pos = i;
                        }
                    }

                    if (pos != -1) {
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        System.out.print("Confirmar eliminacion: ");
                        int confirmar = sc.nextInt();
                        sc.nextLine();

                        if (confirmar == 1) {
                            for (int i = pos; i < total - 1; i++) {
                                titulos[i] = titulos[i + 1];
                                directores[i] = directores[i + 1];
                                generos[i] = generos[i + 1];
                                anios[i] = anios[i + 1];
                                calificaciones[i] = calificaciones[i + 1];
                            }

                            total--;
                            System.out.println("Pelicula eliminada.");
                        } else {
                            System.out.println("Operacion cancelada.");
                        }
                    } else {
                        System.out.println("Pelicula no encontrada.");
                    }
                    break;

                case 6:
                    System.out.println("\nCATALOGO DE PELICULAS");
                    System.out.println("Lenguaje: Java");
                    System.out.println("Tipo: Programa de consola");
                    System.out.println("Equipo: 1");
                    System.out.println("Integrantes:");
                    System.out.println("- Johan Viloria");
                    System.out.println("- Alexander Lopez");

                    break;

                case 7:
                    System.out.println("Haz salido del sistema.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 7);

        sc.close();
    }
}
