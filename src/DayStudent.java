public class DayStudent extends Student{
    private int group;
    private int days;

    public DayStudent(int group, String name, String rollNo, int age, int days){
        super(rollNo, name, age);
        this.group = group;
        this.days = days;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public double calculateStipendio() {
        return super.baseStipendio * days;
    }
}
