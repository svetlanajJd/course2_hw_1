package hw_2;

public class Griffendor extends HogwartsStudent {
    private int nobility;
    private int honour;
    private int bravery;


    public Griffendor(String name, String lastName, int powerMagic, int actionDistance, int nobility, int honour, int bravery) {
        super(name, lastName, powerMagic, actionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void compare(Griffendor student) {
        int sum = this.getActionDistance() + this.getPowerMagic() + this.getBravery() + this.getHonour() + this.getNobility();
        int sumNext = student.getActionDistance() + student.getPowerMagic() + student.getBravery() + student.getHonour() + student.getNobility();
        if (sum > sumNext) {
            System.out.println(this.getName() + " лучший Гриффендорец, чем " + student.getName());
        } else {
            System.out.println(student.getName() +  " лучший Гриффендорец, чем " + this.getName());
        }
    }

    public void printStudent(){
        super.printStudent();
        System.out.println("храбрость:"+ this.getBravery() + "; честь:" + this.getHonour() + "; благородство:" + this.getNobility());
    }
}


