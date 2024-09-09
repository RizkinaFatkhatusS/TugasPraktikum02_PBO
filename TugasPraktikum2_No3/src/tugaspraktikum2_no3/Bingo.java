/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum2_no3;

/**
 *
 * @author user
 */
public class Bingo {
     public static void main(String[] args) {
        // Create instances of BingoConstructor
        BingoKontruktor bingo1 = new BingoKontruktor("B", "I", "N", "G", "O");
        BingoKontruktor bingo2 = new BingoKontruktor("(clap)", "I", "N", "G", "O");
        BingoKontruktor bingo3 = new BingoKontruktor("(clap)", "(clap)", "N", "G", "O");
        BingoKontruktor bingo4 = new BingoKontruktor("(clap)", "(clap)", "(clap)", "G", "O");
        BingoKontruktor bingo5 = new BingoKontruktor("(clap)", "(clap)", "(clap)", "(clap)", "O");
        BingoKontruktor bingo6 = new BingoKontruktor("(clap)", "(clap)", "(clap)", "(clap)", "(clap)");

        // Call cetak() method for each instance
        bingo1.cetak();
        bingo2.cetak();
        bingo3.cetak();
        bingo4.cetak();
        bingo5.cetak();
        bingo6.cetak();
    }
}
