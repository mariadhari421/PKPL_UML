package test;

import model.Dosen;
import model.MataKuliah;

public class MatakuliahTest {
    public static void main(String[] args) {
        MataKuliah matematika = new MataKuliah();
        Dosen dosen = new Dosen();
        matematika.setPengampu(dosen);
    }
}
