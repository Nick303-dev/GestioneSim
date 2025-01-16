import java.time.LocalTime;

public class Chiamata {
    private String  numero;
    private LocalTime durata;

    public Chiamata(String numero, LocalTime durata) {
        this.numero = numero;
        this.durata = durata;
    }

    public String getNumero() {
        return numero;
    }

    public LocalTime getDurata() {
        return durata;
    }
}
