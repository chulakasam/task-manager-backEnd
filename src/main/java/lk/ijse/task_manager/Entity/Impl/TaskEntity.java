package lk.ijse.task_manager.Entity.Impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lk.ijse.task_manager.Entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="task")
@Entity
public class TaskEntity implements SuperEntity {
    @Id
    private String id;
    private String title;
    private String description;
    private String status;
    private LocalDateTime createdAt;
}
