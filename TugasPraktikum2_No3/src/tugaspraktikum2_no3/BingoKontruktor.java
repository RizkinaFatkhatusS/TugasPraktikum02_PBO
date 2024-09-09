/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum2_no3;

/**
 *
 * @author user
 */
public class BingoKontruktor {
    String B, I, N, G, O;

    // Constructor for BingoConstructor class
    public BingoKontruktor(String B, String I, String N, String G, String O) {
        this.B = B;
        this.I = I;
        this.N = N;
        this.G = G;
        this.O = O;
    }

    // Method to print the Bingo song
    public void cetak() {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        System.out.println(B + "-" + I + "-" + N + "-" + G + "-" + O);
        System.out.println(B + "-" + I + "-" + N + "-" + G + "-" + O);
        System.out.println(B + "-" + I + "-" + N + "-" + G + "-" + O);
        System.out.println("And Bingo was his name-o.\n");
    }
}
