import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Student> students;
    private List<Worker> workers;
    private String name;

    //Singleton Pattern
    private static final Admin instance = new Admin();
    public static Admin getInstance() {
        return instance;
    }
    private Admin(){
        students = new ArrayList<>();
        name = "Admin";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getStudentsAge(){
        List<Integer> ages = new ArrayList<>();
        for (Student s :
                students) {
            ages.add(s.getAge());
        }
        return ages;
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Double> getWorkersSalary(){
        List<Double> salaries = new ArrayList<>();
        for (Worker w :
                workers) {
            salaries.add(w.calculateSalary());
        }
        return salaries;
    }

    public List<Double> getStudentsStipendio(){
        List<Double> stipendio = new ArrayList<>();
        for (Student s :
                students) {
            stipendio.add(s.calculateStipendio());
        }
        return stipendio;
    }
}
