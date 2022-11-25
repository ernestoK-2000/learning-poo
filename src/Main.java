import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new NightStudent("1", "Carlos", 20, 300);


        Student student2 = new DayStudent(1, "Gabriel", "2", 20, 30);
        if (student2 instanceof DayStudent) {
            DayStudent dayStudent = (DayStudent) student2;
            dayStudent.getGroup();
        }

        Admin admin = Admin.getInstance();
        admin.addStudent(student1);
        admin.addStudent(student2);
        List<Double> stipendios = admin.getStudentsStipendio();
        for (Double d :
                stipendios) {
            System.out.println(d);
        }
        admin.setName("Admin1");


        System.out.println(student1.getAge());

        System.out.println("Probando singleton");
        Admin admin2 = Admin.getInstance();
        System.out.println(admin2.getName());














    }
}
