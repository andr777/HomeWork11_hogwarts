public class Slytherin  extends Hogwarts {
    private int cunning  ;        //хитрость
    private int csusceptibility ;     //восприимчивость
    private int cinaccessibility;       //неприступность
    private int cresourcefulness; //находчивость
    private int clustForPower;   // жажда власти.


    public Slytherin(String faculty, String name, int magicPower, int transgressionDistance, int cunning, int csusceptibility, int cinaccessibility, int cresourcefulness, int clustForPower) {
        super(faculty, name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.csusceptibility = csusceptibility;
        this.cinaccessibility = cinaccessibility;
        this.cresourcefulness = cresourcefulness;
        this.clustForPower = clustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getCsusceptibility() {
        return csusceptibility;
    }

    public void setCsusceptibility(int csusceptibility) {
        this.csusceptibility = csusceptibility;
    }

    public int getCinaccessibility() {
        return cinaccessibility;
    }

    public void setCinaccessibility(int cinaccessibility) {
        this.cinaccessibility = cinaccessibility;
    }

    public int getCresourcefulness() {
        return cresourcefulness;
    }

    public void setCresourcefulness(int cresourcefulness) {
        this.cresourcefulness = cresourcefulness;
    }

    public int getClustForPower() {
        return clustForPower;
    }

    public void setClustForPower(int clustForPower) {
        this.clustForPower = clustForPower;
    }
    //  *******


    @Override
    public String toString() {
        return  "faculty='" + super.getFaculty() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", magicPower=" + super.getMagicPower() +
                ", transgressionDistance=" + super.getTransgressionDistance() +
                ", cunning=" + cunning +
                ", csusceptibility=" + csusceptibility +
                ", cinaccessibility=" + cinaccessibility +
                ", cresourcefulness=" + cresourcefulness +
                ", clustForPower=" + clustForPower +
                '.';
    }
}
