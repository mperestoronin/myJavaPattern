
public class studentGroup implements Student {
    private String deadLines = "Дедлайнов нет";

    @Override
    public void update(Object assignments) {
        this.setDeadLines((String) assignments);
    }

    public String getDeadLines() {
        return deadLines;
    }

    public void setDeadLines(String news) {
        this.deadLines = news;
    }

    public void completeDeadLine() {
        // тут метод что-то делает с дедлайнами, как- то их меняет. Для простоты примера,
        // пусть наши группы мега умные и моментально их выполняет.
        deadLines = "Все дедлайны выполнены, их больше нет";
    }
}
