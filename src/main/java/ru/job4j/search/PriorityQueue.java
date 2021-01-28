package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        int priority = task.getPriority();
        for (Task element : tasks) {
            int elementPriority = element.getPriority();
            if (priority > elementPriority) {
                index++;
            } else {
                break;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}