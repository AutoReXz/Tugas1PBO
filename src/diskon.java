public class diskon extends makanan {
    private int diskon;

    public diskon(String nama, int harga, int diskon) {
        super(nama, harga);
        this.diskon = diskon;
    }

    @Override
    public String getNama() {
        return this.nama + " (Diskon " + this.diskon + "%)";
    }

    @Override
    public int getHarga() {
        return this.harga - (this.harga * this.diskon / 100);
    }
}
