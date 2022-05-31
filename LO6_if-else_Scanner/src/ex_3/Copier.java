package ex_3;

public class Copier {

    private int paperCount;
    private boolean paperStuck;


    public Copier(int paperCount, boolean paperStuck) {
        this.paperCount = paperCount;
        this.paperStuck = paperStuck;

    }


    public int getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(int paperCount) {
        this.paperCount = paperCount;
    }

    public void insertPaper(int number) {
        paperCount += number;
        if (getPaperCount() > 500) {
            System.out.println("Error too much paper in printer: " + getPaperCount());
        } else {
            System.out.println("The amount of paper in the printer is: " + getPaperCount());
        }
    }

    public void makeCopy() {
        if ( paperStuck == true) {
            System.out.println("Homie stuck!!! cant make copy");
        } else {
            paperCount--;
        }
    }

    public void makePaperJam(){
        this.paperStuck = true;
    }

    public void fixJam(){
        this.paperStuck = false;
    }
}

