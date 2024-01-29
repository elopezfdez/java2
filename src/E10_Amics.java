import java.io.*;



class Amic {
    String nom;
    Fecha naix;
     
    /**
     * Constructor
     * @param nom  nombre 
     * @param naix fecha de nacimiento dd/mm/aaaa
     */
    Amic (String nom, Fecha naix) {
        this.nom=nom;
        this.naix=naix;
    }
     
    Amic (String nom, String naix) {
        this.nom=nom;
        this.naix=new Fecha(naix);
    }
 
    /**
     * Atributos en texto
     */
    public String toString() {
        return (nom+" "+naix);
    }
 
}
 
public class E10_Amics{
     
    public static void main(String[] args) throws IOException {
    	BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        Amic[] amics = {
                new Amic("Joan", "10/3/1994"), 
                new Amic("Isa", "29/11/1990"), 
                new Amic("Arnau", new Fecha("19/8/1999")),
                new Amic("Agamenón", new Fecha("4/2/1989")), 
                new Amic("Anacleto", new Fecha("31/3/1990")), 
                new Amic("Carpanta", new Fecha("11/3/1988")),
                new Amic("Otilio", new Fecha("5/8/1995")), 
                new Amic("Mortadelo", new Fecha("29/2/1992")), 
                new Amic("Timoteo", new Fecha("23/7/1994"))
        };
 
        String[] meses = {"Gener","Febrer","Març","Abril","Maig","Juny","Juliol","Agost","Setembre","Octubre","Novembre","Desembre"};
 
        for(int m=0; m<meses.length; m++){
            System.out.println();
            System.out.println(meses[m]);
            System.out.println("----------------------");
 
            for(int a=0; a<amics.length; a++){
                if (amics[a].naix.mes==m+1) {
                    System.out.println(amics[a]);
                }
            }
        }
 
        String nom=llegirNom();
         
        boolean encontrado=false;
        for (int i=0; i<amics.length; i++) {
            if (amics[i].nom.equalsIgnoreCase(nom)) {
                System.out.println(amics[i].naix);
                encontrado=true;
            }
        }
 
        if (!encontrado) System.out.println("No existe.");
        

    }
     
    static String llegirNom() throws IOException {
 
        BufferedReader entrada = new BufferedReader(
            new InputStreamReader(System.in));
         
        String n;
        do {
            System.out.println("Entra un nom:");
            n=entrada.readLine();
        } while (n.length()==0);
         
        return n;
    }
     
}