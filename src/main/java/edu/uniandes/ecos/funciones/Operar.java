/*
*Clase que implementa los metodos para hallar la media y la desviacion estandar
*@author: José Javier Virviescas Toledo
*@version: 1.0
*/
package edu.uniandes.ecos.funciones;
import java.util.LinkedList;

public class Operar {

    /**
     * Metodo para calcular la media de un conjunto de valores que vienen dados por una lista
     * @param lista: LinkedList
     * @return double
     */
    public double media(LinkedList lista){
        double resultado = 0;
        double suma = 0;
        for(int i = 0; i<lista.size(); i++){
            suma = suma + Double.parseDouble((String)lista.get(i));
        }
        return resultado = suma / lista.size(); 
    }

    /**
     * Metodo para calcular la desviacion estandar de un conjunto de valores que vienen dados por una lista
     * @param lista: LinkedList
     * @return double
     */
    public double desviacionEstandar(LinkedList lista){
        double resultado = 0;
        double media = media(lista);
        double suma = 0;
        for(int i = 0; i<lista.size(); i++){
            double operacionParcial = (Double.parseDouble((String)lista.get(i)) - media) * (Double.parseDouble((String)lista.get(i)) - media);
            suma = suma + operacionParcial;
        }
        suma = suma / (lista.size() - 1);
        return resultado = Math.sqrt(suma);
    }
	
}