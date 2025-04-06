package lk.ijse.task_manager.CustomStatusCode;

import lk.ijse.task_manager.Dto.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedTaskErrorStatus  implements TaskStatus {
    private int statusCode;
    private String statusMessage;
}
