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
        
    }




    public String dettaglio() {
        String info;
        int i;
        info = "Dettagli della SIM \nNumero: ";
        info += numtelefono;
        info += " Proprietario: ";
        info += cognomeProprietario + " " + nomeProprietario;
        info += " Credito: ";
        info += credito + "€";
        info += "\nElenco telefonate: \n";
        i=0;
        while(listaTelefonate[i]!=null){
            info += telefonate[i].getNumero()+" durata -> ";
            info += telefonate[i].getDurata()+"\n";
            i++;
        }
        return info;
    }

}
