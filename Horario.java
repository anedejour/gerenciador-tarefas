/*Horario.java
*Classe que representaum horário com hora, minuto e segundo. */

public class Horario {
    private int segundos;

    public void setHora(int hora) {
        int h = (hora >= 0 && hora <= 23 ? hora : 0);

        this.segundos += (h - getHora()) * 3600;
    }

    public int getHora() {
        return segundos / 3600;
    }

    public void setMinuto(int minuto) {
        int m = (minuto >= 0 && minuto <= 59 ? minuto : 0);

        this.segundos += (m - getMinuto()) * 60;

    }

    public int getMinuto() {
        return (segundos % 3600) / 60;
    }

    public void setSegundo(int segundo) {
        int s = (segundo >= 0 && segundo <= 59 ? segundo : 0);

        this.segundos += (s - getSegundo());
    }

    public int getSegundo() {
        return (segundos % 3600) % 60;
    }

    public void setHorario(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public String toString(){
        return String.format ("%02d:%02d:%02d",
        getHora(),
        getMinuto(),
        getSegundo());
    }
}