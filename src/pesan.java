public class pesan {
    private menu item;
    private int jumlah;

    public pesan(menu item, int jumlah) {
        this.item = item;
        this.jumlah = jumlah;
    }

    public int getTotalHarga() {
        return this.item.getHarga() * this.jumlah;
    }

    public void display_pesanan() {
        System.out.println("Item: " + this.item.getNama());
        System.out.println("Jumlah: " + this.jumlah);
        System.out.println("Total Harga: " + getTotalHarga());
    }
}
