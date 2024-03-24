public class PersegiPanjang { //deklarasi kelas
    private int panjang; //deklarasi private (hanya bisa di akses dalam kelas Persegi panjang)
    private int lebar;

    public PersegiPanjang() { //membuat default constructor dengan nilai 1
        this.panjang = 1;
        this.lebar = 1;
    }

    public PersegiPanjang(int panjangBaru, int lebarBaru) { //untuk menerima konstruktor
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
    }

    public int getLuas() { //mengembalikan nilai luas persegi panjang
        return panjang * lebar;
    }

    public int getKeliling() { //mengembalikan nilai keliling persegi panjang
        return 2 * (panjang + lebar);
    }

    public void setPanjang(int panjangBaru) { //untuk memodifikasi panjang/lebar
        this.panjang = panjangBaru;
    }

    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }

    public static void main(String[] args) { //menciptakan objek kelas PersegiPanjang
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();

        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);

        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);

        System.out.println("Persegi Panjang 1:");
        System.out.println("Luas: " + persegiPanjang1.getLuas());
        System.out.println("Keliling: " + persegiPanjang1.getKeliling());

        System.out.println("\nPersegi Panjang 2:");
        System.out.println("Luas: " + persegiPanjang2.getLuas());
        System.out.println("Keliling: " + persegiPanjang2.getKeliling());

        System.out.println("\nPersegi Panjang 3:");
        System.out.println("Luas: " + persegiPanjang3.getLuas());
        System.out.println("Keliling: " + persegiPanjang3.getKeliling());
    }
}
