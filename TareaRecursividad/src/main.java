
public class main {

    
    public static void main(String[] args) {
      //Ejercicio4
        
        //Recursividad res = new Recursividad();
        //int n = 5;
        //int x = 2;
        //double result = res.calcExponencial(n, x);
        //System.out.println("Resultado: " + result);
        
        
        //numeros naturales 
        
        //NumerosNaturales suma = new NumerosNaturales();
        //int resultado = NumerosNaturales.sumar(8);
       //System.out.println("La suma de los números naturales hasta 8 es: " + resultado);

        //Ejercicio 3
        //Binario bin  = new  Binario();
        //int num = 33333;
        //  if (bin.esBinario(num)) {
        // System.out.println(num + " es un número binario");
       // } else {
       //  System.out.println(num + " no es un número binario");
       // }
        
          //Ejercicio 2
        
        String oracion = "Eliminare las vocales de esta oracion";
        EliminarVocales eliminar = new EliminarVocales();
        String oracionResultante = eliminar.eliminaVocales(oracion);
        System.out.println("Oración sin vocales: " + oracionResultante);
        
    }

}
