/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1tami1;

import java.util.TreeSet;

/**
 *
 * @author mikito
 */
public class E1tami1 {

    /**
     * @param args the command line arguments
     */
    public static TreeSet<Integer> unique(int [] array){
     TreeSet<Integer> ts = new TreeSet<Integer>();
     for(int i = 0; i<array.length; i++){
         ts.add(array[i]);
     }
     return ts;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr= new int []{1,1,2,2,3,4,5,6,7};
        System.out.print("Array: ");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        TreeSet<Integer> ts = new TreeSet<Integer>(unique(arr));
        System.out.println("Tree set: "+ts);
    }
    
}
