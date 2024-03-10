package Exception_IO_05_03_24.calc.HW_Part2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        try {
            findUserById(-1);
        } catch (UserNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void findUserById(int userId) throws UserNotFoundException {
        if (userId < 0) {
            throw new UserNotFoundException("\nИспользуйте значения >=0");
        }
    }
}
