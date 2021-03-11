package model;
import java.util.ArrayList;

import model.Mahasiswa;
import model.Person;
public class Dosen extends Person{
    private String nidn;
    private ArrayList<MataKuliah> listMatakuliahPengampu = new ArrayList<MataKuliah>();
    private MataKuliah mata_kuliah = new MataKuliah("test", 1);
    public Dosen(String nidn, String nama) {
        this.setNidn(nidn);
        this.setNama(nama);
        
    }
    public Dosen(){
        
    }
    @Override
    public void showProfile() {
        System.out.println("Nama\t: " + this.nama);
        System.out.println("NIDN\t: " + this.nidn);
    }
    public void lihatListMatakuliahPengampu() {
        System.out.println("List Mata Kulaiah Dosen " + this.nama);
        for (int i = 0; i < listMatakuliahPengampu.size(); i++) {
            System.out.println("Nama\t\t: " + listMatakuliahPengampu.get(i).getNamaMatakuliah());
            System.out.println("SKS\t\t: " + listMatakuliahPengampu.get(i).getSks());
            System.out.println("Semester\t\t: " + listMatakuliahPengampu.get(i).getSemester());
        }
    }
    public void tambahMatakuliahDosen(MataKuliah mataKuliah) {
        listMatakuliahPengampu.add(mataKuliah);
    }

    public String getNidn() {
        return nidn;
    }
    public void setNidn(String nidn) {
        if (nidn == null) {
            System.out.println("Nidn tidak boleh null");
            return;
        }
        if (nidn.length() != 10) {
            System.out.println("Panjang karakter nidn dosen harus 10");
            return;
        }
        boolean angka = false;
        try {
            int nilai = Integer.valueOf(nidn);
            angka = true;
        } catch (Exception e) {
            angka = false;
        }
        if (!angka) {
            System.out.println("Karakter nidn dosen harus angka");
            return;
        }
        this.nidn = nidn;
    }
}
