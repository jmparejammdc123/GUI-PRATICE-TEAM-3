 public class Student {
    private String name;
    private int milestone1;
    private int milestone2;
    private int terminalAssessment;

    public Student(String name, int m1, int m2, int ta) {
        this.name = name;
        this.milestone1 = m1;
        this.milestone2 = m2;
        this.terminalAssessment = ta;
    }

    public int getTotal() {
        return milestone1 + milestone2 + terminalAssessment;
    }

    public String getGrade() {
        int total = getTotal();
        if (total >= 90) return "A";
        else if (total >= 80) return "B";
        else if (total >= 70) return "C";
        else if (total >= 60) return "D";
        else return "F";
    }

    public String getName() {
        return name;
    }

    public int getMilestone1() {
        return milestone1;
    }

    public int getMilestone2() {
        return milestone2;
    }

    public int getTerminalAssessment() {
        return terminalAssessment;
    }
}