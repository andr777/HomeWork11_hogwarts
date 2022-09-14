public class Ravenclaws  extends Hogwarts {
    private int mind;     //ум
    private int wisdom;     //мудррсть
    private int  wit;     //остроумность
    private int creation;    //творчество

    public Ravenclaws(String faculty, String name, int magicPower, int transgressionDistance,
                      int mind, int wisdom, int wit, int creation) {
        super(faculty, name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
    //*******************

    @Override
    public String toString() {
        return  "faculty='" + super.getFaculty() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", magicPower=" + super.getMagicPower() +
                ", transgressionDistance=" + super.getTransgressionDistance() +
                ", mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '.';
    }
}
