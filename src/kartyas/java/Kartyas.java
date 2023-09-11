package kartyas.java;

import java.util.Scanner;

public class Kartyas {

    static Scanner myObj = new Scanner(System.in);
    static String[] pakli = new String[22];

    public static void main(String[] args) {
        Feltolt();
        Kirak();
        Kever(Melyik());
        EzVolt();
      
    }

    private static void Kirak() {
        for (int i = 0; i < pakli.length; i++) {

            System.out.printf("%-8s",pakli[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private static int Melyik() {
        boolean jo;
        int oszlop;
        do {            
            System.out.println("Oszlop 1-3: ");
            oszlop = myObj.nextInt();
            jo = oszlop >=1 && oszlop<=3;
        } while (!jo);
        return oszlop;
    }

    private static void Kever(int oszlop) {
        switch (oszlop) {
            case 1:
                //Arnold
                break;
            case 2:
                //Erno
                break;
            case 3:
                //Jani
                break;
                

        }
    }

    private static void EzVolt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void Feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", ",X", "IX", "VIII"};
        /*
        for (int i = 0; i < szinek.length; i++) {
            for (int j = 0; j < ertekek.length && j < 22; j++) {
                
                pakli[index]= szinek[i]+"_"+ertekek[j]+" ";
                index++;
            }  
        }
    */
        int i =1;
        for (String szin : szinek){
            for (int j = 0; i < 22 && j < ertekek.length; j++) {
                pakli[i++]= szin + "_" + ertekek[j]+" ";
            }
        }
    }

}
