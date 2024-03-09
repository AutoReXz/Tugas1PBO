public class reguler extends makanan {
    public reguler(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public String getNama() {
        return this.nama;
    }

    @Override
    public int getHarga() {
        return this.harga;
    }
}
