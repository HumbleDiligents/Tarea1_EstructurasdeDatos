/*
 * @author Kendall
 */
public class Recursividad {
    
    //La función calcExponencial recibe dos parámetros n y x. Si n es igual a cero, devuelve 1.
     //Si no, devuelve el resultado de elevar x a la potencia de n dividido por la función factorial
     //con n como parámetro, recursiva de calcExponencial con n-1 y x como parámetro
    public double calcExponencial(int n, int x) {
        // si n es igual a cero, devuelve 1
        if (n == 0) {
            return 1;
 
            // de lo contrario, llama a la función factorial con n y devuelve su valor sumado con la llamada recursiva de calcExponencial con n-1
        } else {
            return Math.pow(x, n) / factorial(n - 1) + calcExponencial(n - 1, x);
        }
    }
    
    //La función factorial recibe un parámetro num. Si num es igual a 1, devuelve 1. Si no, 
    //devuelve num multiplicado por la llamada recursiva de factorial con num-1 como paramentro
    //
 
    public double factorial(int num) {
        if (num == 0) {// si num es igual a 1, devuelve 1
            return 1;
        } else {// // de lo contrario, devuelve num multiplicado por la llamada recursiva de factorial con num-1
            return num * factorial(num - 1);
        }
 
    }
}
//Ambas funciones se llaman a sí mismas hasta que cumplan una condición específica, en este caso cuando n es igual a cero o num es igual a 1. 
//De esta manera, van calculando el resultado hasta que la condición se cumpla y puedan devolver el resultado final.
  

