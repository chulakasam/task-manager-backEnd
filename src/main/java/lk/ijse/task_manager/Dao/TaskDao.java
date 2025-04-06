package lk.ijse.task_manager.Dao;


import lk.ijse.task_manager.Entity.Impl.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDao extends JpaRepository<TaskEntity, Long> {
}
