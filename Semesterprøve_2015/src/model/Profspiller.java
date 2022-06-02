package model;

public class Profspiller extends Spiller {

    private double kampHonorar;

    public Profspiller(String navn, int årgang, double kampHonorar) {
        super(navn, årgang);
        this.kampHonorar = kampHonorar;
    }

    public double getKampHonorar() {
        return kampHonorar;
    }

    public double totalProfKampHonorar() {
        double totalKampHonorar = 0;
        double afbudteKampe = 0;
        for (Deltagelse e : super.getDeltagelser()) {
            if (e.isAfbud()) {
                afbudteKampe++;
            }
            totalKampHonorar = (getKampHonorar() / 100) * afbudteKampe;
        }
        return totalKampHonorar;
    }
}
