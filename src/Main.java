import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");//     Гарри Поттер
        int max = 100;

        Random rn = new Random();
        int i = rn.nextInt(max + 1);

        Object students[] = new Object[12];
        students[0] = new Gryffindors("Gryffindors", "Гарри Поттер", 80, 12, 2, 3, 45);
        students[1] = new Gryffindors("Gryffindors", "Гермиона Грейнджер", 90, 1, 2, 3, 45);
        students[2] = new Gryffindors("Gryffindors", "Рон Уизли", 100, 1, 2, 3, 45);

        students[3] = new Hufflepuff("Hufflepuff", "Захария Смит", rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1));
        students[4] = new Hufflepuff("Hufflepuff", "Седрик Диггори", rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1));
        students[5] = new Hufflepuff("Hufflepuff", "Джастин Финч-Флетчли", rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1));

        students[6] = new Ravenclaws("Ravenclaws", "Чжоу Чанг", rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1));
        students[7] = new Ravenclaws("Ravenclaws", "Падма Патил", rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1));
        students[8] = new Ravenclaws("Ravenclaws", "Маркус Белби", rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1));

        students[9] = new Slytherin("Slytherin", "Захария Смит", rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1));
        students[10] = new Slytherin("Slytherin", "Седрик Диггори", rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1));
        students[11] = new Slytherin("Slytherin", "Джастин Финч-Флетчли", rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1), rn.nextInt(max + 1));

        System.out.println("вывод списока всех студенто и параметров");
        listStudents(students);   // вывод списока всех студенто и параметров

        System.out.println("вывод списока одого студента и его параметров");
        System.out.println(students[0]);   // вывод  одого студента и параметров
        listOneStudents(students[11]);  // метод, вывод  одого студента и его параметров


        // сравнение студентов с одинакового факультета по суммарным параметрам
        facultyStudentsComparison((Gryffindors) students[0], (Gryffindors) students[1]);
        facultyStudentsComparison((Hufflepuff) students[3], (Hufflepuff) students[5]);
        facultyStudentsComparison((Ravenclaws) students[6], (Ravenclaws) students[7]);
        facultyStudentsComparison((Slytherin) students[9], (Slytherin) students[11]);

        // сравнение студентов с любых факультетов по параметрам  MagicPower + TransgressionDistance
        StudentsComparison((Hogwarts) students[0], (Hogwarts) students[1]);
        StudentsComparison((Hogwarts) students[0], (Hogwarts) students[11]);
        StudentsComparison((Hogwarts) students[0], (Hogwarts) students[8]);
        StudentsComparison((Hogwarts) students[0], (Hogwarts) students[5]);
    }

    // метод, вывод  одого студента и параметров
    public static void listOneStudents(Object students ) {
        System.out.println(students);
    }

    // метод,вывод списока всех студенто и параметров
    public static void listStudents(Object students[]) {
        for (Object i : students) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }


    // метод,  сравнение студентов с одинакового факультета по суммарным параметрам
    public static void facultyStudentsComparison(Gryffindors students1, Gryffindors students2) {
        System.out.print( "сравнение по параметрам факультета Gryffindors: ");
        if ((students1.getNobility() + students1.getHonour() + students1.getBravery()) > (students2.getNobility() + students2.getHonour() + students2.getBravery())) {
            System.out.println(students1.getName() + " круче чем " + students2.getName());
        } else if ((students1.getNobility() + students1.getHonour() + students1.getBravery()) < (students2.getNobility() + students2.getHonour() + students2.getBravery())) {
            System.out.println(students2.getName() + " круче чем " + students1.getName());
        } else {
            System.out.println(students1.getName() + " равны " + students2.getName());
        }
    }

    // метод,  сравнение студентов с одинакового факультета по суммарным параметрам
    public static void facultyStudentsComparison(Hufflepuff students1, Hufflepuff students2) {
        System.out.print( "сравнение по параметрам факультета Hufflepuff: ");
        if ((students1.getDiligence() + students1.getLoyalty() + students1.getHonesty()) > (students2.getDiligence() + students2.getLoyalty() + students2.getHonesty())) {
            System.out.println(students1.getName() + " круче чем " + students2.getName());
        } else if ((students1.getDiligence() + students1.getLoyalty() + students1.getHonesty()) < (students2.getDiligence() + students2.getLoyalty() + students2.getHonesty())) {
            System.out.println(students2.getName() + " круче чем " + students1.getName());
        } else {
            System.out.println(students1.getName() + " равны " + students2.getName());
        }
    }

    // метод,  сравнение студентов с одинакового факультета по суммарным параметрам
    public static void facultyStudentsComparison(Ravenclaws students1, Ravenclaws students2) {
        System.out.print( "сравнение по параметрам факультета Ravenclaws: ");
        if ((students1.getMind() + students1.getCreation() + students1.getWisdom() + students1.getWit()) > (students2.getMind() + students2.getCreation() + students2.getWisdom() + students2.getWit()) ) {
            System.out.println(students1.getName() + " круче чем " + students2.getName());
        } else if ((students1.getMind() + students1.getCreation() + students1.getWisdom() + students1.getWit()) < (students2.getMind() + students2.getCreation() + students2.getWisdom() + students2.getWit()) ) {
            System.out.println(students2.getName() + " круче чем " + students1.getName());
        } else {
            System.out.println(students1.getName() + " равны " + students2.getName());
        }
    }

    // метод,  сравнение студентов с одинакового факультета по суммарным параметрам
    public static void facultyStudentsComparison(Slytherin students1, Slytherin students2) {
        System.out.print( "сравнение по параметрам факультета Slytherin: ");
        if ((students1.getCinaccessibility() + students1.getCresourcefulness() + students1.getClustForPower() + students1.getCsusceptibility()+ students1.getCunning()) > (students2.getCinaccessibility() + students2.getCresourcefulness() + students2.getClustForPower() + students2.getCsusceptibility()+ students2.getCunning()) ) {
            System.out.println(students1.getName() + " круче чем " + students2.getName());
        } else if (  (students1.getCinaccessibility() + students1.getCresourcefulness() + students1.getClustForPower() + students1.getCsusceptibility()+ students1.getCunning()) < (students2.getCinaccessibility() + students2.getCresourcefulness() + students2.getClustForPower() + students2.getCsusceptibility()+ students2.getCunning())  ) {
            System.out.println(students2.getName() + " круче чем " + students1.getName());
        } else {
            System.out.println(students1.getName() + " равны " + students2.getName());
        }
    }

    // метод, сравнение студентов с любых факультетов по параметрам  MagicPower + TransgressionDistance
    public static void StudentsComparison(Hogwarts students1, Hogwarts students2) {
        System.out.print( "сравнение по общим параметрам MagicPower + TransgressionDistance : ");
        if ((students1.getMagicPower() + students1.getTransgressionDistance()) > (students2.getMagicPower() + students2.getTransgressionDistance())) {
            System.out.println(students1.getName() + " круче чем " + students2.getName());
        } else if ((students1.getMagicPower() + students1.getTransgressionDistance()) < (students2.getMagicPower() + students2.getTransgressionDistance())) {
            System.out.println(students2.getName() + " круче чем " + students1.getName());
        } else {
            System.out.println(students1.getName() + " равны " + students2.getName());
        }

    }


}

