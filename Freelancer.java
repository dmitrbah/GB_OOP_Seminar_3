public class Freelancer extends Employee {

    private Freelancer(String surName, String name, double salary, double age) {
        super(surName, name, salary, age);
    }

    public static Freelancer create(String surName, String name, double salary, double age){
        return new Freelancer(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Фрилансер %s %s; ставка: %.2f руб.; заработная плата: %.2f руб; возраст: %.2f",
                surName, name, salary, calculateSalary(), age);
    }
}
