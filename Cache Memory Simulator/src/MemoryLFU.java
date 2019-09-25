/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author Mihai
 */
public class MemoryLFU {

    private ArrayList<LFUtype> pMemory;
    private LFUCache cache;

    /**
     *
     */
    public MemoryLFU() {
        pMemory = new ArrayList();
    }

    /**
     *
     * @param nrmax
     */
    public void setCache(int nrmax) {
        cache = new LFUCache(nrmax);
    }

    /**
     *
     * @param name
     * @param nrb
     * @param nrp
     */
    public void ADD(String name, int nrb, int nrp) {
        LFUtype o = new LFUtype(name, nrb, nrp);
        for (LFUtype i : this.pMemory) {
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
        LFUtype o = new LFUtype(name, nrb);
        for (LFUtype i : this.pMemory) {
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
        for (LFUtype i : this.pMemory) {
            if (i.getName().equals(name)) {
                if (this.cache != null && this.cache.Exista(i)) {
                    i.inc();
                    afis = afis + "0";
                } else {
                    afis = afis + "1";
                    this.cache.add(i);
                }
                if (i.getNrCereriP() > 0) {
                    afis = afis + " Premium\n";
                    i.setNrCereriP(i.getNrCereriP() - 1);
                    return afis;
                } else if (i.getNrCereriB() > 0) {
                    afis = afis + " Basic\n";
                    i.setNrCereriB(i.getNrCereriB() - 1);
                    return afis;
                } else {
                    afis = afis + " Free\n";
                    return afis;
                }
            }
        }
        return "2\n";
    }

}
