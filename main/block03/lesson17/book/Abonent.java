package main.block03.lesson17.book;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class Abonent {
    private String fio;
    private String number;
    private String operator;
    private static final List<String> NANES = new ArrayList<>();

    static {
        NANES.add("Павел");
        NANES.add("Игорь");
        NANES.add("Сергей");
        NANES.add("Николай");
        NANES.add("Андрей");
        NANES.add("Виктор");
        NANES.add("Алексей");
        NANES.add("Евгений");
        NANES.add("Василий");
        NANES.add("Иван");
    }

    private static final List<String> FAMILY = new ArrayList<>();

    static {
        FAMILY.add("Лосев");
        FAMILY.add("Морозов");
        FAMILY.add("Кузнецов");
        FAMILY.add("Путин");
        FAMILY.add("Сталин");
        FAMILY.add("Брежнев");
        FAMILY.add("Медведев");
        FAMILY.add("Гусев");
        FAMILY.add("Петров");
        FAMILY.add("Иванов");
    }

    private static final List<String> LASTNAME = new ArrayList<>();

    static {
        LASTNAME.add("Васильевич");
        LASTNAME.add("Артемович");
        LASTNAME.add("Викторович");
        LASTNAME.add("Олегович");
        LASTNAME.add("Евгеньевич");
        LASTNAME.add("Алексеевич");
        LASTNAME.add("Александрович");
        LASTNAME.add("Николаевич");
        LASTNAME.add("Сергеевич");
        LASTNAME.add("Иванович");
    }

    private static final List<Integer> MEGAFON = new ArrayList<>();

    static {
        MEGAFON.add(928);
        MEGAFON.add(927);
        MEGAFON.add(938);
        MEGAFON.add(926);
        MEGAFON.add(937);
    }

    private static final List<Integer> MTS = new ArrayList<>();
    static {
        MTS.add(917);
        MTS.add(918);
        MTS.add(988);
        MTS.add(989);
        MTS.add(987);
    }

    private static final List<Integer> BEELINE = new ArrayList<>();
    static {
        BEELINE.add(902);
        BEELINE.add(903);
        BEELINE.add(905);
        BEELINE.add(904);
        BEELINE.add(906);
    }

    public void createFio() {
        Random random = new Random();
        this.fio = FAMILY.get(random.nextInt(9)) + " "
                + NANES.get(random.nextInt(9)) + " "
                + LASTNAME.get(random.nextInt(9));
    }

    public void createNumber() {
        Random randomNumber = new Random();
        int num = randomNumber.nextInt(9999999);
        if (randomNumber.nextInt(2) == 0) {
            this.operator = "Меафон";
            this.number = 8 + "(" + MEGAFON.get(randomNumber.nextInt(4)) + ")" + num + " ";
        } else if (randomNumber.nextInt(2) == 1) {
            this.operator = "МТС";
            this.number = 8 + "(" + MTS.get(randomNumber.nextInt(4)) + ")" + num + " ";
        } else {
            this.operator = "Билайн";
            this.number = 8 + "(" + BEELINE.get(randomNumber.nextInt(4)) + ")" + num + " ";
        }
    }
}