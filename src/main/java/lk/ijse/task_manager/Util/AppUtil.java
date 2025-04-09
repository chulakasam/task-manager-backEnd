package lk.ijse.task_manager.Util;

import java.util.UUID;

public class AppUtil {
    private static int counter = 1;
    public static String  generateTaskId(){
        return String.format("Task %02d", counter++);
    }
}
