/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CalsesArraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author werner
 */
public class ArrayClase {
  public  ArrayList<Double> array = new ArrayList();
     
  public   Double suma=0.0;
  public   Double promedio=0.0;
  public   Double mediana=0.0;
  public   Double posicion=0.0;
  public   Double varianza=0.0;
  public   Double desviacion=0.0;
  public   String moda;
  public   Double maximo=0.0;
  public   Double minimo=0.0;
  public   Double rango=0.0;
  public   Integer k=0;
  public   Double i=0.0;
  public   Integer numeroDatos=0;
     
    
    public ArrayClase(){
        
    }//Finaliza constructor
    
    
    /*
    Metodo que obtiene los valores agregandolos al arreglo
    */
    public void agregarDatos(Double a){
        array.add(a);
    }//Finaliza agregar datos
    
    
     /*
    Ordenamos los datos de forma ascendente
    */       
      public void ordSelAsc(ArrayList <Double> array) {
      Collections.sort(array);
      }//Finaliza el metodo que ordena el vector de forma ascendente
      
      
      
    /*
      Muestra los datos del Arreglo e
      */
    public void mostrarArrayList(){
        for(int i=0; i< array.size(); i++){
            System.out.println("posicion :"+i+" valor: "+array.get(i));
        }//Finaliza for que muestra los valores del array list
    }
   
    /*
    Metodo que suma los valores del arreglo
    */
    public void sumarValores(ArrayList <Double> array){
        for(int i=0; i<array.size(); i++){
            suma = suma+array.get(i);
        }
    }//Finaliza el metodo que suma los datos del vector
    
    /*
    Calculamos el promedio
    */
    public void promedio(){
        
        this.promedio = this.suma/array.size();  
    }//Finaliza el metodo para calcular el promedio
    
    
    
    
    /*
    Calculamos la mediana
    */
    public void mediana(ArrayList <Double> array){       
	int x= 0;
	x= array.size();
	//Determino si es para o impar la cantidad de elementos
	if(x % 2==0){
		double x1=array.get(((x-2)/2));
		double x2=array.get(x/2);
		mediana=(x1+x2)/2;
	}else{
		mediana=array.get((x-1)/2);
	}
	
    }//Finaliza metodo que calcula la mediana 
    
    /*
    Posicion de la mediana
    */
    
    public void posicion(){
      this.posicion = this.array.size()*0.5;
      
    }//Finaliza el metodo que establece la posicion de la mediana
    
    /*
    Calculamos la moda
    */
    public void moda(){
       
	
    }//Finaliza el metodo que calcula la moda
    
    
    /*
    Metodo que obtiene la varianza de los datos del arreglo
    */
    public  void getVarianza(ArrayList <Double> datos){

	double media = 0.0;
	for(double dato: datos){
		media += dato;
	}

		double m=media/datos.size();
		double suma = 0;
		double v= 0;
		double va= 0;
		for(int i=0; i<datos.size(); i++){
			double Xi = datos.get(i);
			suma += Math.pow((Xi-m),2);
		}

		v+=datos.size()-1;
			va+=suma/v;

		this.varianza=va;

    } // Fin método de la varianza.
    
    /*
    Calculamos la desviacion estandar
    */
    public  void getDesviacion(ArrayList <Double> datos){
	double media = 0.0;
	for (double dato:datos){
		media += dato;	
	}

		double m=media/datos.size();
		double suma = 0;
		double v= 0;
		double va=0;
		for(int i=0; i<datos.size(); i++){
			double Xi = datos.get(i);
			suma += Math.pow((Xi-m),2);
		}
		v+=datos.size()-1;
			va+=suma/v;

                     this.desviacion = Math.sqrt(va);
       
    } // fin del método de la desviacion.
    
    /*
    Creamos el metodo que obtiene la moda y el numero de repeticiones
    */
      public void getModa(ArrayList <Double> datos){
	String moda = ""; // Mensaje de la moda


	String[] grupos = new String[datos.size()]; // variable que guarda

	int ngrupos=1; // variable para saber cuantos elementos, el valor minimo es 1
	int igrupo=0; //Indice del grupo
	String grupo=datos.get(0).toString();
        
	grupos[0]=datos.get(0).toString();
        

	for(int i=1; i<datos.size(); i++){ // Recorro y obtengo la cantidad de grupo
		if(grupo.equals(datos.get(i))){
			continue;
		}else{
			ngrupos++;
			igrupo++;
			grupo=datos.get(i).toString();
			grupos[igrupo]=grupo;
                        
		}
	}

	int[]frecuencia = new int[ngrupos]; // obtengo la frecuencia de cada grupo para saber la moda
	
	for (int i= 0; i<ngrupos; i++){
		for(Double evaluado : datos){
                    
			if(evaluado.toString() != null && grupos[i].equals(evaluado.toString())){
				frecuencia[i]++;
			}	
		}	
	}

//	moda += /*"La moda: aquel valor que tiene mayor numero de repetciones. \n"
//		+ "Si todos los valores son iguales entonces no hay moda. \n\n" */
// 		""+ "		<<<Estadisticas de la moda >>>\n\n;

	for(int i = 0; i< ngrupos; i++){
	
	moda += " Num. " + grupos[i]+ " = " + frecuencia[i] + "repeticiones. \n";
	}
	this.moda= moda;
}//Finaliza el metodo que calcula la moda
    
   
      
      /*
      calculamos el numero de datos
      */
      public void numeroDatos(ArrayList<Double> valor){
          this.numeroDatos = valor.size();
      }
      /*
      Metodo que calcula la variable que psee el maxio valor
      */
  
     public void maximo(ArrayList<Double> valores) {
        double max = valores.get(0);
        for (int i = 0; i < valores.size(); i++) {
            if (max < valores.get(i)) {
                max = valores.get(i);
            }
        }
        this.maximo=max;
        
    }//Finaliza metodo que calcula el maximo

    /**
     * Establece el valor minimo de los datos
     */
    public void minimo(ArrayList<Double> valor) {
        Double min = valor.get(0);
        for (int i = 0; i < valor.size(); i++) {
            if (min > valor.get(i)) {
                min = valor.get(i);
                            }
        }
        this.minimo=min;
        
    }// finaliza minimo

    /**
     * Calcula el rango
     */
    public void rango() {
       this.rango= this.maximo-this.minimo;
    }

    /**
     * Retorna el numero de clases
     */
    public void K(ArrayList<Double> valor) {
        this.k= Math.round(Math.round((1 + 3.3 * Math.log10(valor.size()))));
    }//finaliza metodo para calcular en no: de clases

    /**
     * Calculamos la amplitud del intervalo
     */
    public void amplitud() {
        
        i= (this.rango/(Double.parseDouble(k.toString())));
        
  
        
    }//Finaliza el metodo que calcula la amplitud

  

}//Finaliza la clase Array
