package lk.ijse.task_manager.Util;

import lk.ijse.task_manager.Dto.TaskDto;
import lk.ijse.task_manager.Entity.Impl.TaskEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mapping {
    @Autowired
    private ModelMapper modelMapper;

    public TaskEntity toTaskEntity(TaskDto taskDto) {
        return modelMapper.map(taskDto, TaskEntity.class);
    }
    public TaskDto toTaskDTO(TaskEntity taskEntity) {
        return modelMapper.map(taskEntity, TaskDto.class);
    }

    public List<TaskDto> toTaskDTOList(List<TaskEntity> all)  {return modelMapper.map(all,new TypeToken<List<TaskDto>>() {}.getType());
    }



}
