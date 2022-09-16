package PBO;

public class pesawatTelepon {
    String bentuk, kabel, gagang_telepon;

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public void setKabel(String kabel) {
        this.kabel = kabel;
    }

    public void setGagangTelepon(String gagang_telepon) {
        this.gagang_telepon = gagang_telepon;
    }

    public String getBentuk() {
        return bentuk;
    }

    public String getKabel() {
        return kabel;
    }

    public String getGagangTelepon() {
        return gagang_telepon;
    }

    void terima_panggilan(String pemanggil, String waktu) {
        System.out.println("Saya menerima panggilan dari " + pemanggil + " " + waktu + " lalu");
    }

    void melakukan_panggilan(String pemanggil, String waktu) {
        System.out.println("Saya menerima panggilan dari " + pemanggil + " " + waktu);
    }

}

