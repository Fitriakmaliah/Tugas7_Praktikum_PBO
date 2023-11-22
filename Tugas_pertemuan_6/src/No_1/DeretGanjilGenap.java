/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package No_1;

/**
 *
 * @author ACER i7
 */
public class DeretGanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("~ Menghitung Deret bilangan ganjil dan genap dari 0 - 20 ~");
        System.out.println("\nBILANGAN GANJIL (Perulangan for):");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nBILANGAN GENAP (Perulangan while):");
        int j = 0;
        while (j <= 20) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println("\n\nBILANGAN GANJIL (Perulangan dowhile):");
        int k = 0;
        do {
            if (k % 2 != 0) {
                System.out.print(k + " ");
            }
            k++;
        } while (k <= 20);
        System.out.println("\n\nBILANGAN GENAP (Perulangan for):");
        for (int l = 0; l <= 20; l++) {
            if (l % 2 == 0) {
                System.out.print(l + " ");
            }
        }
    }
    
}
