package api;

import model.Mahasiswa;

public interface MahasiswaAPI {
    public void create(Mahasiswa mahasiswa);
    public void index();
    public void show(Mahasiswa mahasiswa);
    public void update(String nim, Mahasiswa mahasiswa);
    public void delete(String nim);
}
