package G1T1ClassStudent;

public class StudentAction {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Rein";
        student1.nim = "109397";
        student1.showName();
        student1.showNIM();
        student1.sports();
        Student student2 = new Student();
        student2.name = "Nei";
        student2.nim = "781394";
        student2.showName();
        student2.showNIM();
        student2.sports();
        Student student3 = new Student();
        student3.name = "Sen";
        student3.nim = "241902";
        student3.showName();
        student3.showNIM();
        student3.sports();
    }
}