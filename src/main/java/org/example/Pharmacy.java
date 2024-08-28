package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
   private Map<String, Medication>medications;

   public Pharmacy(){
       medications = new HashMap<>();
   }
   public int getCount(){
       return medications.size();
   }
    public void save(String medicationName, Medication medication){
        medications.put(medicationName, medication);
   }
   public Medication Find(String medicationName){
       return medications.get(medicationName);
   }
   public void delete(String medicationName){
       medications.remove(medicationName);
   }
   public void printMedications(){
       for (Medication medication : medications.values()) {
           System.out.println(medication);
       }
   }

}
