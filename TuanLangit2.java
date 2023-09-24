
import java.util.Scanner;

public class TuanLangit2 { 
    
    public static void main(String[] args){
         boolean TuanLangit = true;
         int totalbelanja = 0;
         int kembalian = 0;
         int stock1 = 100 ;
         int stock2 = 100 ;
         int stock3 = 100 ;
         int stock4 = 100 ;
         int stock5 = 100 ;
         // untutk kata pembuka
        System.out.println("\t ==============\n" +
        "\t== TOKO LANGIT ==\n" +
        "=================================\n" +
        "  selamat datang di toko langit\n" +
        "    mohon habiskan uang anda\n" +
        "---------------------------------\n"+
        "pilihan barang:"); 
       try (Scanner inputpembeli = new Scanner(System.in)) {
         int pilihan;
           int harga;
           int pembayaran;
           int jumlah;
           String jualan;
           // untuk tampilan menu berulang. cat: UL. adalah singkatan dari uang langit
        while( TuanLangit ){
               jualan = "\n1. selembar awan (UL.10000) " + stock1 + " stok yang tersedia";
               jualan += "\n2. tinta hujan (UL.40000)  " + stock2 + " stok yang tersedia";
               jualan += "\n3. kuas senja (UL.25000) " + stock3 + " stok yang tersedia";
               jualan += "\n4. kanvas cakrawala (UL.75000) "+ stock4 + " stok yang tersedia";
               jualan += "\n5. atap negeri (UL.80000) " + stock5 + " stok yang tersedia";
               jualan += "\n9. pembayaran";
               jualan += "\n0. keluar\n";
               //agar muncul kembali saat perulangan
               jualan += "\n\n total belanja: UL. " + totalbelanja + " hayoo pesan yang banyak ";
               jualan += "\t masukkan pilihan barang ";
               jualan += "\n----------------------------------";
               // untuk memasukka nilai menu nomor berapa yang akan dipilih
               System.out.println(jualan);
               pilihan = inputpembeli.nextInt();
              
                 if ( pilihan == 1 || pilihan == 2 || pilihan == 3 || pilihan == 4 || pilihan == 5 ){
                  //untuk memasukkan nilai jumlah barang yang akan dibeli
                 System.out.print("jumlah: ");
                 jumlah = inputpembeli.nextInt();
                // sebagai pendata barang apa saja yang dibeli dan berapa jumlahnya
                 System.out.println("pilihan nomor " + pilihan + " jumlah yang dibeli " + jumlah + " buah");
                
                //proses perhitungan total belanja
                 switch (pilihan){
               
                    case 1:
                    harga = 10000;
                     int bayar = harga * jumlah;
                     stock1 -= jumlah;
                    totalbelanja += bayar;
                    break;
                    case 2:
                    harga = 40000;
                    bayar = harga * jumlah;
                    stock2 -= jumlah;
                    totalbelanja += bayar;
                    break;
                    case 3:
                    harga = 25000;
                   bayar = harga * jumlah;
                   stock3 -= jumlah;
                    totalbelanja += bayar;
                    break;
                    case 4:
                    harga = 75000;
                    bayar = harga * jumlah;
                    stock4 -= jumlah;
                    totalbelanja += bayar;
                    break;
                    case 5:
                    harga = 80000;
                    bayar = harga * jumlah;
                    stock5 -= jumlah;
                    totalbelanja += bayar;
                    break;                                    
                 }
                  //untuk keluar dari program
                } else if (pilihan == 0){
                  TuanLangit = false;
                  System.out.println("JANGAN DADTANG LAGI SEBELUM DOMPET ANDA TERISI !");
                  //menu pembayaran serta kembalian setelah memmbayar akan mereset total belanja lalu perulangan tampilan menu masih akan tetap terjadi
                } else if (pilihan == 9){
                System.out.println("\tpembayaran");
                System.out.println("\t-------------");
                System.out.println("total: ul." + totalbelanja );
                System.err.print("bayar: ul.");
                pembayaran = inputpembeli.nextInt();
                //menghitung kembalian                
                kembalian = pembayaran - totalbelanja;
                System.out.println("kembalian: ul." + kembalian);
                totalbelanja = 0;
                System.out.println("-------------------------------------------");
                System.out.println("TERIMAKASIH TELAH BERBELANJA DI TOKO LANGIT");

               }              
               }
      } 
                  }
                 }
    
            
         

             
            
            
        
    


    