package working;

/**
 * Фрилансер
 */
public class Freelancer extends Employee{

    public Freelancer(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);
    }

    // Почасовая зарплата
    @Override
    public double calculateSalary() {
        return salary * 8 * 20;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; %d лет; Среднемесячная заработная плата (почасовая) %.2f",
                surName, name, age, calculateSalary());
    }
}
