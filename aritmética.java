/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author SAUL
 */
public class aritmética {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma=suma(5,1);
        int resta=resta(6,2);
        int multiplicar=multiplicar(3,4);
    }
    //Método de Saul
    public static int suma(int x, int y)
    {   int res=x+y;
        return res;
    }
    //Método de Leandro
    public static int resta(int x, int y)
    {   int res=x-y;
        return res;
    }
    //Metodo de Orlando
    public static int multiplicar(int x, int y)
    {
    	return x*y;
    }
}
