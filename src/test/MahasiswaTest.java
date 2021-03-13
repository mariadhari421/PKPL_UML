package test;

import java.util.Random;

import model.Mahasiswa;

public class MahasiswaTest {
    public static Mahasiswa mahasiswa;
    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
        testCase6();
    }
    public static void testCase1() {
        /**
         *  Membuat instansiasi objek 
         *  dosen dengan parameter string kosong
         */
        mahasiswa = new Mahasiswa("", "");
    }
    public static void testCase2() {
        /**
         *  Membuat instansiasi objek mahasiswa
         *  dengan parameter null
         */
        String nama = null;
        String nim = null;
        mahasiswa = new Mahasiswa(nama, nim);
    }
    public static void testCase3() {
        /**
         *  Membuat instansiasi objek dosen
         *  dengan parameter nama lebih dari 50
         */
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < 51; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        mahasiswa = new Mahasiswa(randomString, "1234567");
    }
    public static void testCase4() {
        /**
         *  Membuat instansiasi objek mahasiswa
         *  dengan parameter nim bukan angka
         *  dan panjang karakter bukan 7
         */
        mahasiswa = new Mahasiswa("Mar i Adhari", "19050167");
        mahasiswa = new Mahasiswa("Mar i Adhari", "AAAAAAA");
    }
    public static void testCase5() {
        /**
         *  Membuat instansiasi objek mahasiswa dengan parameter
         *  nama terdapat angka
         */
        mahasiswa = new Mahasiswa("Mar i 123", "1905016");
    }
    public static void testCase6() {
        /**
         *  Membuat instansiasi objek mahasiswa dengan parameter
         *  nama terdapat karakter bukan huruf
         */
        mahasiswa = new Mahasiswa("Mar'i Adhari", "1905016");
    }
}
