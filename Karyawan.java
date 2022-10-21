public class Karyawan {
    String Nama;
    String Jabatan;
    int IdKaryawan;
    double Gaji;
    double Pajak;
    String Status;

    public Karyawan(String inputNama,String inputJabatan,int inputIdKaryawan, String inputStatus){
        this.Jabatan = inputJabatan;
        this.Nama = inputNama;
        this.Status = inputStatus;
        this.IdKaryawan = inputIdKaryawan;
    }
    public double GajiBersih(double gaji,double Pajak){
        return gaji = (Gaji * Pajak)/100;

    }
    public static void main (String[]args){
        Karyawan datakaryawan = new Karyawan(InputNama:"Heldin",Jabatan:"Manager", IdKaryawan:"72849", Status:"Karyawan");
        System.out.println(datakaryawan.Nama);
    }
}
}
