package hw_2;

public class HogwartsStudent {
    private int powerMagic;
    private int actionDistance;
    private String name;
    private String lastName;

    public HogwartsStudent(String name, String lastName, int powerMagic, int actionDistance) {
        this.name = name;
        this.lastName = lastName;
        this.powerMagic = powerMagic;
        this.actionDistance = actionDistance;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getActionDistance() {
        return actionDistance;
    }

    public void compareHodwardsStudentMagic(HogwartsStudent student) {
        if (student.getPowerMagic() > this.getPowerMagic()) {
            System.out.println(student.getName() + " обладает большей мощностью магии, чем " + this.getName());
        } else {
            System.out.println(student.getName() + " обладает большей мощностью магии, чем " + this.getName());
        }
    }

    public void compareHodwardsStudentDistance(HogwartsStudent student) {
        if (student.getActionDistance() > this.getActionDistance()) {
            System.out.println(student.getName() + " обладает большим расстоянием трансгресии, чем " + this.getName());
        } else {
            System.out.println(student.getName() +   " обладает большим расстоянием трансгресии, чем " + this.getName());
        }
    }

    public void printStudent() {
        System.out.print(this.getName() + " "+ this.getLastName()+": " + " сила магии:" + this.getPowerMagic() + " баллов; "+" расстояние трансгрессии:" + this.getActionDistance()+"; ");
    }
}
