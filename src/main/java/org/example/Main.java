package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Pharmacy pharmacy = new Pharmacy();

        Medication mediacment1 = new Medication("Aspirin", 8,true );
        Medication mediacment2 = new Medication("Ibu", 5,false );
        Medication mediacment3 = new Medication("Novamin", 4,true );
        Medication mediacment4 = new Medication("Amoxicillin", 15,true );
        Medication mediacment5 = new Medication("Losartan", 12,false );


        pharmacy.save(mediacment1.getName(), mediacment1);
        pharmacy.save(mediacment2.getName(), mediacment2);
        pharmacy.save(mediacment3.getName(), mediacment3);
        pharmacy.save(mediacment4.getName(), mediacment4);
        pharmacy.save(mediacment5.getName(), mediacment5);

        // test save medicament methode in pharmacy
        pharmacy.printMedications();
        //test count medicament methode
        System.out.println("**********");
        System.out.println(pharmacy.getCount());
        // test find medicament methode
        System.out.println("**********");
        System.out.println(pharmacy.Find("Ibu"));

        System.out.println("**********");
        // test delete medicament methode
        pharmacy.delete("Ibu");
        pharmacy.printMedications();

        // test2 count medicament methode
        System.out.println("**********");
        System.out.println(pharmacy.getCount());
    }
}