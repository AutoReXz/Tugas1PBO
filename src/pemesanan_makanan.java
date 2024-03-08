public class pemesanan_makanan {
    public static void main(String[] args) {
        
        // Membuat paket makanan
        nasi paket1 = new nasi("Nasi Goreng", 15000);

        // Membuat makanan dengan diskon
        diskon paket2 = new diskon("Nasi ayam", 15000, 20);

        System.out.println("Menu Makanan:");
        display_menu(paket1);
        display_menu(paket2);

        // pesan makanan
        pesan order1 = new pesan(paket1, 1);
        pesan order2 = new pesan(paket2, 2);

        // buat nota
        System.out.println("\nDetail Pesanan:");
        order1.display_pesanan();
        order2.display_pesanan();
    }

    // nampilin 
    public static void display_menu(menu item) {
        System.out.println("Nama: " + item.getNama());
        System.out.println("Harga: " + item.getHarga());
        System.out.println();
    }
}
