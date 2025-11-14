package com.tomasgz.tasks_api.repository;

import com.tomasgz.tasks_api.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

