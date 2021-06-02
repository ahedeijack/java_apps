/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_18131396_proyecto_01;

/**
 *
 * @author hobbit
 */
class ModulosMod {
    public double ims;
    public int mt;
    public int fa;
    public int fe;
    public ModulosMod(){
        ims = 0;
        mt = 0;
        fa = 0;
        fe = 0;
    }
    
    public ModulosMod(double _ims,int _mt, int _fa, int _fe){
        ims = _ims;
        mt = _mt;
        fa = _fa;
        fe = _fe;
    }

    ModulosMod(ModulosMod sistema) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getIms(){
        return ims;
    }
    
    public void setIms(int ims){
        this.ims = ims;
    }

    public int getMt() {
        return mt;
    }

    public void setMt(int mt) {
        this.mt = mt;
    }

    public int getFa() {
        return fa;
    }

    public void setFa(int fa) {
        this.fa = fa;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }
    
    public int Metodo(){
    int fm = 0;
    fm = (int) ((ims * mt)+mt-fa-fe);
    return fm;
    }
    
    
    
}
