/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionexercises;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 *
 * @author 2ndyrGroupA
 */
public class JavaCollectionExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //number 1
        SortingArrayList();
        
        //number 2
        RandomArrayList();
        
        //number 3 
        ArrayList<Integer> arraylistInput = new ArrayList<>();
        arraylistInput.add(5);
        arraylistInput.add(15);
        arraylistInput.add(6);
        arraylistInput.add(2);
        arraylistInput.add(8);
        arraylistInput.add(25);
        arraylistInput.add(1);
        arraylistInput.add(7);
        arraylistInput.add(4);
        MinimumValue(arraylistInput);
        
        //number 4: Why should we opt for isEmpty() over size?
            
            //- size() return the number of elements in the collection while isEmpty() 
            //return whether the collection is empty or not. It should be better to use 
            //isEmpty in some cases because it checks first whether the collection has data inside.
            //It is also easier to read and maintain.
      
         //number 5:Compare and contrast the classic for loop versus foreach. What are the pros and     cons of both sides?
           
           //- Loops like for loop and while loop can manipulate arrays one by one by accessing each index or 
           //iterate throughout the given condition while foreach, you don’t need to manipulate yourself the 
           //index or manually set the iteration, instead, by the use of foreach, you can loop the entire data 
           //from the top to bottom.  Loops specifically for loops can control structure for specifying 
           //iteration that allows code to be executed repeatedly while foreach control structure for 
           //traversing items in an array or collection. Loops also can retrieve a particular set of 
           //elements which foreach cannot do. Loops used in general purpose and foreach on the other hand 
           //are used for arrays and collections. Lastly, loops are harder to read and write but foreach is 
           //easier to read and write.

         
        //number 6
        ComparingTwoSets();
        
        //number 7
        getUniqueValue();
        
        //number 8
        CountNumberKeys();
        
    }
    
    //Exercise number 1: Sorting arraylist
    public static void SortingArrayList(){
        System.out.println("Exercise Number 1: Sorting Arraylist");
        List<Integer> arrayNumber = new ArrayList<Integer>();
        arrayNumber.add(1);
        arrayNumber.add(8);
        arrayNumber.add(3);
        arrayNumber.add(8);
        arrayNumber.add(7);
        arrayNumber.add(22);
        arrayNumber.add(5);
        arrayNumber.add(3);
        System.out.println("Arraylist: "+arrayNumber);
        Collections.sort(arrayNumber);
        System.out.println("Sorted arraylist: "+ arrayNumber); 
        System.out.println("");
       
    }
    //Exercise number 2: Rearrange arraylist randomly
    public static void RandomArrayList(){
        System.out.println("Exercise number 2: Rearrange arraylist randomly");
        List<String> stringarray = new ArrayList<String>();
        stringarray.add("Marjorie");
        stringarray.add("Winabel Marie");
       stringarray.add("Kyla Jean");
        stringarray.add("christine");
        stringarray.add("Chymbee");
        stringarray.add("Jenie Joy");
        stringarray.add("Jennifer");
        stringarray.add("Precy");
        System.out.println("Arraylist: "+stringarray);
        Collections.shuffle(stringarray);
        System.out.println("Randomize arraylist: "+ stringarray); 
        System.out.println("");
        
    }
    
    //Exercise number 3: Putting the minimum value at the front of arraylist
    public static void MinimumValue(ArrayList<Integer> arraylistInput){
     
        int inputLength = arraylistInput.size();
        int min=0;
        
        for (int ctr=0;ctr <inputLength;ctr++){
            if(arraylistInput.get(ctr)< arraylistInput.get(min)){
                min=ctr;
            }
        }
        arraylistInput.add(0, arraylistInput.remove(min));
     
        System.out.println("Execise number 3: ");
       System.out.println("Arraylist: "+ arraylistInput);
        System.out.println("Get the minum value: "+ arraylistInput);
        System.out.println("");
        
    }
    
    //Exercise number 6: comparing two values
    public static void ComparingTwoSets(){
        
        Set<String> firstSet = new HashSet<String>();
        Set<String> secondSet = new HashSet<String>();
        Set<String> thirdSet = new HashSet<String>();
        //first set items
        firstSet.add("Rehnan");
        firstSet.add("Daryll");
        firstSet.add("Lyndrex");
        firstSet.add("Justine");
        firstSet.add("Sernel");
        firstSet.add("John Dave");
        firstSet.add("Dexter");
        firstSet.add("Melchor");
        firstSet.add("Guian");
        firstSet.add("Patrick");
        firstSet.add("Juan");
        firstSet.add("Kerwien");
        
        //second set items
        secondSet.add("Joseph");
        secondSet.add("Gerald");
        secondSet.add("Daryll");
        secondSet.add("Junmar");
        secondSet.add("Rehnan");
        secondSet.add("Lyndrex");
        secondSet.add("John Miguel");
        secondSet.add("Guian");
        secondSet.add("Jeric");
        secondSet.add("Aldrin");
        
        for(String item:firstSet){   
          for(String item2:secondSet){
            if (item == item2){
                thirdSet.add(item);
            }
         }
        }
        
        System.out.println("Exercise number 6:");
        System.out.println("First Set: " + firstSet);
        System.out.println("Second Set: " + secondSet);
        System.out.println("Set that have the same value as the two set: " + thirdSet);
        System.out.println("");
    }
    //Exercise number 7: Get the unique value of two sets
    public static void getUniqueValue(){
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        
        
        set1.add("Kaith chymbee");
        set1.add("Angelica");
        set1.add("Kyla Jean");
        set1.add("Rubylyn");
        set1.add("Jenie Joy");
        set1.add("April");
        set1.add("Emelisa");
        set1.add("Jennifer");
        set1.add("Leslie");
        
        set2.add("Winabel Marie");
        set2.add("Leslie");
        set2.add("Precy Jane");
        set2.add("Angelica");
        set2.add("April");
        set2.add("Christine");
        set2.add("Jessa");
        set2.add("Emelisa");
        set2.add("Marjorie");

       Set<String> set3 = new HashSet<String>(set1);
        set3.removeAll(set2);
        Set<String> set4 = new HashSet<String>(set2);
        set4.removeAll(set1);
        set3.addAll(set4);
        
     
        
        System.out.println("Exercise number 7:");
        System.out.println("Set1 : " + set1);
        System.out.println("Set2 : " + set2);
        System.out.println("Unique Value of the two set: " + set3);
        System.out.println("");
         
        
    }
    
    //Exercise number 8: Map
    public static void CountNumberKeys(){
        HashMap<String,String> countKeys = new HashMap <String,String>();
        countKeys.put("name","Ean");
        countKeys.put("color1","Blue");
        countKeys.put("fruit","Apple");
        countKeys.put("name2","Christian");
        countKeys.put("name4","Patrick");
        countKeys.put("color2","Violet");
        countKeys.put("color3","Yellow green");
        countKeys.put("fruit","watermelon");
        countKeys.put("name3","Edrian");
        int counter=0;
        for (String keys : countKeys.keySet()){
            if(keys.startsWith("name")){
                counter++;
            }
        }
        
        System.out.println("Exercise number 8:");
        System.out.println("Count map data that has a key of name: " +counter);
    }
    
     
}
