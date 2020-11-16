/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.gajikaryawan;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi class Manager
 * 
 */

import java.util.Scanner;

public class Tester {
    public static int golongan, hadir;
    public static String jabatan, nik, nama;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK  \t\t: ");nik = sc.nextLine();
        System.out.print("Masukkan Nama \t\t: ");nama = sc.nextLine();
        System.out.print("Masukkan Golongan (1/2/3) \t: ");golongan = sc.nextInt();
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");jabatan = sc.next();
        System.out.print("Masukkan Jumlah Kehadiran \t: ");hadir = sc.nextInt();
        
        Manager ObjManager = new Manager();
        ObjManager.setNik(nik);
        ObjManager.setNama(nama);
        ObjManager.setGolongan(golongan);
        ObjManager.setJabatan(jabatan);
        ObjManager.setKehadiran(hadir);
        
        System.out.println();
        
        System.out.println("====Hasil Pehitungan====");
        System.out.println("NIK      : " + ObjManager.getNik());
        System.out.println("NAMA     : " + ObjManager.getNama());
        System.out.println("GOLONGAN : " + ObjManager.getGolongan());
        System.out.println("JABATAN  : " + ObjManager.getJabatan());
        
        System.out.println();
        
        System.out.println("TUNJANGAN GOLONGAN  : " + ObjManager.tunjanganGolongan(golongan));
        System.out.println("TUNJANGAN JABATAN   : " + ObjManager.tunjanganJabatan(jabatan));
        System.out.println("TUNJANGAN KEHADIRAN : " + ObjManager.tunjanganKehadiran(hadir));
        
        System.out.println();
        
        System.out.println("GAJI TOTAL \t\t\t: " + ObjManager.gajiTotal());
    }
}