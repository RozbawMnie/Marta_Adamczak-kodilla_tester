public class Grades {
    private int[] grades;
    private int size;
    private double sum = 0;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int ReturnLastGrades() {
        if (this.size == 0) {
            return 0;
        }
        return this.grades[this.size - 1];
    }

    public int ReturnGradeAverage() {
        if (this.size == 0) {
            return 0;
        }
        for (i = 1; i <= grades.length; i++){
            sum += grades[i];
        }
        sum /= grades.length;
    }

}
