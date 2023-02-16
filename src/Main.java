public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }
    public static void task2() {
        System.out.println("Task 2");
        int clientOS = 3;
        if(clientOS > 1) {
            System.out.println("Ошибка, введите коректные данные");
        }

        int clientDeviceYear = 2020;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }


    public static void task3 () {
        System.out.println("Task 3");
        int year = 2020;
        if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4() {
        System.out.println("Task 4");

        int deliveryDistance  = 1100;
        int day = 0;

        if(deliveryDistance <= 20) {
            System.out.println("На растояние " + deliveryDistance + " км потребуется сутки");
        } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
            day += 2;
            System.out.println("На растояние " + deliveryDistance + " км потребуется " + day + " дней");
        } else if (deliveryDistance <= 100 && deliveryDistance > 60) {
            day += 3;
            System.out.println("На растояние " + deliveryDistance + " км потребуется "  + day + " дней");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("task 5");

        int monthNumber = 5;

        switch (monthNumber) {
            case 1 :
                System.out.println("Зима");
                break;
            case 2 :
                System.out.println("Зима");
                break;
            case 3 :
                System.out.println("Весна");
                break;
            case 4 :
                System.out.println("Весна");
                break;
            case 5 :
                System.out.println("Весна");
                break;
            case 6 :
                System.out.println("Лето");
                break;
            case 7 :
                System.out.println("Лето");
                break;
            case 8 :
                System.out.println("Лето");
                break;
            case 9 :
                System.out.println("Осень");
                break;
            case 10 :
                System.out.println("Осень");
                break;
            case 11 :
                System.out.println("Осень");
                break;
            case 12 :
                System.out.println("Зима");
                break;
        }
    }
}