/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexcepciones;

/**
 *
 * @author Alumno Mañana
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int resultado=0;
        try{
            resultado=10/0;
            
        }catch (Exception e) {
            
            e.printStackTrace(System.out);
            
        }
    }
    
}
