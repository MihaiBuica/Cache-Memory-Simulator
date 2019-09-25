/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Mihai
 */
public class MemoryLRU {

    private ArrayList<Subscriptie> pMemory;
    private LRUCache cache;

    /**
     *
     */
    public MemoryLRU() {
        pMemory = new ArrayList();
    }

    /**
     *
     * @param nrmax
     */
    public void setCache(int nrmax) {
        cache = new LRUCache(nrmax);
    }

    /**
     *
     * @param name
     * @param nrb
     * @param nrp
     */
    public void ADD(String name, int nrb, int nrp) {
        Premium o = new Premium(name, nrb, nrp);
        for (Subscriptie i : this.pMemory) {
            if (i.getName().equals(o.getName())) {
                this.pMemory.remove(i);
                if (this.cache != null && this.cache.Exista(o)) {
                    this.cache.remove(o);
                }
                break;
            }
        }
        this.pMemory.add(o);
    }

    /**
     *
     * @param name
     * @param nrb
     */
    public void ADD(String name, int nrb) {
        Basic o = new Basic(name, nrb);
        for (Subscriptie i : this.pMemory) {
            if (i.getName().equals(o.getName())) {
                this.pMemory.remove(i);
                if (this.cache != null && this.cache.Exista(o)) {
                    this.cache.remove(o);
                }
                break;
            }
        }
        this.pMemory.add(o);

    }

    /**
     *
     * @param name
     * @return
     */
    public String GET(String name) {
        String afis = "";
        for (Subscriptie i : this.pMemory) {
            if (i.getName().equals(name)) {
                if (this.cache != null && this.cache.Exista(i)) {
                    afis += "0";
                    this.cache.Actualizare(i);
                } else {
                    afis += "1";
                    this.cache.add(i);
                }
                if (i.getNrCereriP() > 0) {
                    i.setNrCereriP(i.getNrCereriP() - 1);
                    return afis + " Premium\n";
                } else if (i.getNrCereriB() > 0) {
                    i.setNrCereriB(i.getNrCereriB() - 1);
                    return afis + " Basic\n";
                } else {
                    return afis + " Free\n";
                }
            }
        }
        return "2\n";
    }

}
