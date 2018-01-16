public class AutoNim {

    public static void main(String[] args){
        //NM : Tahun Masuk + Kode Prodi + Nomor Urut Registrasi
        String ta = "2015";
        String kd_prodi = "153";
        String no_reg = "0001";
        String nim;

        nim = ta.substring(2,4)+kd_prodi+no_reg;
                //ket (2,4) : 2 mrpkan no.index ke 2 dan 4 merupakan panjang karakter
        System.out.println("NIM : "+nim);
    }
}