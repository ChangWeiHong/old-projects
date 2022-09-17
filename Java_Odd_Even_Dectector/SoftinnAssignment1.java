/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softinn.assignment.pkg1;

import java.util.Arrays;

/**
 *
 * @author CHANG WEI HONG
 */
public class SoftinnAssignment1 {

    static int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    
    public static void main(String[] args) {
        
        for (int i =0; i< data.length; i++)
        {
            if(data[i]%2 == 1){
                System.out.println("" +data[i]+" is odd number.");
            }
            else if(data[i]%2 == 0){
                System.out.println("" +data[i]+" is even number.");
            }
            
            if(data[i]==9) break;
        }
    }
    
}
