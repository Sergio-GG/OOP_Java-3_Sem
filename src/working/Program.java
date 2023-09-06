package working;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    public static Employee generateEmployee() {
        String[] types = new String[]{"Worker", "Freelancer"};
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surNames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int salaryIndex = random.nextInt(200, 500);

        String typeEmployee = types[random.nextInt(types.length)];

        //System.out.println(typeEmployee);

        if (typeEmployee.equals(types[0])) {

            return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], random.nextInt(18, 60), 100 * salaryIndex);

        } else  {

            return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], random.nextInt(18, 60), salaryIndex);
        }

    }

    public static Employee[] generateEmployees(int count) {
        Employee[] emps = new Employee[count];
        for (int i = 0; i < count; i++) {
            emps[i] = generateEmployee();
        }
        return emps;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees(12);

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Сортируем по названию класса
        Arrays.sort(employees, new ClassComparator());

        System.out.println();

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Сортируем по возрасту специалиста
        Arrays.sort(employees, new AgeComparator());

        System.out.println();

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

