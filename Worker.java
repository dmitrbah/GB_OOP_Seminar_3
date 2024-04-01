public class Worker extends Employee {

    private Worker(String surName, String name, double salary, double age) {
        super(surName, name, salary, age);
    }

    public static Worker create(String surName, String name, double salary, double age){
        return new Worker(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Рабочий %s %s; ставка: %.2f руб.; заработная плата: %.2f руб; возраст: %.2f",
                surName, name, salary, calculateSalary(), age);
    }
}
