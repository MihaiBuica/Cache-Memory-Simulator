
import java.util.ArrayList;

/**
 * Clasa contine metode utile pentru actualizarea diferitelor tipuri de memorii
 * Cache.
 *
 * @author Mihai
 */
public class CacheUtils {

    /**
     * Functia parcurge ArrayList-ul(Cache-ul) si verifica daca obiectul exista
     * in ArrayList(cautandu-l dupa nume).
     *
     * @param o : obiectul ce este cautat;
     * @param a : Memoria Cache in care se cauta;
     * @return true - exista, false - nu exista.
     */
    public Boolean Exista(Subscriptie o, ArrayList<Subscriptie> a) {
        for (Subscriptie i : a) {
            if (i.getName().equals(o.getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Functia adauga obiectul primit ca parametru in ArrayList(Cache). In caz
     * ca dimensiunea maxima a fost atinsa, este eliminat ultimul element din
     * Cache, iar apoi se realizeaza inserarea.
     *
     * @param o : obiectul de adaugat
     * @param a : Memoria Cache in care trebuie adaugat
     * @param nrMax : Dimensiunea maxima a memoriei Cache.
     */
    public void add(Subscriptie o, ArrayList<Subscriptie> a, int nrMax) {
        if (a.size() < nrMax) {
            a.add(0, o);
        } else {
            this.remove(a);
            a.add(0, o);
        }
    }

    /**
     * Functia elimina ultimul element din Cache.
     *
     * @param a : Memoria Cache din care se elimina.
     */
    public void remove(ArrayList<Subscriptie> a) {
        a.remove(a.size() - 1);
    }

    /**
     * Functia elimina obiectul o din Cache. Este cautat dupa nume si eliminat.
     *
     * @param o : obiectul ce trebuie eliminat
     * @param a : Memoria Cache.
     */
    public void remove(Subscriptie o, ArrayList<Subscriptie> a) {
        for (Subscriptie i : a) {
            if (i.getName().equals(o.getName())) {
                a.remove(i);
                return;
            }
        }
    }

}
