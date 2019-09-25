/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mihai
 */
public class LFUtype extends Premium {

    private int nrUtilizari = 0;

    /**
     *
     * @param name
     * @param nrb
     * @param nrp
     */
    public LFUtype(String name, int nrb, int nrp) {
        super(name, nrb, nrp);
    }

    /**
     *
     * @param nume
     * @param nrCereriB
     */
    public LFUtype(String nume, int nrCereriB) {
        super(nume, nrCereriB);
    }

    /**
     *
     * @return
     */
    public int getNrUtilizari() {
        return nrUtilizari;
    }

    /**
     *
     * @param nrUtilizari
     */
    public void setNrUtilizari(int nrUtilizari) {
        this.nrUtilizari = nrUtilizari;
    }

    /**
     *
     */
    public void inc() {
        this.nrUtilizari++;
    }

    /**
     *
     */
    public void reset() {
        this.nrUtilizari = 0;
    }

}
