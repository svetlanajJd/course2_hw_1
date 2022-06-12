package hw_2;

public class Puffendui extends HogwartsStudent {
    private int industriousness;
    private int loyalty;
    private int honour;

    public Puffendui(String name, String lastName, int powerMagic, int actionDistance, int industriousness, int loyalty, int honour) {
        super(name, lastName, powerMagic, actionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honour = honour;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonour() {
        return honour;
    }

    public void comparePuffendui(Puffendui student) {
        int sum = this.getActionDistance() + this.getPowerMagic() + this.getIndustriousness() + this.getHonour() + this.getLoyalty();
        int sumNext = student.getActionDistance() + student.getPowerMagic() + student.getIndustriousness() + student.getHonour() + student.getLoyalty();
        if (sum > sumNext) {
            System.out.println(this.getName() + " лучший Пуффендуиц, чем " + student.getName());
        } else {
            System.out.println(student.getName() +  " лучший Пуффендуиц, чем " + this.getName());
        }
    }

    public void printStudentPuffendui(Puffendui student) {
        printStudentHogwards(student);
        System.out.println("трудолюбие:"+ student.getIndustriousness() + "; честь:" + student.getHonour() + "; верность:" + student.getLoyalty());
    }
}

