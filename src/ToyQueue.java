import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ToyQueue {

    public static void main(String[] args) {
        Toy[] toys = new Toy[10];
        toys[0] = new Toy(1, "Конструктор");
        toys[1] = new Toy(2, "Конструктор");
        toys[2] = new Toy(3, "Робот");
        toys[3] = new Toy(4, "Робот");
        toys[4] = new Toy(5, "Кукла");
        toys[5] = new Toy(6, "Кукла");
        toys[6] = new Toy(7, "Кукла");
        toys[7] = new Toy(8, "Кукла");
        toys[8] = new Toy(9, "Кукла");
        toys[9] = new Toy(10, "Кукла");

        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                int randomValue = random.nextInt(100); // случайное число от 0 до 99
                Toy selectedToy = selectToyBasedOnWeight(randomValue, toys);
                fileWriter.write("Get " + (i + 1) + ": " + selectedToy.name + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Toy selectToyBasedOnWeight(int randomValue, Toy[] toys) {
        if (randomValue < 20) {
            return toys[0];
        } else if (randomValue < 40) {
            return toys[1];
        } else {
            return toys[2];
        }
    }
}
