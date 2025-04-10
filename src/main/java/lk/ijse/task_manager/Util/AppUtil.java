package lk.ijse.task_manager.Util;

import java.io.*;

public class AppUtil {
    private static final String COUNTER_FILE = "task_counter.txt";
    private static int counter = loadCounter();

    private static int loadCounter() {
        try (BufferedReader reader = new BufferedReader(new FileReader(COUNTER_FILE))) {
            return Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            return 1;
        }
    }

    private static void saveCounter() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(COUNTER_FILE))) {
            writer.write(String.valueOf(counter));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String generateTaskId() {
        String id = String.format("Task %03d", counter++);
        saveCounter(); // Save after generating ID
        return id;
    }
}
