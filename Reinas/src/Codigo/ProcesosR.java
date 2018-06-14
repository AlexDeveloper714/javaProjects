package Codigo;

import java.util.*;

public class ProcesosR {

    public ArrayList<String> almacenarPosicion(int fila, int columna) {
        ArrayList<String> reinas = new ArrayList();
        return null;

    }

    public String[][] ubicarReina(int fila, int columna, String[][] tabla) {
        int i = 0, j = 0;
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla.length; j++) {
                if (fila == i) {
                    tabla[i][j] = "-";
                }
                if (columna == j) {
                    tabla[i][j] = "|";
                }
                //Pinta las diagonales principales en la coordenada
                if (i - j == fila - columna) {
                    tabla[i][j] = "*";
                }
                //Pinta todas las diagonales secundarias en la coordenada
                if (i + j == fila + columna) {
                    tabla[i][j] = "/";
                }
            }

        }
        tabla[fila][columna] = "R";
        return tabla;
    }

    public String[][] borrarReina(int fila, int columna, String[][] tabla) {
        int i = 0, j = 0;
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla.length; j++) {
                if (fila == i) {
                    tabla[i][j] = null;
                }
                if (columna == j) {
                    tabla[i][j] = null;
                }
                if (i - j == fila - columna) {
                    tabla[i][j] = null;
                }
                if (i + j == fila + columna) {
                    tabla[i][j] = null;
                }
            }

        }
        return tabla;
    }
//Falta el backtracking y la recursividad (Aunque da una solución aprox en algunos)
//Use break apenas llegase al tope porque no tengo algo que modifique bien el arreglo...

    public String[][] resolverReina(String[][] tabla, int fila, int columna) {
        int contador = 1, i = 0, j = 0;
        ProcesosR recursivo = new ProcesosR();
        tabla = recursivo.ubicarReina(fila, columna, tabla);
        System.out.println("Coordenadas: i-j:reina");
        while (contador != 8) {
            if (tabla[i][j] == null) {
                tabla = recursivo.ubicarReina(i, j, tabla);
                contador++;
                System.out.println(i + "-" + j + " : " + contador);
            } else {
                i++;
                if (i == 8) {
                    j++;
                    i = 0;
                }
                if (j == 8) {
                    break;
                }
            }
        }
        return tabla;
    }

}
