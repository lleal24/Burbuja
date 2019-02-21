/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Burbuja {

   
    public static void main(String[] args) {
        long Tinicial=0,Tfinal, tiempo;
        Scanner entrada = new  Scanner(System.in);
        //declaro el arreglo y la variable tamaño
        int arreglo[],tamaño,aux;
        
        //Solicto al usuario el valor del tamaño del arreglo
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de elementos"));
        
        //Agregar el tañaño al arreglo
        arreglo = new int [tamaño];
        
        
        //ciclo for para dedir valores del arreglo
        for(int i=0; i<tamaño;i++){
            System.out.println("Digite el valor: "+(i+1));
            arreglo[i] = entrada.nextInt();
        }
        
        //Metodo burbuja
        for(int i=0; i<(tamaño-1); i++){
            for(int j=0; j<(tamaño-1); j++){
                //si numero actual > numero siguiente
                if(arreglo[j]>arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        //mostrando el arreglo ordenado
        System.out.println("Arreglo ordenado en forma ascendente");
        for(int i=0; i<tamaño; i++){
            System.out.print(arreglo[i]+ " - ");
        }
        
        Tfinal=System.currentTimeMillis();
        tiempo=Tfinal-Tinicial;
        JOptionPane.showMessageDialog(null,"Tiempo de ejecucion en milisegundos: "+tiempo);
        
    
}
}
