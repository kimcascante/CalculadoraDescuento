package Adicional;

/**
 * Nombre del programa: 
 * Descripcion: Se quiere calcular la cuenta de un cliente en un hotel que se hospedó N número de días. 
    Si el cliente se hospedó más de 5 y menos de 10 días se le hace un descuento del 10%, y si se 
    hospeda más de 10 días se le hace un descuento del 15%.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp6w2 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        String cuentaCliente;
        int diasHospedado;

        escribir.println("Digite los dias que se hospedó:");
        diasHospedado = Integer.parseInt(leer.readLine());

        if(diasHospedado > 5 && diasHospedado < 10){
            cuentaCliente = "Descuento del 10%";
        } else if (diasHospedado > 10){
            cuentaCliente = "Descuento del 15%";
        } else {
            cuentaCliente = "No se le aplica descuento";
        }

        escribir.println(cuentaCliente);
    }
}