package model;

import java.util.ArrayList;

public class KRS {
    private String noKRS;
    private ArrayList<MataKuliah> paketMataKuliah = new ArrayList<MataKuliah>();

    public KRS(String noKRS) {
        this.noKRS = noKRS;
    }
    public KRS(){
        
    }
    public String getNoKRS() {
        return noKRS;
    }

    public void setNoKRS(String noKRS) {
        this.noKRS = noKRS;
    }
    public ArrayList<MataKuliah> showMataKuliahKRS() {
        return paketMataKuliah;
    }
    public void tambahMatakuliahKRS(MataKuliah mataKuliah) {
        paketMataKuliah.add(mataKuliah);
    }
    public ArrayList<MataKuliah> getPaketMataKuliah() {
        return paketMataKuliah;
    }
}
