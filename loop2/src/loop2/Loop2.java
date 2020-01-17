/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop2;

/**
 *
 * @author USER
 */
public class Loop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Penggunaan Pernyataan for, wile, dan do while
        int i;
        System.out.println("for");
        for(i=1;i<=10;i++){
            if(i<10) System.out.print(i+",");
            else System.out.print(i+".");
        }
        
        System.out.println("\n\nwhile");
        i=1;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }
        
        System.out.println("\n\ndo while");
        i=1;
        do{
            System.out.print(i+" ");
            i++;
        } while(i<=10);
        System.out.println("\n");
    
    }
    
    }
    

