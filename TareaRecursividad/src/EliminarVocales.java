


public class EliminarVocales {
    public String eliminaVocales(String cadena) {
        
        //Si la longitud de la cada es 0 devuelve la cadena vacia 
    if (cadena.length() == 0) {
        return cadena;
    }
    
    // Si cadena.chartAT es una vocal se devuelve la eliminacion de la vocal en la recursividad (eliminaVocales)
    if (cadena.charAt(0) == 'a' || cadena.charAt(0) == 'e' || cadena.charAt(0) == 'i' || cadena.charAt(0) == 'o' || cadena.charAt(0) == 'u' || 
        cadena.charAt(0) == 'A' || cadena.charAt(0) == 'E' || cadena.charAt(0) == 'I' || cadena.charAt(0) == 'O' || cadena.charAt(0) == 'U') {
        return eliminaVocales(cadena.substring(1));
        //si cadena.chjartAT no es una vocal devuelve el caracter concatenado con
    } else {
        return cadena.charAt(0) + eliminaVocales(cadena.substring(1));
    }
}
}
