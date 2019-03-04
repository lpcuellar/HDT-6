//package src;
/*
 *  Autor: Luis Pedro Cuéllar - 18220
 *  Fecha: 03/03/2019
 *  Curso: Algoritmos y Estructuras de Datos
 *
 *  Hoja de Trabajo 6 en la cual se trabajará con Java Collection Framework.
 *  El programa consiste en que el usuario escoja qué implementación de Map
 *  desea para el programa. Con la implemetación que escoja se tienen que hacer
 *  las funciones que estén en el menú.
 *
 */

import java.util.*;
import java.io.*;

public class Main {

  public static void main (String[] args) throws Exception {

    Scanner input = new Scanner(System.in);
    FactoryMap FM = new FactoryMap();
    Map mainMap = null;
    Map mainCollection = null;

    System.out.println(" *** BIENVENIDO AL DECK DE CARTAS *** ");
    System.out.println(" ");
    System.out.println("1. Escoger implementación de MAP");
    System.out.println("2. Salir");
    System.out.println("-------------------------------------------------------");
    System.out.print("Ingrese el número de la opción que desea hacer: ");
    int mainMenu = input.nextInt();

    if (mainMenu == 1) {
      System.out.println(" ");
      System.out.println(" *** Elija la implemetación de MAP que desea usar: *** ");
      System.out.println(" ");
      System.out.println("1. Usar HashMap");
      System.out.println("2. Usar TreeMap");
      System.out.println("3. Usar LinkedHashMap");
      System.out.println("-------------------------------------------------------");
      System.out.print("Ingrese el número de la opción que desea hacer: ");
      int mapMenu;
      mapMenu = input.nextInt();

      switch (mapMenu) {
        case 1:
          mainMap = FM.getMap(mapMenu);
          mainCollection = FM.getMap(mapMenu);
          break;

        case 2:
          mainMap = FM.getMap(mapMenu);
          mainCollection = FM.getMap(mapMenu);
          break;

        case 3:
          mainMap = FM.getMap(mapMenu);
          mainCollection = FM.getMap(mapMenu);
          break;

        default:
          System.out.println(" ");
          System.out.println("Ingrese una opción válida!");
          break;
      }

      int menu = 0;
      while (menu != 4) {
        System.out.println(" ");
        System.out.println("  *** Menú *** ");
        System.out.println(" ");
        System.out.println("1. Agregar una carta a su colección");
        System.out.println("2. Ver su colección");
        System.out.println("3. Ver cartas del juego");
        System.out.println("4. Salir del programa");
        System.out.println("-------------------------------------------------------");
        System.out.print("Ingrese el número de la opción que desea hacer: ");
        menu = input.nextInt();

        // Pedir el path al usuario, leer el texto, separarlo en el "|" e ir agregando
        // cada línea al mainMap
        System.out.println(" ");
        System.out.println("Ingrese el path del archivo: ");
        String location = input.nextLine();
        System.out.println(" ");
        FileReader file = new FileReader(location);
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();

        while (line != null) {
          String[] Cards = line.split("[|]", 2);
          String key = Cards[0];
          String value = Cards[1];
          mainMap.put(key, value);
        }

        reader.close();

        switch (menu) {
          case 1:
            System.out.println("Ingrese el nombre de la carta que desea agregar: ");
            String name = input.nextLine();
            if (mainMap.containsKey(name)) {
              mainMap.put(name, mainMap.get(name));
              System.out.println("La carta " + name + ", ha sido agregada!");
            } else {
              System.out.println("No se ha encontrado la carta, revisar que se esté ingresando bien!");
            }
            break;

          case 2:
            int userMenu = 0;
            while (userMenu != 4) {
              System.out.println(" *** COLECCIÓN DEL USUARIO ***");
              System.out.println(" ");
              System.out.println("1. Buscar una carta en su colección");
              System.out.println("2. Ver todas sus cartas");
              System.out.println("3. Ver todas sus cartas ordenadas por tipo");
              System.out.println("4. Ir al menú");
              System.out.println("-------------------------------------------------------");
              System.out.print("Ingrese el número de la opción que desea hacer: ");
              userMenu = input.nextInt();

              switch (userMenu) {
                case 1:
                  System.out.println(" ");
                  System.out.println("Ingrese el nombre de la carta que desea buscar: ");
                  String search = input.nextLine();
                  if (mainCollection.containsKey(search)) {
                    System.out.println("La carta " + search + ", es de tipo " + mainCollection.get(search));
                  } else {
                    System.out.println("No se ha encontrado la carta, revisar que se esté ingresando bien!");
                  }
                  break;

                case 2:
                  for (Map.Entry<String, String> entradas : mainCollection.entrySet()) {
                    String key = entradas.getKey();
                    String value = entradas.getValue();
                    System.out.println(key, value);
                  }
                  break;

                case 3:
                  for (Map.Entry<String, String> entradas : mainCollection.entrySet()) {
                    String key = entradas.getKey();
                    String value = entradas.getValue();

                    if (value.equals("Monstruo")){
                      ArrayList<String>Montruos = new ArrayList<>();
                      Montruos.add(key + value);
                      System.out.println(Montruos.toString());

                    }

                    else if (value.equals("Hechizo")){
                      ArrayList<String>Hechizo = new ArrayList<>();
                      Hechizo.add(key + value);
                      System.out.println(Hechizo.toString());

                    }

                    else{
                      ArrayList<String>Trampa = new ArrayList<>();
                      Trampa.add(key + value);
                      System.out.println(Trampa.toString());
                    }

                  }
                  break;

                case 4:
                  userMenu = 4;
                  break;

                default:
                  System.out.println("Ingrese una opción válida!");
                  break;
              }
            }
            break;

          case 3:
            int gameCards = 0;
            while (gameCards != 3) {
              System.out.println(" *** CARTAS DEL JUEGO ***");
              System.out.println(" ");
              System.out.println("1. Ver todas las cartas");
              System.out.println("2. Ver todas las cartas ordenadas por tipo");
              System.out.println("3. Salir del programa");
              System.out.println("-------------------------------------------------------");
              System.out.print("Ingrese el número de la opción que desea hacer: ");
              gameCards = input.nextInt();

              switch (gameCards) {
                case 1:
                  for (Map.Entry<String, String> entradas : mainMap.entrySet()) {
                    String key = entradas.getKey();
                    String value = entradas.getValue();
                    System.out.println(key, value);
                  }

                  break;

                case 2:
                  for (Map.Entry<String, String> entradas : mainMap.entrySet()) {
                    String key = entradas.getKey();
                    String value = entradas.getValue();

                    if (value.equals("Monstruo")){
                      ArrayList<String>Montruos = new ArrayList<>();
                      Montruos.add(key + value);
                      System.out.println(Montruos.toString());

                    }

                    else if (value.equals("Hechizo")){
                      ArrayList<String>Hechizo = new ArrayList<>();
                      Hechizo.add(key + value);
                      System.out.println(Hechizo.toString());

                    }

                    else{
                      ArrayList<String>Trampa = new ArrayList<>();
                      Trampa.add(key + value);
                      System.out.println(Trampa.toString());
                    }

                  }

                  break;

                case 3:
                  gameCards = 3;
                  break;

                default:
                  System.out.println("Ingrese una opción válida!");
                  break;


                case 4:
                  menu = 4;
                  break;

                default:
                  System.out.println("Ingrese una opción válida!");
                  break;

                break;
              }
            }
        }
      }
    }


    else if (mainMenu == 2) {
      System.out.println(" ");
      System.out.println("Gracias por usar el programa <3");
    }

    else {
      System.out.println(" ");
      System.out.println("Ingrese una opción válida!");
    }
  }
}
