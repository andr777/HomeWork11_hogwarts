public class Gryffindors extends Hogwarts {
    private int nobility; //благородство
    private int honour; //честь
    private int bravery; //храбрость

    public Gryffindors(String faculty, String name, int magicPower, int transgressionDistance,
                       int nobility, int honour, int bravery ) {
        super(faculty, name, magicPower, transgressionDistance);
        this.nobility=nobility;
        this.honour=honour;
        this.bravery=bravery;

    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (nobility < 0) {
            this.nobility = 0;
        } else if (nobility > 100) {
            this.nobility = 100;
        } else {
            this.nobility = nobility;
        }
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        if (honour < 0) {
            this.honour = 0;
        } else if (honour > 100) {
            this.honour = 100;
        } else {
            this.honour = honour;
        }
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (bravery < 0) {
            this.bravery = 0;
        } else if (bravery > 100) {
            this.bravery = 100;
        } else {
            this.bravery = bravery;
        }

    }

    @Override
    public String toString() {
        return
                "faculty='" + super.getFaculty() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", magicPower=" + super.getMagicPower() +
                ", transgressionDistance=" + super.getTransgressionDistance() +
                ", nobility=" + nobility +
                ", honour=" + honour +
                ", bravery=" + bravery +
                '.';

     }
}
