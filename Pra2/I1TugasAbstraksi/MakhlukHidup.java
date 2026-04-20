package Pra2.I1TugasAbstraksi;

abstract class MakhlukHidup {
    abstract void bernapas();
}

class Manusia extends MakhlukHidup {
    void bernapas() {
        System.out.println("Manusia bernapas dengan paru-paru");
    }
}

class Hewan extends MakhlukHidup {
    void bernapas() {
        System.out.println("Hewan bernapas dengan berbagai cara");
    }
}