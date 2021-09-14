public class Main {
    public static void main(String[] args) {

        Course history = new Course("History", "101", "HTY");
        Course physics = new Course("Physics", "500", "PYC");
        Course chemistry = new Course("Chemistry", "205", "CMY");
        Course maths = new Course("Maths", "278", "MTH");
        Course turkish = new Course("Turkish", "453", "TRS");
        Course biology = new Course("Biology", "325", "BLY");

        Teacher teacher1 = new Teacher("Lale Basar", "5648975642", "MTH");
        Teacher teacher2 = new Teacher("Eda Yilmaz", "5879654321", "PYC");
        Teacher teacher3 = new Teacher("Ece Guler", "5548975612", "TRS");

        maths.addTeacher(teacher1);
        maths.printTeacher();

        physics.addTeacher(teacher2);
        physics.printTeacher();

        chemistry.addTeacher(teacher3);
        chemistry.printTeacher();

        Student student1 = new Student("Ayla Dikmen", "478", "4", maths, physics,chemistry);
        student1.addBulkExamNote(45,63,78,70,85,90);

        student1.isPass();

        Student student2 = new Student("Eda Ece", "4789", "3", maths, physics, chemistry);
        student2.addBulkExamNote(40,25,14,18,38,25);

        student2.isPass();

    }
}
