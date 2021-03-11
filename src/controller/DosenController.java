package controller;

import java.util.ArrayList;

import api.DosenAPI;
import model.Dosen;

public class DosenController implements DosenAPI {

    private ArrayList<Dosen> list_dosen = new ArrayList<Dosen>();
    @Override
    public void create(Dosen dosen) {
        for (int i = 0; i < list_dosen.size(); i++) {
            if (dosen.getNidn().compareTo(list_dosen.get(i).getNidn()) == 0) {
                System.out.println("Data dosen sudah terdaftar");
                return;
            }
        }
        list_dosen.add(dosen);
    }

    @Override
    public void delete(String nidn) {
        for (int i = 0; i < list_dosen.size(); i++) {
            if (nidn.compareTo(list_dosen.get(i).getNidn()) == 0) {
                list_dosen.remove(i);
                return;
            }
        }
        System.out.println("Data dosen tidak terdaftar");
    }

    @Override
    public void index() {
        if (list_dosen.size() == 0) {
            System.out.println("Data dosen kosong");
            return;
        }
        System.out.println("List data dosen");
        System.out.println("No.\tNIDN\tNama");
        for (int i = 0; i < list_dosen.size(); i++) {
            System.out.println(i + ".\t" + list_dosen.get(i).getNidn() + list_dosen.get(i).getNama());
        }
    }

    @Override
    public void show(Dosen dosen) {
        System.out.println("NIDM\t: " + dosen.getNidn());
        System.out.println("Nama\t: " + dosen.getNama());
    }

    @Override
    public void update(String nidn, Dosen dosen) {
        for (int i = 0; i < list_dosen.size(); i++) {
            if (nidn.compareTo(list_dosen.get(i).getNidn()) == 0) {
                list_dosen.set(i, dosen);
                return;
            }
        }
        System.out.println("Data dosen tidak terdaftar");
    }
    
}
