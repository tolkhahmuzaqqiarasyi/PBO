/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bankberaksi;

/**
 *
 * @author ASUS
 */
public class Bankberaksi {

    public static void main(String[] args) {
        Bank BTN = new Bank(100000);
        BTN.simpanUang(10000);
        BTN.ambilUang(10000);
    }
}
