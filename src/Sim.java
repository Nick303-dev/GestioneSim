import java.time.LocalTime;
import java.util.Arrays;

public class Sim {
    private  String numtelefono;
    private float credito;
    private Chiamata[] telefonate;
    private String NomeProprietario;
    private String CognomeProprietario;

    public Sim(String Nome,String Cognome,String numero,float credito) {
        CognomeProprietario = Cognome;
        NomeProprietario = Nome;
        numtelefono = numero;
        credito=credito;
    }

    private boolean addTelefonate(Chiamata Cin){
      for(int i=0;i< telefonate.length;i++){
          if(telefonate[i]== null){
              telefonate[i]=Cin;
              return true;
          }
      };
      return false;
    }

    public LocalTime DurataChiamate(){
        LocalTime t = LocalTime.of(0, 0);
        int i;
        i=0;
        while(telefonate[i]!=null && i<100){
            t = t.plusSeconds(telefonate[i].getDurata().getSecond());
            t = t.plusMinutes(telefonate[i].getDurata().getMinute());
            t = t.plusHours(telefonate[i].getDurata().getHour());
            i++;
        }
        return t;
    }

    public LocalTime DurataChiamateCon(String numero){
        LocalTime t = LocalTime.of(0, 0);
        int i;
        i=0;
        while(telefonate[i]!=null && i<100){
            if(telefonate[i].getNumero()==numero){
                t = t.plusSeconds(telefonate[i].getDurata().getSecond());
                t = t.plusMinutes(telefonate[i].getDurata().getMinute());
                t = t.plusHours(telefonate[i].getDurata().getHour());
            }
            i++;
        }
        return t;
    }

    public String dettaglio() {
        String info;
        int i;
        info = "Dettagli della SIM \nNumero: ";
        info += numtelefono;
        info += " Proprietario: ";
        info += CognomeProprietario+ " " + NomeProprietario;
        info += " Credito: ";
        info += credito + "€";
        info += "\nElenco telefonate: \n";
        i=0;
        while(telefonate[i]!=null){
            info += telefonate[i].getNumero()+" durata -> ";
            info += telefonate[i].getDurata()+"\n";
            i++;
        }
        return info;
    }

}
