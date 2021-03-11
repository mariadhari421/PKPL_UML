package test;

import java.util.Random;

import model.Dosen;

public class DosenTest {
    public static Dosen dosen; 
   public static void main(String[] args) {
    testCase1();
    testCase2();
    testCase3();
    testCase4();
    testCase5();
   }
   public static void testCase1(){
       //membuat instansiasi objek dosen dengan parameter string kosong
       dosen = new Dosen("", "");
   }
   public static void testCase2(){
       //membuat instansiasi objek dosen dengan parameter null
       String nidn = null;
       String nama = null;
       dosen = new Dosen(nidn, nama);
   }
   public static void testCase3(){
       /**
        *   Membuat instansiasi objek dosen
        *   dengan parameter nidn bukan angka
        *   dan panjang karakter kurang bukan 10
        */
       dosen = new Dosen("nidn", "Mar'i Adhari");
       dosen = new Dosen("aaaaaaaaaa", "Mar'i Adhari");
   }
   public static void testCase4(){
       /**
        *   Membuat instansiasi objek dosen
        *   dengan parameter nama lebih dari 50
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

        dosen = new Dosen("1234567890", randomString);
   }
   public static void testCase5(){
       /**
        *   Membuat instansiasi objek dengan parameter
        *   nama terdapat angka
        */
        dosen = new Dosen("1234567890", "Mar'i 123");
   }
}
