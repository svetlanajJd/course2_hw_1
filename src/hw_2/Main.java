package hw_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Griffendor garri = new Griffendor("Гарри", "Поттер", 2, 10, 25, 40, 68);
        Griffendor germiona = new Griffendor("Гермиона", "Грейнджер", 10, 50, 70, 42, 52);
        Griffendor ron = new Griffendor("Рон", "Уизли", 20, 35, 30, 75, 65);

        Puffendui zaharia = new Puffendui("Захария", "Смит", 10, 15, 25, 18, 30);
        Puffendui sedric = new Puffendui("Седрик", "Диггори", 20, 35, 45, 78, 68);
        Puffendui jastin = new Puffendui("Джастин", "Финч-Флетчли", 70, 85, 65, 38, 41);

        Kogtevran chzou = new Kogtevran("Чжоу", "Чанг", 70, 83, 65, 59, 54, 41);
        Kogtevran padma = new Kogtevran("Падма", "Патил", 53, 65, 57, 66, 98, 45);
        Kogtevran marcus = new Kogtevran("Маркус", "Белби", 61, 82, 37, 67, 71, 12);

        Slizerin draco = new Slizerin("Драко", "Малфой", 45, 43, 85, 29, 84, 60, 56);
        Slizerin grehem = new Slizerin("Грэхэм", "Монтегю", 73, 44, 98, 38, 91, 84, 41);
        Slizerin gregori = new Slizerin("Грегори", "Гойл", 81, 77, 27, 65, 88, 22, 55);

        ron.compare(garri);
        sedric.compare(jastin);
        marcus.compare(padma);
        gregori.compare(grehem);
        grehem.compareHodwardsStudentMagic(germiona);
        chzou.compareHodwardsStudentDistance(sedric);

        garri.printStudent();
        germiona.printStudent();
        ron.printStudent();

        zaharia.printStudent();
        sedric.printStudent();
        jastin.printStudent();

        chzou.printStudent();
        padma.printStudent();
        marcus.printStudent();

        draco.printStudent();
        grehem.printStudent();
        gregori.printStudent();
    }
}
