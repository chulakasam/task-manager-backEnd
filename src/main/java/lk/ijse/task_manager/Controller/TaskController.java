package lk.ijse.task_manager.Controller;

import lk.ijse.task_manager.Dto.TaskDto;
import lk.ijse.task_manager.Exception.DataPersistException;
import lk.ijse.task_manager.Services.TaskService;
import lk.ijse.task_manager.Util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createTask(@RequestBody TaskDto taskDto){

        String taskId = AppUtil.generateTaskId();
        try{
            taskDto.setId(taskId);
            taskService.saveTask(taskDto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch(DataPersistException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TaskDto> getAllTasks(){
        return taskService.getAllTask();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable("id") String id){
        try{
            taskService.deletingTask(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (DataPersistException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
