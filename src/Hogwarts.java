public class Hogwarts {

    private String faculty;
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String faculty, String name, int magicPower, int transgressionDistance) {
        this.faculty = faculty;
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower < 0) {
            this.magicPower = 0;
        } else if (magicPower > 100) {
            this.magicPower = 100;
        } else {
            this.magicPower = magicPower;
        }
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        if (transgressionDistance < 0) {
            this.transgressionDistance = 0;
        } else if (transgressionDistance > 100) {
            this.transgressionDistance = 100;
        } else {
            this.transgressionDistance = transgressionDistance;
        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "faculty='" + faculty + '\'' +
                ", name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
