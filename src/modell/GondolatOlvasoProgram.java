package modell;

public class GondolatOlvasoProgram {

    static String[] pakli = new String[22];
    
    public static void main(String[] args) {
        feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();//1 tömb
            melyik(); //Scanner
            kever(); //középre
        }
        ezVolt(); //11., azaz középső lap
    }

    private static void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int db = 0;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                String lap = szin + "_" + ertek;
                if(db < 21){
                    pakli[++db] = lap;
                }
            }
        }
    }

    /**
     * tömb elemeit hármasával
     */
    private static void kirak() {
        
    }

    /**
     * Scanner 1-3 közötti szám
     */
    private static void melyik() {
        
    }

    /**
     * választott oszlop középre, a sorrendje ne változzon!
     */
    private static void kever() {
        
    }

    /**
     * visszaadjuk a középső lapot, ami 21 elemnél a [11]
     */
    private static void ezVolt() {
        
    }
}
