package model;

public class MataKuliah {
    private String namaMatakuliah;
    private int sks;
    private int semester;
    private Dosen pengampu;

    public MataKuliah(String namaMatakuliah, int sks) {
        this.setNamaMatakuliah(namaMatakuliah);
        this.setSks(sks);
    }
    public MataKuliah(){

    }
    public String getNamaMatakuliah() {
        return namaMatakuliah;
    }

    public void setNamaMatakuliah(String namaMatakuliah) {
        if (namaMatakuliah == null) {
            System.out.println("Nama mata kuliah tidak boleh null");
            return;
        }
        if (namaMatakuliah.compareTo("") == 0) {
            System.out.println("Nama mata kuliah tidak boleh kosong");
            return;
        }
        this.namaMatakuliah = namaMatakuliah;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        if (sks < 0) {
            System.out.println("SKS tidak boleh minus");
            return;
        }
        String Sks = String.valueOf(sks);
        if (Sks.length()>1) {
            System.out.println("Panjang digit sks harus 1");
            return;
        }
        this.sks = sks;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        if (semester < 0) {
            System.out.println("Semester tidak boleh minus");
            return;
        }
        String semester_ = String.valueOf(semester);
        if (semester_.length() > 1) {
            System.out.println("Panjang digit semester harus 1");
            return;
        }
        this.semester = semester;
    }

    public Dosen getPengampu() {
        if (this.pengampu == null) {
            System.out.println("Data dosen pengampu null");
        }
        return pengampu;
    }

    public void setPengampu(Dosen pengampu) {
        if (pengampu == null) {
            System.out.println("Data dosen pengampu tidak boleh null");
            return;
        }
        if (pengampu.getClass().toString().compareTo("class model.Dosen") == 0) {
            this.pengampu = pengampu;
        }
        else{
            System.out.println("Class data pengampu harus class Dosen");
        }
    }
}
