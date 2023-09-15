package kartyas.java;

import java.util.Scanner;

public class Kartyas {

    static Scanner myObj = new Scanner(System.in);
    static String[] pakli = new String[22];

    public static void main(String[] args) {
        Feltolt();
        Kirak();
        int oszlop = Melyik();
        Kever(oszlop);

        //EzVolt();
    }

    private static void Kirak() {
        for (int i = 0; i < pakli.length; i++) {

            System.out.printf("%-8s", pakli[i]);
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
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }

    private static void Kever(int oszlop) {
        int j;
        int k;
        int csere;
        switch (oszlop) {
            case 1:
                int ex = 1;
                while (ex <= 7) {
                    k = 19 - (ex - 1) * 3;
                    csere = ex;
                    pakli[ex] = pakli[k];
                    pakli[k] = pakli[csere];
                    ex++;
                }
                while (ex <= 7) {
                    k = 20 - (ex - 1) * 3;
                    csere = ex + 7;
                    pakli[ex + 7] = pakli[k];
                    pakli[k] = pakli[csere];
                    ex++;
                }
                while (ex <= 7) {
                    k = 21 - (ex - 1) * 3;
                    csere = ex + 14;
                    pakli[ex + 14] = pakli[k];
                    pakli[k] = pakli[csere];
                    ex++;
                }
            case 2:
                for (int i = 1; i <= 7; i++) {
                    j = 19 - (i - 1) * 3;
                    csere = i;
                    pakli[i] = pakli[j];
                    pakli[j] = pakli[csere];
                }
                for (int i = 1; i <= 7; i++) {
                    j = 20 - (i - 1) * 3;
                    csere = i + 7;
                    pakli[i + 7] = pakli[j];
                    pakli[j] = pakli[csere];
                }
                for (int i = 1; i <= 7; i++) {
                    j = 21 - (i - 1) * 3;
                    csere = i + 14;
                    pakli[i + 14] = pakli[j];
                    pakli[j] = pakli[csere];
                }

            case 3:
                
                break;
            default:
        }
        Kirak();
    }

    private static void EzVolt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void Feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", ",X", "IX", "VIII"};

        int i = 1;
        for (String szin : szinek) {
            for (int j = 0; i < 22 && j < ertekek.length; j++) {
                pakli[i++] = szin + "_" + ertekek[j] + " ";
            }
        }
    }

}
