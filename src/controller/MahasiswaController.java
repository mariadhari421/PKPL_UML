package controller;

import java.util.ArrayList;

import api.MahasiswaAPI;
import model.Mahasiswa;

public class MahasiswaController implements MahasiswaAPI {
    ArrayList<Mahasiswa> list_mahasiswa = new ArrayList<Mahasiswa>();
    @Override
    public void create(Mahasiswa mahasiswa) {
        for (int i = 0; i < list_mahasiswa.size(); i++) {
            if (mahasiswa.getNama().compareTo(list_mahasiswa.get(i).getNama()) == 0) {
                System.out.println("NIM mahasiswa sudah terdaftar");
                return;
            }
        }
        list_mahasiswa.add(mahasiswa);
    }

    @Override
    public void delete(String nim) {
        for (int i = 0; i < list_mahasiswa.size(); i++) {
            if (nim.compareTo(list_mahasiswa.get(i).getNama()) == 0) {
                list_mahasiswa.remove(i);
                return;
            }
        }
        System.out.println("Data mahasiswa tidak terdaftar");
    }

    @Override
    public void index() {
        if (list_mahasiswa.size() == 0) {
            System.out.println("Data mahasiswa kosong");
            return;
        }
        System.out.println("List data mahasiswa");
        System.out.println("No.\t" + "NIM" + "Nama");
        for (int i = 0; i < list_mahasiswa.size(); i++) {
            System.out.println(i + ".\t" + list_mahasiswa.get(i).getNim() + "\t" + list_mahasiswa.get(i).getNama());
        }
    }

    @Override
    public void show(Mahasiswa mahasiswa) {
        System.out.println("Nim\t: " + mahasiswa.getNim());
        System.out.println("Nama\t " + mahasiswa.getNama());
    }

    @Override
    public void update(String nim, Mahasiswa mahasiswa) {
        for (int i = 0; i < list_mahasiswa.size(); i++) {
            if (nim.compareTo(mahasiswa.getNim()) == 0) {
                list_mahasiswa.set(i, mahasiswa);
                return;
            } 
        }
        System.out.println("Data mahasiswa tidak ditemukan");
    }
    
}
