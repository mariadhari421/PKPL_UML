package controller;

import java.util.ArrayList;

import api.KRSAPI;
import model.KRS;
import model.MataKuliah;

public class KRSController implements KRSAPI{
    private ArrayList<KRS> listKRS = new ArrayList<KRS>();
    @Override
    public void create(KRS krs) {
        for (int i = 0; i < listKRS.size(); i++) {
            if (krs.getNoKRS().compareTo(listKRS.get(i).getNoKRS()) == 0) {
                System.out.println("No KRS sudah terdaftar");
                return;
            }
        }
        listKRS.add(krs);
    }

    @Override
    public void delete(String noKRS) {
        for (int i = 0; i < listKRS.size(); i++) {
            if (noKRS.compareTo(listKRS.get(i).getNoKRS()) == 0) {
                listKRS.remove(i);
                return;
            }
        }
        System.out.println("Data KRS tidak terdaftar");
    }

    @Override
    public void index() {
        if (listKRS.size() == 0) {
            System.out.println("Daftar KRS kosong");
            return;
        }
        System.out.println("Daftar KRS");
        for (int i = 0; i < listKRS.size(); i++) {
            System.out.println("No\t: " + listKRS.get(i).getNoKRS());
            ArrayList<MataKuliah> mata_kuliah = listKRS.get(i).showMataKuliahKRS();
            System.out.println("No.\tNama\tSemester\tSKS\tPengampu");
            for (int j = 0; j < mata_kuliah.size(); j++) {
                System.out.println(j + ".\t" + mata_kuliah.get(j).getNamaMatakuliah()
                                     + "\t" + mata_kuliah.get(j).getSemester()
                                     + "\t" + mata_kuliah.get(j).getSks() + "\t"
                                     + mata_kuliah.get(j).getPengampu());
            }
            System.out.println("====================================================");
        }
        
    }

    @Override
    public void show(KRS krs) {
        System.out.println("No KRS\t: " + krs.getNoKRS());
        ArrayList<MataKuliah> mata_kuliah = krs.showMataKuliahKRS();
        System.out.println("No.\tNama\tSemester\tSKS\tPengampu");
        for (int i = 0; i < mata_kuliah.size(); i++) {
            System.out.println(i + ".\t" + mata_kuliah.get(i).getNamaMatakuliah() + "\t"
                                 + mata_kuliah.get(i).getSemester() + "\t"
                                 + mata_kuliah.get(i).getSks());
        }
    }

    @Override
    public void update(String noKRS, KRS krs) {
        for (int i = 0; i < listKRS.size(); i++) {
            if (noKRS.compareTo(listKRS.get(i).getNoKRS()) == 0) {
                listKRS.set(i, krs);
                return;
            }
        }
        System.out.println("Data KRS tidak terdaftar");
    }
    
}
