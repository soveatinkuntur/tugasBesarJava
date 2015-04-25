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
public class analisa_1 {
    Scanner in = new Scanner(System.in);
    void indentity(){
        FasilitasDanKondisiRuangan id = new FasilitasDanKondisiRuangan();
        System.out.println("Masukkan nama Ruangan = ");
        id.setInputNama(in.nextLine());
        System.out.println("Masukkan Lokasi Ruangan = ");
        id.setInputLokasi(in.nextLine());
        System.out.println("Masukkan nama Program Studi = ");
        id.setProdi(in.nextLine());
        System.out.println("Masukkan nama Fakultas = ");
        id.setFaculty(in.nextLine());
        System.out.println("---------------------------------------------------");
        
    }
    void fasilitasRuangan(){
        
    }
    
}
