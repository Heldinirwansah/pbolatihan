package PBO;

public class MainApp {
    public static void main(String[] args) {
        //panggil class Manusia
        manusia m = new manusia();

        m.setRambut("Keriting");
        System.out.println("Rambutku " + m.getRambut());

    // class Hewan
    hewan d = new hewan();
        d.setKaki("ada 4");
        System.out.println("Kakiku "+d.getKaki());
        d.setMata("ada 2");
        System.out.println("Mataku "+d.getMata());
        d.makan("Ikan Asin");

    // class PesawatTelepon
    pesawatTelepon pt = new pesawatTelepon();
        pt.setKabel("8 meter");
        System.out.println("Kabel telepon rumah berukuran, sekitar "+pt.getKabel());
        pt.terima_panggilan("Pln","Lusa");
}
}
