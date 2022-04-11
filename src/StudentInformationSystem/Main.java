package StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Osman","5555", "HIST");
        Teacher t2 = new Teacher("Ahmet", "5556", "ENG");
        Teacher t3 = new Teacher("Ayla", "5544", "MATH");

        Course history = new Course("History", "101", "HIST");
        Course english = new Course("English Literature", "102", "ENG");
        Course math = new Course("Mathematics", "103","MATH");

        history.addTeacher(t1);
        english.addTeacher(t2);
        math.addTeacher(t3);

        Student s1 = new Student("Mehmet","123", "4", history, english, math);
        s1.addBulkExamNote(60,60,60);
        s1.addBulkVerbalNote(40,40,40);
        s1.isPass();

        Student s2 = new Student("Aslı","124","3",history,english,math);
        s2.addBulkExamNote(80,80,90);
        s2.addBulkVerbalNote(75,90,85);
        s2.isPass();
    }
}
