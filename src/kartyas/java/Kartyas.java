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
<<<<<<< HEAD
            int oszlop = myObj.nextInt();
            jo = oszlop >=1 && oszlop <=3;
=======
            oszlop = myObj.nextInt();
            jo = oszlop >=1 && oszlop<=3;
>>>>>>> d6f7e97e4fe139c1b7f67962e1789bd8078b8b28
        } while (!jo);
        return oszlop;
    }

<<<<<<< HEAD
    private static void Kever() {
<<<<<<< HEAD
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
=======
      
            for(int i=1; i<=7; i++){
                switch (2){
                    case 1:
                        //[i] = 19-(i-1)*3;
                        break;
                    case 2:
                        //[i+7] = 20-(i-1)*3;
                        break;
                    case 3:
                        //i+14 =21-(i-1)*3;
                        break;
                    default:
                        
                }
                
         
                
=======
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
                

>>>>>>> 0bca16b3ce3ba22aea40de2f10756f95640db899
>>>>>>> d6f7e97e4fe139c1b7f67962e1789bd8078b8b28
        }
    }

    private static void EzVolt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void Feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", ",X", "IX", "VIII"};
        
        int i =1;
        for (String szin : szinek){
            for (int j = 0; i < 22 && j < ertekek.length; j++) {
                pakli[i++]= szin + "_" + ertekek[j]+" ";
            }
        }
    }

}
