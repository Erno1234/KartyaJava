package kartyas.java;

import java.util.Scanner;

public class Kartyas {

    static Scanner myObj = new Scanner(System.in);
    static String[] pakli = new String[22];

    public static void main(String[] args) {
        Feltolt();
        Kirak();
        Melyik();
        Kever();
        EzVolt();
      
    }

    private static void Kirak() {
        for (int i = 0; i < pakli.length; i++) {

            System.out.printf("%-8a",pakli[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private static void Melyik() {
        boolean jo;
        do {            
            System.out.println("Oszlop 1-3: ");
            int oszlop = myObj.nextInt();
            jo = oszlop >=1 && oszlop <=3;
        } while (!jo);
    }

    private static void Kever() {
        for (int i = 0; i <= 7; i++) {
            switch (i) {
                case 1:
                    i = (20 - (i - 1) * 3);
                case 2:
                    // [i+7] = (19 - (i - 1) * 3);
                case 3:
                    // [i+7] = (21 - (i - 1) * 3);
                    break;
                default:
            }
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
