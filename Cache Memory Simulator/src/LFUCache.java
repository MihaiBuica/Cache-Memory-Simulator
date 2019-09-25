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
public class LFUCache implements Cache {

    private ArrayList<LFUtype> lfuCache;
    private int nrMax;

    /**
     *
     */
    public LFUCache() {
        this.lfuCache = new ArrayList();
    }

    /**
     *
     * @param nrMax
     */
    public LFUCache(int nrMax) {
        this.nrMax = nrMax;
        this.lfuCache = new ArrayList(nrMax);
    }

    /**
     *
     * @param o
     * @return
     */
    public boolean Exista(Subscriptie o) {
        for (LFUtype i : this.lfuCache) {
            if (i.getName().equals(o.getName())) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param o
     */
    public void add(LFUtype o) {
        if (this.lfuCache.size() < this.nrMax) {
            this.lfuCache.add(o);
        } else {
            this.remove();
            this.lfuCache.add(o);
        }
    }

    /**
     *
     */
    @Override
    public void remove() {
        int min = 32000; //max_int valoare prim element
        for (LFUtype i : this.lfuCache) {
            if (i.getNrUtilizari() < min) {
                min = i.getNrUtilizari();
            }
        }
        for (LFUtype i : this.lfuCache) {
            if (min == i.getNrUtilizari()) {
                this.lfuCache.remove(i);
                return;
            }
        }
    }

    /**
     *
     * @param o
     */
    public void remove(Subscriptie o) {
        for (LFUtype i : this.lfuCache) {
            if (i.getName().equals(o.getName())) {
                this.lfuCache.remove(i);
                return;
            }
        }
    }

    /**
     *
     */
    public void GetLFU() {
        System.out.print("[");
        for (LFUtype i : this.lfuCache) {
            System.out.print(i.name + " " + i.getNrCereriB() + " " + i.getNrCereriP() + "; ");
        }
        System.out.print("]");
        System.out.println();
    }

    /**
     *
     * @param o
     */
    @Override
    public void add(Subscriptie o) {
    }

}
