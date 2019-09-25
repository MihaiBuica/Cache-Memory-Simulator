/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mihai
 */
public class Basic extends Free {

    /**
     *
     */
    protected int nrCereriB;

    /**
     *
     * @param nume
     * @param nrCereriB
     */
    public Basic(String nume, int nrCereriB) {
        super(nume);
        //super.nrCereriB = nrCereriB;
        //super.nrCereriP = 0;
        this.nrCereriB = nrCereriB;
    }

    /**
     *
     * @return
     */
    @Override
    public int getNrCereriB() {
        //  return super.nrCereriB;
        return this.nrCereriB;
    }

    /**
     *
     * @param o
     * @return
     */
    public String tip(Basic o) {
        if (o.getNrCereriP() > 0) {
            o.setNrCereriB(o.getNrCereriB() - 1);
            return "Premium";
        }
        return super.tip(o);
    }
    //@Override

    /**
     *
     * @param nrCereriB
     */
    public void setNrCereriB(int nrCereriB) {
        //super.nrCereriB = nrCereriB;
        this.nrCereriB = nrCereriB;
    }

}
