package lk.ijse.task_manager.Services.Impl;


import lk.ijse.task_manager.CustomStatusCode.SelectedTaskErrorStatus;
import lk.ijse.task_manager.Dao.TaskDao;
import lk.ijse.task_manager.Dto.TaskDto;
import lk.ijse.task_manager.Dto.TaskStatus;
import lk.ijse.task_manager.Entity.Impl.TaskEntity;
import lk.ijse.task_manager.Exception.DataPersistException;
import lk.ijse.task_manager.Exception.TaskNotFoundException;
import lk.ijse.task_manager.Services.TaskService;
import lk.ijse.task_manager.Util.Mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskDao taskDao;
    @Autowired
    private Mapping mapping;
    @Override
    public void saveTask(TaskDto taskDto) {
        TaskEntity saveTaskEntity = taskDao.save(mapping.toTaskEntity(taskDto));
        if(saveTaskEntity==null){
            throw new DataPersistException("Task not saved...!");
        }
    }

    @Override
    public List<TaskDto> getAllTask() {
        return mapping.toTaskDTOList(taskDao.findAll());
    }

    @Override
    public void deletingTask(String id) {
        Optional<TaskEntity> specificTask = taskDao.findById(id);

        if(specificTask.isPresent()){
            taskDao.delete(specificTask.get());
        }else {
            throw new TaskNotFoundException("Task not found...!");
        }
    }

    @Override
    public TaskStatus getSelectTask(String id) {
        if (taskDao.existsById(id)){
            TaskEntity selectedTask = taskDao.getReferenceById(id);
            return mapping.toTaskDTO(selectedTask);
        }else {
            return new SelectedTaskErrorStatus(2,"Selected task not found");
        }

    }


}
