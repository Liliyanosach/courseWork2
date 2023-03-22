package courseWork2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskService {

    private Map<Integer, Task> taskMap = new HashMap<>();
    private List<Task> removedTask = new ArrayList<>();

    public Map<Integer, Task> getTaskMap() {
        return taskMap;
    }

    public void setTaskMap(Map<Integer, Task> taskMap) {
        this.taskMap = taskMap;
    }

    public List<Task> getRemovedTask() {
        return removedTask;
    }

    public void setRemovedTask(List<Task> removedTask) {
        this.removedTask = removedTask;
    }

    /*
     * Метод для добавления задач
     */
    public void addTask(Task task) {
        taskMap.put(task.getId(), task);
    }

    /*
     * Метод для удаления задачи по id
     */
    public Task removeTask(int id) {
        for (Map.Entry<Integer, Task> task : getTaskMap().entrySet()) {
            if (task.getKey() == id) {
                return taskMap.remove(id);
            }
        }
        throw new TaskNotFoundException("Такой задачи нет");
    }

    /*
     * Получить задачи на день
     */
    public List<Task> getAllByDate(LocalDateTime localDate) {
        List<Task> taskList= null;
        taskList = this.taskMap.values().stream().filter(x -> x.appearsIn(localDate)).collect(Collectors.toList());
        return taskList;
    }

    /*
     * Метод для вывода списка всех задач
     */
    public void printAllTasks(Map<Integer, Task> taskMap) {
        if (taskMap.isEmpty()) {
            throw new TaskNotFoundException("Задач не найдено!");
        }
        taskMap.forEach((key, value) -> System.out.println(key + ". " + value));
    }
}
