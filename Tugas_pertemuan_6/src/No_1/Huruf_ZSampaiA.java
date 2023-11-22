/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package No_1;

/**
 *
 * @author ACER i7
 */
public class Huruf_ZSampaiA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("~ Huruf Z - A ~");
        System.out.println("\nMenggunakan Perulangan for :");
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println("\n\nMenggunakan Perulangan while:");
        char currentChar = 'Z';
        while (currentChar >= 'A') {
            System.out.print(currentChar + " ");
            currentChar--;
        }
        System.out.println("\n\nMenggunakan Perulangan do-while:");
        char doWhileChar = 'Z';
        do {
            System.out.print(doWhileChar + " ");
            doWhileChar--;
        } while (doWhileChar >= 'A');
    }
}
