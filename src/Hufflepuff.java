public class Hufflepuff extends Hogwarts {
  private int diligence; //трудолюбие
  private int loyalty; //верность
  private int honesty; //честность

    public Hufflepuff(String faculty, String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty ) {
        super(faculty, name, magicPower, transgressionDistance);

        this.diligence=diligence;
        this.loyalty=loyalty;
        this.honesty=honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        if (diligence < 0) {
            this.diligence = 0;
        } else if (diligence > 100) {
            this.diligence = 100;
        } else {
            this.diligence = diligence;
        }
       }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty < 0) {
            this.loyalty = 0;
        } else if (loyalty > 100) {
            this.loyalty = 100;
        } else {
            this.loyalty = loyalty;
        }
       }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (honesty < 0) {
            this.honesty = 0;
        } else if (honesty > 100) {
            this.honesty = 100;
        } else {
            this.honesty = honesty;
        }
    }

    @Override
    public String toString() {
        return  "faculty='" + super.getFaculty() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", magicPower=" + super.getMagicPower() +
                ", transgressionDistance=" + super.getTransgressionDistance() +
                ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '.';
    }

    public void StudentsComparison(Object students2) {
        System.out.print( "MagicPower + TransgressionDistance(метод в Hufflepuff)): ");
        Hufflepuff std = (Hufflepuff) students2;
        if ((this.honesty + this.loyalty + this.diligence) > (std.getHonesty()+std.getLoyalty()+std.getDiligence())) {
            System.out.println(this.getName() + " круче чем " + std.getName());
        } else if ((this.honesty + this.loyalty + this.diligence) < (std.getHonesty()+std.getLoyalty()+std.getDiligence())) {
            System.out.println(std.getName() + " круче чем " + this.getName());
        } else {
            System.out.println(this.getName() + " равны " + std.getName());
        }
    }
}
