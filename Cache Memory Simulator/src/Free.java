/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mihai
 */
public class Free extends Subscriptie {

    /**
     *
     * @param name
     */
    public Free(String name) {
        super(name);
    }

    /**
     *
     * @param o
     * @return
     */
    public String tip(Free o) {
        return "Free";
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
