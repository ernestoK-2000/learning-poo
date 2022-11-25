public class NightStudent extends Student{

    private int hours;

    public NightStudent(String rollNo, String name, int age, int hours) {
        super(rollNo, name, age);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculateStipendio(){
        return super.baseStipendio * hours / 2.0;
    }
}
