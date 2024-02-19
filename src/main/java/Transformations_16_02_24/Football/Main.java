package Transformations_16_02_24.Football;

public class Main {
    public static void main(String[] args) {
        Player leo = new Player();
        Player mike = new Player();
        Player alex = new Player();
        Player petr = new Player();
        Player niko = new Player();
        Player james = new Player();
        Player tom = new Player();
        Player nick = new Player();
        Player.info();
        while (mike.getStamina() > 0) {
            mike.run();
        }
        System.out.printf("На поле %d игроков", Player.countPlayers);


    }
}
