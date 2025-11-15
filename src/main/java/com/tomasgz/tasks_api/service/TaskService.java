package com.tomasgz.tasks_api.service;

import com.tomasgz.tasks_api.entity.Task;
import com.tomasgz.tasks_api.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public List<Task> getAll() {
        return repo.findAll();
    }

    public Task getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Task create(Task task) {
        return repo.save(task);
    }

    public Task update(Long id, Task data) {
        Task existing = repo.findById(id).orElse(null);
        if (existing == null) return null;

        existing.setTitle(data.getTitle());
        existing.setDescription(data.getDescription());
        existing.setCompleted(data.isCompleted());

        return repo.save(existing);
    }

    public boolean delete(Long id) {
        if (!repo.existsById(id)) return false;

        repo.deleteById(id);
        return true;
    }
}
