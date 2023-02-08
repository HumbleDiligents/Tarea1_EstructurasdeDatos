/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Binario {
    
    public boolean esBinario(int num) {
      // Convertir el número a una cadena   
    String str = Integer.toString(num);
    
       // Recorrer cada caracter de la cadena  
    for (int i = 0; i < str.length(); i++) {
       
        //se utiliza para obtener el carácter en la posición  (i)
        char c = str.charAt(i);
        
        // Verificar si el carácter es distinto de 0 o 1
        if (c != '0' && c != '1') {
            
            // Si es distinto, devolver false
            return false;
        }
    }
     // Si se recorrieron todos los caracteres sin encontrar ningún
    // carácter distinto de 0 o 1, devolver true
    return true;
}
    
}
