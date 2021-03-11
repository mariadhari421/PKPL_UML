import controller.DosenController;
import controller.KRSController;
import controller.MahasiswaController;
import controller.MataKuliahController;
import model.Dosen;
import model.KRS;
import model.Mahasiswa;
import model.MataKuliah;


public class App {
    public static Mahasiswa mahasiswa = new Mahasiswa();
    public static Dosen dosen = new Dosen();
    public static MataKuliah matematika = new MataKuliah();
    public static KRS krs = new KRS();

    public static MahasiswaController tb_mahasiswa = new MahasiswaController();
    public static DosenController tb_dosen = new DosenController();
    public static MataKuliahController tb_matkul = new MataKuliahController();
    public static KRSController tb_krs = new KRSController();
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        setData();
        addMahasiswa();

    }
    public static void setData(){
        mahasiswa.setNama("Mar'i Adhari");
        mahasiswa.setNim("1905016");
        
        dosen.setNidn("1234567890");
        dosen.setNama("Adi");

        matematika.setNamaMatakuliah("Matematika Diskrit");
        matematika.setPengampu(dosen);
        matematika.setSemester(1);
        matematika.setSks(4);

        krs.setNoKRS("301");
        krs.tambahMatakuliahKRS(matematika);
    }
    public static void addMahasiswa(){
        tb_mahasiswa.create(mahasiswa);
    }
}
