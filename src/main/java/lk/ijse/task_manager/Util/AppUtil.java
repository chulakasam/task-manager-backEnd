package lk.ijse.task_manager.Util;

import java.util.UUID;

public class AppUtil {
    public static String  generateTaskId(){
        return "Task"+ UUID.randomUUID();
    }
}
