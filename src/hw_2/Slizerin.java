package hw_2;

public class Slizerin extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerin(String name, String lastName, int powerMagic, int actionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, lastName, powerMagic, actionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void compareSlizerin(Slizerin student) {
        int sum = this.getActionDistance() + this.getPowerMagic() + this.getCunning() + this.getDetermination() + getAmbition() + this.getResourcefulness() + this.getLustForPower();
        int sumNext = student.getActionDistance() + student.getPowerMagic() + student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getLustForPower();
        if (sum > sumNext) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + student.getName());
        } else {
            System.out.println(student.getName() +" лучший Слизеринец, чем " + this.getName());
        }
    }

    public void printStudentSlizerin(Slizerin student) {
        printStudentHogwards(student);
        System.out.println("хитрость:"+student.getCunning() + "; решительность:" + student.getDetermination() + "; амбициозность:" + student.getAmbition()+"; находчивость:"+student.getResourcefulness() + "; жажда власти:"+student.getLustForPower());
    }
}

