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
        if (ageMasha >= 2 && ageMasha <= 6) {
            System.out.println("Если возраст человека равен " + ageMasha + ", то ему нужно ходить в детский сад.");
        }
        else if (ageMasha >= 7 && ageMasha <= 17) {
            System.out.println("Если возраст человека равен " + ageMasha+ ", то ему нужно ходить в школу.");
        }
        else if (ageMasha >= 18 && ageMasha <= 24) {
            System.out.println("Если возраст человека равен " + ageMasha+ ", то ему нужно ходить в университет.");
        }
        else if (ageMasha >= 24) {
            System.out.println("Если возраст человека равен " + ageMasha + ", то ему нужно ходить на работу.");
        }
        int ageAlex = 11;
        if (ageAlex >= 2 && ageAlex <= 6) {
            System.out.println("Если возраст человека равен " + ageAlex + ", то ему нужно ходить в детский сад.");
        }
        else if (ageAlex >= 7 && ageAlex <= 17) {
            System.out.println("Если возраст человека равен " + ageAlex + ", то ему нужно ходить в школу.");
        }
        else if (ageAlex >= 18 && ageAlex <= 24) {
            System.out.println("Если возраст человека равен " + ageAlex + ", то ему нужно ходить в университет.");
        }
        else if (ageAlex >= 24) {
            System.out.println("Если возраст человека равен " + ageAlex + ", то ему нужно ходить на работу.");
        }
        int agePavel = 21;
        if (agePavel >= 2 && agePavel <= 6) {
            System.out.println("Если возраст человека равен " + agePavel + ", то ему нужно ходить в детский сад.");
        }
        else if (agePavel >= 7 && agePavel <= 17) {
            System.out.println("Если возраст человека равен " + agePavel + ", то ему нужно ходить в школу.");
        }
        else if (agePavel>= 18 && agePavel <= 24) {
            System.out.println("Если возраст человека равен " + agePavel+ ", то ему нужно ходить в университет.");
        }
        else if (agePavel>= 24) {
            System.out.println("Если возраст человека равен " + agePavel + ", то ему нужно ходить на работу.");
        }

        int ageDanya = 26;
        if (ageDanya >= 2 && ageDanya <= 6) {
            System.out.println("Если возраст человека равен " + ageDanya+ ", то ему нужно ходить в детский сад.");
        }
        else if (ageDanya >= 7 && ageDanya <= 17) {
            System.out.println("Если возраст человека равен " + ageDanya + ", то ему нужно ходить в школу.");
        }
        else if (ageDanya>= 18 && ageDanya <= 24) {
            System.out.println("Если возраст человека равен " + ageDanya+ ", то ему нужно ходить в университет.");
        }
        else if (ageDanya>= 24) {
            System.out.println("Если возраст человека равен " + ageDanya + ", то ему нужно ходить на работу.");
        }

        System.out.println("\nЗадание 5");
        int ageChild = 4;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе.");
        }
        else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то можно кататься на аттракционе в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то можно кататься без сопровождения взрослого.");
        }
        int ageChild2 = 12;
        if (ageChild2 < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild2 + ", то ему нельзя кататься на аттракционе.");
        }
        else if (ageChild2 >= 5 && ageChild2 < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild2 + ", то можно кататься на аттракционе в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else if (ageChild2 >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild2 + ", то можно кататься без сопровождения взрослого.");
        }
        int ageChild3 = 16;
        if (ageChild3 < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild3 + ", то ему нельзя кататься на аттракционе.");
        }
        else if (ageChild3 >= 5 && ageChild3 < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild3 + ", то можно кататься на аттракционе в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else if (ageChild3 >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild3 + ", то можно кататься без сопровождения взрослого.");
        }

        System.out.println("\nЗадание 6");
        int totalPlace = 102;
        int seat = 60;

        int peopleInCarriage1 = 70;
        boolean seatNo1 = peopleInCarriage1 < 102 && peopleInCarriage1 <= 60;
        boolean seatPlace1 = peopleInCarriage1 < 102 && peopleInCarriage1 <= 60;
        boolean standingPlace1 =   peopleInCarriage1 < 102  && peopleInCarriage1 >= 60;
        if (seatNo1) {
            System.out.println("Если в вагоне " + peopleInCarriage1 + " человек, то в вагоне мест нет.");
        } else if (seatPlace1) {
            System.out.println("Если в вагоне " + peopleInCarriage1 + " человек, то в вагоне есть сидячие места.");
        } else if (standingPlace1) {
            System.out.println("Если в вагоне " + peopleInCarriage1 + " человек, то в вагоне есть стоячие места.");
        }

        int peopleInCarriage2 = 45;
        boolean seatNo2 = peopleInCarriage2 >= 102;
        boolean seatPlace2 = peopleInCarriage2 < 102 && peopleInCarriage2 <= 60;
        boolean standingPlace2 =   peopleInCarriage2 < 102  && peopleInCarriage2 >= 60;
        if (seatNo2) {
            System.out.println("Если в вагоне " + peopleInCarriage2 + " человек, то в вагоне мест нет.");
        } else if (seatPlace2) {
            System.out.println("Если в вагоне " + peopleInCarriage2 + " человек, то в вагоне есть сидячие места.");
        } else if (standingPlace2) {
            System.out.println("Если в вагоне " + peopleInCarriage2 + " человек, то в вагоне есть стоячие места.");
        }

        int peopleInCarriage3 = 102;
        boolean seatNo3 = peopleInCarriage3 >= 102;
        boolean seatPlace3 = peopleInCarriage3 < 102 && peopleInCarriage3 <= 60;
        boolean standingPlace3 =   peopleInCarriage3 < 102  && peopleInCarriage3 >= 60;
        if (seatNo3) {
            System.out.println("Если в вагоне " + peopleInCarriage3 + " человека, то в вагоне мест нет.");
        } else if (seatPlace3) {
            System.out.println("Если в вагоне " + peopleInCarriage3 + " человек, то в вагоне есть сидячие места.");
        } else if (standingPlace3) {
            System.out.println("Если в вагоне " + peopleInCarriage3 + " человек, то в вагоне есть стоячие места.");
        }

        System.out.println("\nЗадание 7");
        int one = 10;
        int two = 20;
        int three = 30;
        boolean ThreeIsGreater  = three > two && three > one;
        boolean TwoIsGreater  = two > three && two > one;
        boolean OneIsGreater  = one > three && one > two;
        if (ThreeIsGreater) {
            System.out.println(three);
        } else if (TwoIsGreater) {
            System.out.println(two);
        } else if (OneIsGreater) {
            System.out.println(one);
        }
    }


}