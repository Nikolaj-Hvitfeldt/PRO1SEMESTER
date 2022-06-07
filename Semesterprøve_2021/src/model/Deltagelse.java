package model;

public class Deltagelse {

    private boolean registreret;
    private DeltagerStatus status;

    // Association 1 <--> model.Lektion
    Lektion lektion;

    // Association 1 <--> model.Studerende
    Studerende studerende;

    public Deltagelse(Studerende studerende) {
        this.registreret = false;
        this.status = DeltagerStatus.TILSTEDE;
        this.studerende = studerende;
        studerende.addDeltagelse(this);
    }

    public boolean isRegistreret() {
        return registreret;
    }

    public DeltagerStatus getStatus() {
        return status;
    }

    public Lektion getLektion() {
        return lektion;
    }

    public Studerende getStuderende() {
        return studerende;
    }

    public void setRegistreret(boolean registreret) {
        this.registreret = registreret;
    }

    public void setStatus(DeltagerStatus status) {
        this.status = status;
    }

    public boolean erRegistreretFraværende(){
        boolean tilstede = false;
        if(registreret && status != DeltagerStatus.TILSTEDE){
            tilstede = true;
        }
        return tilstede;
    }
}




