public abstract class Student {
    private String rollNo;
    private String name;
    private int age;
    protected int baseStipendio;

    public Student(String rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        baseStipendio = 100;
    }

    /*public double calculateStipendio(){
        return 500;
    }*/
    public abstract double calculateStipendio();

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
