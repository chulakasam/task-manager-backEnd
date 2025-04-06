package lk.ijse.task_manager.Services;

import lk.ijse.task_manager.Dto.TaskDto;

import java.util.List;

public interface TaskService {
    void saveTask(TaskDto taskDto);

    List<TaskDto> getAllTask();

    void deletingTask(String id);
}
