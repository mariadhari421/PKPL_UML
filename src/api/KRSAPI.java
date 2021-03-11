package api;

import model.KRS;

public interface KRSAPI {
    public void create(KRS krs);
    public void index();
    public void show(KRS krs);
    public void update(String noKRS, KRS krs);
    public void delete(String noKRS);
}
