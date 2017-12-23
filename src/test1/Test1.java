/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author genet
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  

    System.out.println(primeCount(20,22));
               System.out.println(primeCount(10,30));
    }
    public static int primeCount(int start,int end){
        int count=0;
        int count1=0;
                  

        for(int i=start;i<=end;i++){
              boolean prime=true;
         for(int j=2;j<=i/2;j++){
             if(i%j==0){
               prime=false;
               break;
              
             }
                
            
        
         }
        if(prime==true){
            count1++;
        
        }}
        return count1;
    }}

