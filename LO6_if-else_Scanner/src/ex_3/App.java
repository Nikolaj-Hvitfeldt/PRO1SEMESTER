package ex_3;

public class App {

    public static void main(String[] args) {

        Copier copier = new Copier(0,false);

        copier.insertPaper(499);

        copier.makePaperJam();
        copier.makeCopy();
        System.out.println(copier.getPaperCount());

        copier.fixJam();
        copier.makeCopy();
        System.out.println(copier.getPaperCount());
    }
}
