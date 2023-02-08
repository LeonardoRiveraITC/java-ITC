
package borrachito;

import java.util.Scanner;

/**
 *
 * @author AndroidB
 */
public class Borrachito {
  static int numeroRenglones;
  static int numeroColumnas;
  static int numerocasos;
  static String[][] matrizOriginal;
  static String[][] matrizBorrachito;
  static Scanner teclado;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           teclado = new Scanner(System.in);
               int pasosTotales;
    boolean borrachitoCiclado;
    boolean borrachitoFuera;
    int renglon;
    int columna;
    String entrada;
    String direccion;
    int pasos;
    entrada = teclado.nextLine();
    String[] datos = entrada.split(" ");
    numeroRenglones = Integer.parseInt(datos[0]);
    numeroColumnas = Integer.parseInt(datos[1]);
    matrizOriginal = new String[numeroRenglones][numeroColumnas];
    matrizBorrachito = new String[numeroRenglones][numeroColumnas];

    for (int i = 0; i < numeroRenglones ; i++) {
      entrada = teclado.nextLine();
      datos = entrada.split(" ");
      for (int j = 0; j < numeroColumnas; j++) {
        matrizOriginal[i][j] = datos[j];
      }
    }
    for (int i = 0; i < numeroRenglones ; i++) {
      for (int j = 0; j < numeroColumnas ; j++) {

      }

    }

    entrada = teclado.nextLine();
    numerocasos = Integer.parseInt(entrada);

    for (int i = 0; i < numerocasos; i++) {
      copiaMatrices(numeroRenglones, numeroColumnas);
      pasosTotales = 0;
      borrachitoCiclado = false;
      borrachitoFuera = false;

      entrada = teclado.nextLine();
      datos = entrada.split(" ");
      renglon = Integer.parseInt(datos[0]);

      columna = Integer.parseInt(datos[1]);

      while (!borrachitoFuera && !borrachitoCiclado){
        entrada = matrizBorrachito[renglon][columna];
        if (entrada.equals("X")) {
            borrachitoCiclado = true;
            System.out.println("borrachito está ciclado");
        }
        else {
            direccion = entrada.substring(0,1);

            pasos = Integer.parseInt(entrada.substring(1));
            matrizBorrachito[renglon][columna] = "X";
            for (int j = 0; j < pasos && !borrachitoFuera ; j++) {
                if (direccion.equals("A"))
                  if (renglon - 1 >= 0) {
                      renglon--;
                      pasosTotales++;
                  }
                  else
                    borrachitoFuera = true;
                if (direccion.equals("B"))
                  if (renglon + 1 < numeroRenglones) {
                      renglon++;
                      pasosTotales++;
                  }
                  else
                    borrachitoFuera = true;
                if (direccion.equals("I"))
                  if (columna - 1 >= 0) {
                      columna--;
                      pasosTotales++;
                  }
                  else
                    borrachitoFuera = true;
                if (direccion.equals("D"))
                  if (columna + 1 < numeroColumnas) {
                      columna++;
                      pasosTotales++;
                  }
                  else
                    borrachitoFuera = true;
          }
        }
      }
      if (borrachitoFuera)
        System.out.println(pasosTotales);
      if (borrachitoCiclado)
        System.out.println(-1);
    }
  }

  static void copiaMatrices(int numReng, int numCol){
    for (int i = 0; i < numReng; i++)
      for (int j = 0; j < numCol; j++)
        matrizBorrachito[i][j] = matrizOriginal[i][j];
  }

}



