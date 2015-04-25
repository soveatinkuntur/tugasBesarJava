/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kondisiruang;

/**
 *
 * @author Soveatin
 */
import java.util.Scanner;
public class analisaKondisiRuang {
    public static void main(String[] args) {
        int a;
        String g;
        Scanner tap = new Scanner (System.in);
        System.out.println("Masukkan nilai kebersihan= ");
        a = tap.nextInt();
        if(a>=75){
            System.out.println("SESUAI");
        }
        else{
            System.out.println("Belum Sesuai");
        }
        System.out.println("Masukkan nilai sirkulasi udara = ");
        a = tap.nextInt();
        if(a>=75){
            System.out.println("Kondisi udara baik");
        }
        else{
            System.out.println("Kondisi udara kurang baik");
        }
        System.out.println("Masukkan nilai analisis pencahayaan = ");
        a = tap.nextInt();
        if(a>=250 && a<=350){
            System.out.println("Sesuai");    
        }
        else{
            System.out.println("Belum sesuai");
        }
        System.out.println("Masukkan nilai suhu = ");
        a = tap.nextInt();
        if(a>=25 && a<=35){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Belum Sesuai");
        }
        System.out.println("Analisa nilai kebisingan = ");
        //a=tap.nextInt();
        g = tap.nextLine();
        if(g =="tidak"){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Belum Sesuai");
        }
        System.out.println("Masukkan nilai analisa bau = ");
        a = tap.nextInt();
        if(a>=75){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Belum Sesuai");
        }
        System.out.println("Masukkan nilai analisa kekokohan = ");
        a = tap.nextInt();
        if(a>=75){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Belum Sesuai");
        }
        System.out.println("Masukkan nilai keausan = ");
        a = tap.nextInt();
        if(a>=75){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Belum Sesuai");
        }
        
    }
    
}
