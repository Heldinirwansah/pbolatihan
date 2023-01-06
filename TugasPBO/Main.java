
package TugasPBO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends IuranWarga {
    public static void main(String[] args) {
        int pilihan=0;
        String lanjut;
        DataWarga dataWarga=new DataWarga();

        Parents overloading=new Parents();
        Child overriding=new Child();
        List<Integer> result=new ArrayList<Integer>();
        do{
            Scanner sc=new Scanner(System.in);

            if(dataWarga.getNama()!=null){
                System.out.println("Lanjut Bayar Iuran ?");
                lanjut=sc.nextLine();
                if(lanjut.equalsIgnoreCase("ya")){
                    pilihan=2;
                }else{
                    pilihan=0;
                }
            }else{
                System.out.println("=====================================");
                System.out.println("Pendataan dan Pembayaran Iuran Warga");
                System.out.println("=====================================");
                System.out.println("1. Input Data Warga");
                System.out.println("2. Input Iuran Warga");
                System.out.print("Pilihan Menu : ");
                pilihan = sc.nextInt();
            }
            System.out.println("-----------------o0o-----------------");
            if(pilihan==1){
                dataWarga = Parents.inputDataWarga();
            }else if(pilihan==2){
                Child.inputDataIuran(dataWarga.getNik());
                result =  Child.getResult();
            }
        }while (pilihan!=0);

        System.out.printf("|| %-28s || %-10s ",
                "NIK",result.get(0));
        System.out.println();
        System.out.printf("|| %-10s || %-5s ",
                "Total Pembayaran Iuran Warga",result.get(1));
        System.out.println();
        System.out.println("Terimakasih "+dataWarga.getNama()+" Iuran Anda Sudah di Bayarkan");

    }
}