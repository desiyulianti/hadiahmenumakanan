/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menumakanan;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Menumakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] menu = {"nasi goreng"," ayam bakar"," opor ayam"," bakso bakar","ayam geprek","gurame bakar" };
        int[] harga = {15000, 22000, 25000, 10000, 16000, 35000};
        System.out.println("SELAMAT DATANG DI RESTORAN KAMI");
        System.out.println("MENU MAKANAN :");
        for (int i = 0; i < harga.length; i++)
        {System.out.println(i+"."+menu[i]+" = "+harga[i]);}
        // menu yang dipilih
        System.out.println("menu yang dipilih :");
        Scanner input = new Scanner (System.in);
        int pilihan = input.nextInt();
        System.out.println("menu adalah :"+menu[pilihan]);
        System.out.println("Silakan melakukan pembayaran");
        int bayar = input.nextInt();
        if(bayar > harga[pilihan]){
        System.out.println("uang kembalian :"+( bayar - harga[pilihan]));}
        else if ( bayar < harga[pilihan]){System.out.println("Uang anda kurang :"+(harga[pilihan] - bayar));
        }
        else if (bayar == harga[pilihan]){System.out.println("Tidak ada kembalian");}
      
        
        
      
        }
        
    }
    

