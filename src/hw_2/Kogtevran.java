package hw_2;

public class Kogtevran extends HogwartsStudent {
    private int mind;
    private int wisdom;
    private int wit;
    private int fullOfCreativity;

    public Kogtevran(String name, String lastName, int powerMagic, int actionDistance, int mind, int wisdom, int wit, int fullOfCreativity) {
        super(name, lastName, powerMagic, actionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void compareKogtevran(Kogtevran student) {
        int sum = this.getActionDistance() + this.getPowerMagic() + this.getMind() + this.getWisdom() + this.getWit() + this.getFullOfCreativity();
        int sumNext = student.getActionDistance() + student.getPowerMagic() + student.getMind() + student.getWisdom() + student.getWit() + student.getFullOfCreativity();
        if (sum > sumNext) {
            System.out.println(this.getName() +  " лучший Когтевранец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " лучший Когтевранец, чем " +  this.getName());
        }
    }

    public void printStudentKogtevran(Kogtevran student) {
        printStudentHogwards(student);
        System.out.println("ум:"+student.getMind() + "; мудрость:" + student.getWisdom() + "; остроумие:" + student.getWit()+"; полнота творчества:"+ student.getFullOfCreativity());
    }
}


