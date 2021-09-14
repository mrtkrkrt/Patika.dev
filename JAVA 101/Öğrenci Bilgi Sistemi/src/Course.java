public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;

    }

    public void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.teacher = teacher;
            System.out.println("Teacher added");
        }else
            System.out.println(teacher.name + " can not give this course");
    }

    public void printTeacher(){
        if (this.teacher != null)
            System.out.println(this.name + " 's teacher is " + teacher.name );
        else
            System.out.println(this.name + " No Academician has been assigned to the course.");
    }
}
