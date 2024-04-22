//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int ageKate = 21;
        if (ageKate >= 18) {
            System.out.println("Если возраст человека равен " + ageKate + ", то он совершеннолетний.");
        }
        if (ageKate < 18) {
            System.out.println("Если возраст человека равен " + ageKate + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        int ageRoma = 17;
        if (ageRoma >= 18) {
            System.out.println("Если возраст человека равен " + ageRoma + ", то он совершеннолетний.");
        }
        if (ageRoma < 18) {
            System.out.println("Если возраст человека равен " + ageRoma + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("\nЗадание 2");
        int temp = 4;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градуса, нужно надеть шапку.");
        }
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }
        int tempNow = 18;
        if (tempNow < 5) {
            System.out.println("На улице " + tempNow + " градусов, нужно надеть шапку.");
        }
        if (tempNow > 5) {
            System.out.println("На улице " + tempNow + " градусов, можно идти без шапки.");
        }

        System.out.println("\nЗадание 3");
        int maxSpeed = 72;
        if (maxSpeed < 60) {
            System.out.println("Если скорость " + maxSpeed + ", то можно ездить спокойно.");
        }
        if (maxSpeed > 60) {
            System.out.println("Если скорость " + maxSpeed + ", то придется заплатить штраф.");
        }
        int minSpeed = 40;
        if (minSpeed < 60) {
            System.out.println("Если скорость " + minSpeed + ", то можно ездить спокойно.");
        }
        if (minSpeed > 60) {
            System.out.println("Если скорость " + minSpeed + ", то придется заплатить штраф.");
        }

        System.out.println("\nЗадание 4");
        int ageMasha = 3;
        if (ageMasha = 2 && => 6) {
            System.out.println("Если возраст человека равен " + ageMasha + ", то ему нужно ходить в детский сад.");
        }

        if (ageMasha  >= 7 && <= 17) {
            System.out.println("Если возраст человека равен " + ageMasha + ", то ему нужно ходить в школу.");
        }
        if (ageMasha  >= 18 && <= 24) {
            System.out.println("Если возраст человека равен " + ageMasha + ", то ему нужно ходить в университет.");
        }
        if (ageMasha => 24){
            System.out.println("Если возраст человека равен " + ageMasha + ", то ему нужно ходить на работу.");
        }

    }
}