/*
# 2.2 ООП часть 1. Инкапсуляция и наследование

> Привет!

На связи домашнее задание урока ООП часть 1. Инкапсуляция и наследование.
Выполненное домашнее задание пришлите в виде ссылки на проект на GitHub.
>

## 1 задание

В школе магии и волшебства Хогвартс есть четыре факультета:

- Гриффиндор
- Пуффендуй
- Когтевран
- Слизерин

Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.
Всем Гриффиндорцам присущи благородство, честь и храбрость.
Студенты Пуффендуя трудолюбивы, верны, честны.
Когтевранцы умны, мудры, остроумны и полны творчества.
Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов и могут трансгрессировать на какое-то расстояние. Сила магии и расстояние трансгресии у каждого ученика своё и выражается в целочисленном эквиваленте.
Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.
Напишите программу, в которой реализован класс hogwarts и четыре класса по названиям факультетов. В классах факультетов опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы в качестве объектов. Должна быть возможность задавать качества учеников через конструктор. Присвойте каждому свойству произвольное числовое значение от 0 до 100.
Сделайте метод, который выводит на экран описание студента. В описание надо включать качества, которые присущи всем студентам, плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.
Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой учеников одного факультета по свойствам. У каждого ученика нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета.
Тот ученик, у которого сумма свойств больше, считается лучшим учеником.
Метод должен выводить в консоль сравнение учеников.
Например, у Гермионы благородство = 5 баллов, честь = 5 баллов и храбрость = 6 баллов. У Рона Уизли благородство = 3 балла, честь = 6 баллов и храбрость = 5 баллов.
У Гермионы сумма баллов равна 16-ти, а у Рона – 14-ти. Значит метод должен вывести в консоль “Гермиона лучший Гриффиндорец, чем Рон”.
Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками.
Например, Драко Малфой обладает бОльшей мощностью магии, чем Захария Смит.
Важно: поля объектов должны быть приватными.
- Критерии оценки:
    - Реализован класс hogwarts с описанием свойств, присущих всем ученикам
    - Классы-факультеты описывают свойства учеников-наследников и являются наследниками класса hogwarts
    - Ученики реализованы в качестве объектов и наследуют свойства класса-факультета и класса hogwarts
    - Качества учеников можно задавать с помощью конструктора
    - Реализован метод, который выводит на экран описание студента: качества, присущие всем ученикам школы и присущие определенному факультету.
    - Реализованы методы, которые выводят на экран результат сравнения двух учеников одного факультета по свойствам только это факультета
    - Реализован метод, который сравнивает двух любых учеников по присущим всем ученикам школы характеристикам.
 */