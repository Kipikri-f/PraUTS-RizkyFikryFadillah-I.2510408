package Pra2.I1TugasAbstraksi;

public class MakhlukHidupBeraksi {
    public static void main(String[] args) {
        MakhlukHidup manusia = new Manusia();
        manusia.bernapas(); // Output: Manusia bernapas dengan paru-paru

        MakhlukHidup hewan = new Hewan();
        hewan.bernapas(); // Output: Hewan bernapas dengan berbagai cara
    }
}