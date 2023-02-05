/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eseku
 */
public class NumerosNaturales {
    
    
    //Si "n" es igual a 1 / Entra en el bloque siguiente
    
    public static int sumar(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumar(n - 1);
    }
    
    // Si N es mayor que 1 devuelve el valor de 'n' mas la suma de los numeros naturales
    //desde 1 hasta 'n-1
    
}
