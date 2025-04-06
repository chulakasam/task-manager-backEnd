package lk.ijse.task_manager.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaskDto implements TaskStatus {
    private Long id;
    private String title;
    private String description;
    private String status;
    private LocalDateTime createdAt;
}
