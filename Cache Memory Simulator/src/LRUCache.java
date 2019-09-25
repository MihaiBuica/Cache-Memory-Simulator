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
public class LRUCache extends CacheUtils implements Cache {

    private ArrayList<Subscriptie> lruCache; //CAHCE-UL SUB FORMA DE ARRAY
    private int nrMax;

    /**
     *
     * @param nrMax
     */
    public LRUCache(int nrMax) {
        this.nrMax = nrMax;
        this.lruCache = new ArrayList(this.nrMax);
    }

    /**
     *
     * @param o
     * @return
     */
    public Boolean Exista(Subscriptie o) {
        return super.Exista(o, lruCache);
    }

    /**
     *
     * @param o
     */
    public void Actualizare(Subscriptie o) {
        if (this.Exista(o)) {
            this.lruCache.remove(o);
            this.lruCache.add(0, o);
        }
    }

    /*DUPA O OPERATIUNE, CACHE-UL ESTE ACTUALIZAT:POZITIA 0 CEL MAI RECENT
    POZITIA SIZE() CEL MAI DE MULT FOLOSIT*/
    /**
     *
     * @param o
     */
    @Override
    public void add(Subscriptie o) {
        this.Actualizare(o);
        super.add(o, lruCache, nrMax);
    }

    /**
     *
     */
    @Override
    public void remove() {
        super.remove(this.lruCache);
    }

    /**
     *
     * @param o
     */
    public void remove(Subscriptie o) {
        super.remove(o, lruCache);
    }

}
