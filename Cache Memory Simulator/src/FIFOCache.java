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
public class FIFOCache extends CacheUtils implements Cache {

    private ArrayList<Subscriptie> fifoCache;
    private int nrMax;

    /**
     *
     */
    public FIFOCache() {
        this.fifoCache = new ArrayList();
    }

    /**
     *
     * @param nrMax
     */
    public FIFOCache(int nrMax) {
        this.nrMax = nrMax;
        this.fifoCache = new ArrayList(nrMax);
    }

    /**
     *
     * @param o
     * @return
     */
    public boolean Exista(Subscriptie o) {
        return super.Exista(o, fifoCache);
    }

    /**
     *
     * @param o
     */
    @Override
    public void add(Subscriptie o) {
        super.add(o, fifoCache, nrMax);
    }

    /**
     *
     */
    @Override
    public void remove() {
        super.remove(this.fifoCache);
    }

    /**
     *
     * @param o
     */
    public void remove(Subscriptie o) {
        super.remove(o, fifoCache);
    }

}
