/**
 *
 * Erlaubt das Erstellen einer Währung in Form eines Objektes.
 * Diese Währung erhält durch ihren Konstruktor einen Kurs, Namen und ein
 * Kürzel.
 *
 * @author m.praeg
 *
 */
public class Waehrung {

    /**
     * Währungskurs.
     */
    private final int kurs;

    /**
     * Name der Währung.
     */
    private final String name;

    /**
     *  Abgekürzte Währungsform.
     */
    private final String kuerzel;

    /**
     * Global existenter Teiler für alle Währungen.
     */
    private static final long TEILER = 10000;

    /**
     * Erzeugt ein neues Objekt der Klasse Währung.
     *
     * @param name Name der Währung (z.B. EURO).
     * @param kuerzel Kürzel der Währung (z.B. €).
     * @param kurs Wechselkurs zum Dollar.
     */
    public Waehrung(String name, String kuerzel, double kurs) {
        this.kurs = (int) (kurs * TEILER);
        this.name = name;
        this.kuerzel = kuerzel;
    }

    /**
     * Wandelt Betrag einer Währung in den Betrag einer anderen Währung um
     * (z.B. € zu $).
     *
     * @param betrag Umzurechnender betrag
     * @param toWaehrung Zielwährung
     * @return Betrag in Zielwährung
     */
    public long umrechnen(long betrag, Waehrung toWaehrung) {
        return betrag * kurs / toWaehrung.kurs;
    }

    /**
     * @return Kurs der Währung
     */
    public int getKurs() {
        return kurs;
    }

    /**
     * @return Name der Waehrung
     */
    public String getName() {
        return name;
    }

    /**
     * @return Kuerzel der Waehrung
     */
    public String getKuerzel() {
        return kuerzel;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [%s] 1 %s = %.4f %s", name, kuerzel, "$",
                kurs / (double) TEILER, kuerzel);
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + kurs;
        result = prime * result + ((kuerzel == null) ? 0 : kuerzel.hashCode());
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Waehrung other = (Waehrung) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (kurs != other.kurs) {
            return false;
        }
        if (kuerzel == null) {
            if (other.kuerzel != null) {
                return false;
            }
        }
        else if (!kuerzel.equals(other.kuerzel)) {
            return false;
        }
        return true;
    }
}
