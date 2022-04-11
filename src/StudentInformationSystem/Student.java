package StudentInformationSystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuno;
    String classes;
    double average;
    boolean ispass;

    Student(String name, String stuno, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuno = stuno;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.ispass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if(note1>=0 && note1<=100) {
            this.c1.examNote = note1;
        }
        if(note2>=0 && note2<=100) {
            this.c2.examNote = note2;
        }
        if(note3>=0 && note3<=100) {
            this.c3.examNote = note3;
        }
    }

    void addBulkVerbalNote(int note1, int note2, int note3) {
        if(note1>=0 && note1<=100) {
            this.c1.verbalNote = note1;
        }
        if(note2>=0 && note2<=100) {
            this.c2.verbalNote = note2;
        }
        if(note3>=0 && note3<=100) {
            this.c3.verbalNote = note3;
        }
    }

    void isPass(){
        this.average = (((this.c1.examNote * 0.8)+(this.c1.verbalNote*0.2)) + ((this.c2.examNote * 0.8)+(this.c2.verbalNote*0.2)) + ((this.c3.examNote * 0.8)+(this.c3.verbalNote*0.2))) / 3.0;
        if (this.average>60) {
            System.out.println(this.name + " pass!");
            this.ispass = true;
        }
        else {
            System.out.println(this.name + " cannot pass!");
            this.ispass = false;
        }
    }

    void printNote(){
        System.out.println(this.c1.name + "exam note : " + this.c1.examNote + ", verbal note : " + this.c1.verbalNote);
        System.out.println(this.c1.name + "exam note : " + this.c2.examNote + ", verbal note : " + this.c2.verbalNote);
        System.out.println(this.c1.name + "exam note : " + this.c3.examNote + ", verbal note : " + this.c3.verbalNote);
        System.out.println("Average is : " + this.average);
    }
}

