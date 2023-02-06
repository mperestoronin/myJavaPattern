public class Main {
    public static void main(String[] args) {
        DeadLineTracker tracker = new DeadLineTracker();
        studentGroup myGroup = new studentGroup();
        studentGroup bpi218 = new studentGroup();
        tracker.addObserver(myGroup); // добавили наблюдателей
        tracker.addObserver(bpi218);
        System.out.println("До изменения состояния Observable (deadlineTracker):");
        System.out.println(myGroup.getDeadLines());
        System.out.println(bpi218.getDeadLines());
        tracker.setDeadlines("Контест, КПО, Курсовая"); // добаляем дедлайны (изменяем состояние deadlineTracker)
        System.out.println("\n\nПосле изменения состояния Observable (deadlineTracker)");
        System.out.println(myGroup.getDeadLines());
        System.out.println(bpi218.getDeadLines());
        System.out.println("\n\nНу и пусть группа myGroup что-нибудь сделает");
        myGroup.completeDeadLine();
        System.out.println(myGroup.getDeadLines());
        System.out.println(bpi218.getDeadLines());
    }
}
