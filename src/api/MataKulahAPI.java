package api;

import model.MataKuliah;

public interface MataKulahAPI {
    public void create(MataKuliah mataKuliah);
    public void index();
    public void show(MataKuliah mataKuliah);
    public void update(String namaMatakuliah, MataKuliah mataKuliah);
    public void delete(String namaMatakuliah);

}
