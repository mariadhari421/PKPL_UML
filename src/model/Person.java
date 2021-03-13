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
        String check;
        String[] characters = {
            "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "0",
            "`", "~", "!", "@", "#",
            "$", "%", "^", "&", "*",
            "(", ")", "-", "_", "=",
            "+", "{", "[", "]", "}",
            "|", ";", ":", "'", ",",
            "<", ".", ">", "/", "?"
        };
        for (int i = 0; i < nama.length()-1; i++) {
            check = nama.substring(i, i+1);
            for (int j = 0; j < 40; j++) {
                if (check.compareTo(characters[j]) == 0) {
                    System.out.println("Nama tidak boleh terdapat karakter selain huruf");
                    return;
                }
            }
        }
        boolean failed = false;
        for (int i = 0; i < nama.length()-1; i++) {
            check = nama.substring(i, i+1);
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
