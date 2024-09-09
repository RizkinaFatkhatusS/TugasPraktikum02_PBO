/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum2_no1dan2;

/**
 *
 * @author user
 */
public class Matematika implements InterfaceMatematika{
    // Method pertambahan
    public int pertambahan(int a, int b) {
        return a + b;
    }

    // Method pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Method pembagian
    public int pembagian(int a, int b) {
        return a / b; // Akan menghasilkan nilai pembagian integer
    }   
}
