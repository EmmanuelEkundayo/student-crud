package models;
public class Applicant extends Person {
    public int getEntranceExamScore() {
        return entranceExamScore;
    }
    private int entranceExamScore;

    public Applicant(String name, int age) {
        super(name, age);
    }

    public void setEntranceExamScore(int entranceExamScore) {
        this.entranceExamScore = entranceExamScore;
    }

}