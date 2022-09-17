/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softinn_3;

import java.util.Scanner;

/**
 *
 * @author CHANG WEI HONG
 */
public class Softinn_3 {

    static boolean loop= true;
    public static void main(String[] args) {
        while(loop == true)
        {
        System.out.println("Hello, please select which shape to be displayed:");
        System.out.println("[Option: 'S' = Square, 'T' = Triangle, 'D' = Diamond]");
        System.out.print(">>>");
        Scanner scanner = new Scanner(System.in);
        String selectionShape = scanner.nextLine();
        System.out.println("Please key in the size of the shape:");
        System.out.print(">>>");
        int selectionSize = scanner.nextInt();
        
        if(selectionShape.toUpperCase().charAt(0) == 'S')
        {
            square(selectionSize);
        }
        else if(selectionShape.toUpperCase().charAt(0) == 'T')
        {
            triangle(selectionSize);
        }
        else if(selectionShape.toUpperCase().charAt(0) == 'D')
        {
            diamond(selectionSize);
        }
        
        System.out.println("Repeat? (true/false)");
        System.out.print(">>>");
        boolean decision = scanner.nextBoolean();
        loop = decision;
        }
    }
    
    public static void square(int selectionSize){
        int row=1;
        for (int i = selectionSize; i > 0; i--)
        {
            for (int j = 1; j <= selectionSize; j++)
            {
                System.out.print("  *");
            }
            
            System.out.println();
            row++;
        }

    }
    
    public static void triangle(int selectionSize){
        int row=1;
        for (int i = selectionSize; i > 0; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= row; j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
            row++;
        }

    }
        
    public static void diamond(int selectionSize){
        int midRow = selectionSize/2;
        int row=1;
        for (int i = midRow; i > 0; i--)
        {
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= row; j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
            row++;
        }
 
        for (int i = 0; i <= midRow; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(" ");
            }
            
            for (int j = row; j > 0; j--) 
            {
                    System.out.print("* ");
            }
            System.out.println();             
            row--;
        }
    }
    
}
