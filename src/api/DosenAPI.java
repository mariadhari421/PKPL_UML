package api;

import model.Dosen;

public interface DosenAPI {
    public void create(Dosen dosen);
    public void index();
    public void show(Dosen dosen);
    public void update(String nidn, Dosen dosen);
    public void delete(String nidn);
}
