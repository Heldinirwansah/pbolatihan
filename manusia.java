package PBO;

public class manusia {
    String rambut, mata, mulut, telinga, tangan, kaki;

    /*
    set = kata "SET" hanya kebiasaan programmer yang mengartikan
    fungsi untuk memasukkan nilai kedalam method pada suatu class

    get = kata "GET" hanya kebiasaan programmer yang mengartikan
    fungsi untuk mengambil nilai dari class
    */

    public void setRambut(String rambut) {
        this.rambut = rambut;
    }

    public void setMata(String mata) {
        this.mata = mata;
    }

    public void setMulut(String mulut) {
        this.mulut = mulut;
    }

    public void setTelinga(String telinga) {
        this.telinga = telinga;
    }

    public void setTangan(String tangan) {
        this.tangan = tangan;
    }

    public void setKaki(String kaki) {
        this.kaki = kaki;
    }

    public String getRambut() {
        return rambut;
    }

    public String getMata() {
        return mata;
    }

    public String getMulut() {
        return mulut;
    }

    public String getTelinga() {
        return telinga;
    }

    public String getTangan() {
        return tangan;
    }

    public String getKaki() {
        return kaki;
    }

    void bermain( String m ){ //dgn parameter
        System.out.println("Ayo bermain "+ m);
    }

    void makan(){ //tanpa parameter
        System.out.println("Aku makan Bakso");
    }

    void tidur(String tempat, String lokasi){ //2 paramater
        System.out.println("Aku tidur di "+ tempat + " lokasinya di "+ lokasi);
    }

    void bekerja(){
        System.out.println("Kerja di PT Persada Jaya");
    }

    void memasak(){
        System.out.println("Aku memasak Semur");
    }

    void mencuci(){
        System.out.println("Aku sedang mencuci baju");
    }

}
