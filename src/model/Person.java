package model;
public abstract class Person {
    protected String nama;
    public abstract void showProfile();

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null) {
            System.out.println("Nama tidak boleh null");
            return;
        }
        if (nama.length() > 50) {
            System.out.println("Panjang karakter nama maksimal 50");
            return;
        }
        if (nama.length() == 0) {
            System.out.println("Nama tidak boleh kosong");
            return;
        }
        char check;
        boolean failed = false;
        for (int i = 0; i < nama.length()-1; i++) {
            check = nama.charAt(i);
            try {
                int value = Integer.valueOf(check);
                failed = true;
                break;
                
            } catch (Exception e) {
                failed = false;
            }
        }
        if (failed) {
            System.out.println("Nama tidak boleh mengandung karakter angka");
            return;
        }
        this.nama = nama;
    }
    
}
