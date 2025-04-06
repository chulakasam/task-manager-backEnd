package lk.ijse.task_manager.Services.Impl;


import lk.ijse.task_manager.Dao.TaskDao;
import lk.ijse.task_manager.Dto.TaskDto;
import lk.ijse.task_manager.Entity.Impl.TaskEntity;
import lk.ijse.task_manager.Exception.DataPersistException;
import lk.ijse.task_manager.Services.TaskService;
import lk.ijse.task_manager.Util.Mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
}
