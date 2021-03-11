package model;
import java.lang.reflect.Field;
import java.util.ArrayList;

import model.Dosen;
import model.KRS;
import model.Person;
public class Mahasiswa extends Person {
    private String nim;
    KRS krs = new KRS("1");
    public Mahasiswa(String nama, String nim){
        this.nim = nim;
        this.nama = nama;
        
    }
    public Mahasiswa(){

    }
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if (nim == null) {
            System.out.println("NIM tidak boleh null");
            return;
        }
        if (nim.length()!=7) {
            System.out.println("Panjang karakter nim mahasiswa harus 7");
            return;
        }
        boolean angka = false;
        try {
            int nilai = Integer.valueOf(nim);
            angka = true;
        } catch (Exception e) {
            angka = false;
        }
        if (!angka) {
            System.out.println("Karakter nim mahasiswa harus angka");
            return;
        }
        this.nim = nim;
    }
    public KRS getKrs() {
        return krs;
    }

    public void cetakKRS() {
        System.out.println("KRS Mahasiswa " + this.nama);
        System.out.println("No KRS\t: " + krs.getNoKRS());
        ArrayList<MataKuliah> mata_kuliah = krs.showMataKuliahKRS();
        System.out.println("No.\tNama\tSemester\tSKS\tPengampu");
        for (int i = 0; i < mata_kuliah.size(); i++) {
            System.out.println(i + ".\t" + mata_kuliah.get(i).getNamaMatakuliah() + "\t"
                                 + mata_kuliah.get(i).getSemester() + "\t"
                                 + mata_kuliah.get(i).getSks());
        }
    }
    public void pilihPaketKRS(KRS krs) {
        
    }

    @Override
    public void showProfile() {
        System.out.println("Nama\t: " + this.nama);
        System.out.println("NIM\t: " + this.nim);
    }
}
