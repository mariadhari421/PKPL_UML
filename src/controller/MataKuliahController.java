package controller;

import java.util.ArrayList;

import api.MataKulahAPI;
import model.Dosen;
import model.MataKuliah;

public class MataKuliahController implements MataKulahAPI {
    private ArrayList<MataKuliah> listMataKuliah = new ArrayList<MataKuliah>();
    @Override
    public void create(MataKuliah mataKuliah) {
        for (int i = 0; i < listMataKuliah.size(); i++) {
            if (mataKuliah.getNamaMatakuliah().compareTo(listMataKuliah.get(i).getNamaMatakuliah()) == 0) {
                System.out.println("Mata Kuliah sudah terdaftar");
                return;
            }
        }
        listMataKuliah.add(mataKuliah);
    }

    @Override
    public void index() {
        if (listMataKuliah.size() == 0) {
            System.out.println("Daftar Mata Kuliah kosong");
            return;
        }
        System.out.println("Daftar Mata Kuliah");
        for (int i = 0; i < listMataKuliah.size(); i++) {
            System.out.println("Mata Kuliah " + i + " : ");
            System.out.println("Nama\t\t: " + listMataKuliah.get(i).getNamaMatakuliah());
            System.out.println("SKS\t\t: " + listMataKuliah.get(i).getSks());
            System.out.println("Semester\t\t: " + listMataKuliah.get(i).getSemester());
        }
    }

    @Override
    public void show(MataKuliah mataKuliah) {
        System.out.println("Nama\t\t: " + mataKuliah.getNamaMatakuliah());
        System.out.println("SKS\t\t: " + mataKuliah.getSks());
        System.out.println("Semester\t: " + mataKuliah.getSemester());
        Dosen pengampu = mataKuliah.getPengampu();
        System.out.println("Pengampu\t: " + pengampu.getNama());
    }
    
    @Override
    public void update(String namaMatakuliah, MataKuliah mataKuliah) {
        for (int i = 0; i < listMataKuliah.size(); i++) {
            if (namaMatakuliah.compareTo(listMataKuliah.get(i).getNamaMatakuliah()) == 0) {
                listMataKuliah.set(i, mataKuliah);
                return;
            }
        }
        System.out.println("Mata Kuliah tidak terdaftar");
    }

    @Override
    public void delete(String namaMatakuliah) {
        for (int i = 0; i < listMataKuliah.size(); i++) {
            if (namaMatakuliah.compareTo(listMataKuliah.get(i).getNamaMatakuliah()) == 0) {
                listMataKuliah.remove(i);
                return;
            }
        }
        System.out.println("Nama Mata Kuliah tidak terdaftar");
    }   
}
