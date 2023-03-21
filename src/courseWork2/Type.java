package courseWork2;

public enum Type {
    WORK("Рабочая"),
    Personal("Личная");

    private final String taskType;

    Type(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskType() {
        return taskType;
    }

}
