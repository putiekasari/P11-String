public class CreateKode{

    static String tahun_ajaran ="2017-2018";
    static String semester ="Gasal";
    static String kd_prodi = "153";
    static String kode = "";
  
    public static void set_kode(){

    
        //statement
        //output kode = "161530030"
        /*
        1718 : thn ajaran
        1    : sms gasal
        2    : sms genap
        153  : kode prodi
        */

    String ta1 = tahun_ajaran.substring(2,4);
    String ta2 = tahun_ajaran.substring(7,9);
    String no_urut = "01";

    if (semester.equals("Gasal")){
        semester="1";
    }else
        semester="2";
    }
   
    kode = ta1+ta2+semester+kd_prodi+no_urut;
    System.out.println("kode :"+kode);
    }

    public static void main(String[] args){
        set_kode();
    }
}