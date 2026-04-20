package Pra2.I2TugasAbstraksi2;

public class KendaraanBeraksi {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        mobil.bergerak(); // Output: Mobil bergerak dengan roda

        Kendaraan sepeda = new Sepeda();
        sepeda.bergerak(); // Output: Sepeda bergerak dengan pedal
    }
}