package test;

import model.Dosen;
import model.MataKuliah;

public class MatakuliahTest {
    public static Dosen pengampu;
    public static MataKuliah matematika;
    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
    }
    public static void testCase1() {
        /**
         *  Membuat instansiasi objek matakuliah
         *  dengan parameter nama matakuliah string kosong
         */
        matematika = new MataKuliah("", 1);
    }
    public static void testCase2() {
        /**
         *  Membuat instansiasi objek matakuliah
         *  dengan parameter sks bernilai minus
         */
        matematika = new MataKuliah("Matematika", -1);
    }
    public static void testCase3() {
        /**
         *  Membuat instansiasi objek matakuliah
         *  dengan panjang karakter lebih dari 1 digit
         */
        matematika = new MataKuliah("Matematika", 10);
    }
    public static void testCase4() {
        matematika = new MataKuliah("Matematika", 1);
        matematika.setPengampu(pengampu);
    }
}
