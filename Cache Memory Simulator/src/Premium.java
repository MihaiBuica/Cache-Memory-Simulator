/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mihai
 */
public class Premium extends Basic {

    /**
     *
     */
    protected int nrCereriP;

    /**
     *
     * @param nume
     * @param nrCereriB
     * @param nrCereriP
     */
    public Premium(String nume, int nrCereriB, int nrCereriP) {
        super(nume, nrCereriB);
        //super.nrCereriP = nrCereriP;
        this.nrCereriP = nrCereriP;
    }

    /**
     *
     * @param nume
     * @param nrCereriB
     */
    public Premium(String nume, int nrCereriB) {
        super(nume, nrCereriB);
    }

    /**
     *
     * @return
     */
    @Override
    public int getNrCereriP() {
        //return super.nrCereriP;
        return this.nrCereriP;
    }
    //public String tip(Premium o){
    //  if(o.getNrCereriP() > 0){
    //    o.setNrCereriP(o.getNrCereriP() - 1);
    //  return "Premium";   
    // }
    //return super.tip(o);
    //}

    /**
     *
     * @param nrCereriP
     */
    @Override
    public void setNrCereriP(int nrCereriP) {
        //super.nrCereriP = nrCereriP;
        this.nrCereriP = nrCereriP;
    }

}
