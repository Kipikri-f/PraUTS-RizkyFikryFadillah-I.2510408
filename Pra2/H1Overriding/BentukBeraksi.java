package Pra2.H1Overriding;

class Bentuk {
    void gambar() {
        System.out.println("Menggambar bentuk");
    }
}

class Segitiga extends Bentuk {
    @Override
    void gambar() {
        System.out.println("Menggambar segitiga");
    }
}

class Persegi extends Bentuk {
    @Override
    void gambar() {
        System.out.println("Menggambar persegi");
    }
}
public class BentukBeraksi {
    public static void main(String[] args) {
        Bentuk bentuk1 = new Bentuk();
        Bentuk bentuk2 = new Segitiga();
        Bentuk bentuk3 = new Persegi();
        bentuk1.gambar();
        bentuk2.gambar();
        bentuk3.gambar();
    }
}