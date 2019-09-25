/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mihai
 */
public abstract class Subscriptie {

    /**
     *
     */
    protected String name;

    /**
     *
     */
    protected int nrCereriB;

    /**
     *
     */
    protected int nrCereriP;

    /**
     *
     */
    protected Subscriptie() {
    }

    /**
     *
     * @param name
     */
    protected Subscriptie(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public int getNrCereriB() {
        return 0;
    }

    /**
     *
     * @return
     */
    public int getNrCereriP() {
        return 0;
    }

    /**
     *
     * @param nrCereriB
     */
    public void setNrCereriB(int nrCereriB) {
        this.nrCereriB = 0;
    }

    /**
     *
     * @param nrCereriP
     */
    public void setNrCereriP(int nrCereriP) {
        this.nrCereriP = 0;
    }

}
