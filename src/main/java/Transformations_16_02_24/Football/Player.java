package Transformations_16_02_24.Football;

public class Player {
    private int stamina;
    private static int maxStamina = 100;
    private static int minStamina = 0;
    public static int countPlayers = 0;

    public Player() {
        if (countPlayers < 6) {
            this.stamina = 90 + (int) (Math.random() * 10);
            countPlayers++;
        } else {
            System.out.println("Достаточно игроков, этот не играет");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        stamina -= 1;
        if (stamina == minStamina) {
            goToRest();
        }
    }

    private void goToRest() {
        countPlayers -= 1;
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.printf("Команды неполные. На поле еще есть %d свободных мест", (6 - countPlayers));
        } else {
            System.out.println("На поле нет свободных мест");
        }

    }
}
