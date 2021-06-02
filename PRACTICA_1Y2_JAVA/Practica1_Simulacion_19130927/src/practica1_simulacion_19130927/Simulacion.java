
package practica1_simulacion_19130927;


public class Simulacion {

private int CantPedido;
private int Mes;
private int InvInic;
private double NumAlea1;
private int DemSim;
private int DemAjus;
private int InvFin;
private int Faltante;
private boolean Orden;
private double NumAlea2;
private int Tiempo;
private double InvProm;
private int Q, R;

public Simulacion (int CantPedido, int Mes, int InvInic, double NumAlea1, int DemSim, int DemAjus, 
                   int InvFin, int Faltante, boolean orden, double NumAlea2, int Tiempo, double InvProm, int Q, int R)
{
    this.CantPedido = CantPedido;
    this.Mes = Mes;
    this.InvInic = InvInic;
    this.NumAlea1 = NumAlea1;
    this.DemSim = DemSim;
    this.DemAjus = DemAjus;
    this.InvFin = InvFin;
    this.Faltante = Faltante;
    this.Orden = orden;
    this.NumAlea2 = NumAlea2;
    this.Tiempo = Tiempo;
    this.InvProm = InvProm;
    this.Q = Q;
    this.R = R;
}
    
public int getCantPedido()
{
    return this.CantPedido;
}

public void setCantPedido(int CantPedido)
{
    this.CantPedido = CantPedido;
}

public int getMes()
{
    return this.Mes;
}

public void setMes(int Mes)
{
    this.Mes = Mes;
}

public int getInvInic()
{
    return this.InvInic;
}

public void setInvInic(int InvInic)
{
    this.InvInic = InvInic;
}

public double getNumAlea1()
{
    return this.NumAlea1;
}

public void setNumAlea1(double NumAlea1)
{
    this.NumAlea1 = NumAlea1;
}

public int getDemSim()
{
    return this.DemSim;
}

public void setDemSim(int DemSim)
{
    this.DemSim = DemSim;
}

public int getDemAjus()
{
    return this.DemAjus;
}

public void setDemAjus(int DemAjus)
{
    this.DemAjus = DemAjus;
}

public int getInvFin()
{
    return this.InvFin;
}

public void setInvFin(int InvFin)
{
    this.InvFin = InvFin;
}

public int getFaltante()
{
    return this.Faltante;
}

public void setFaltante(int Faltante)
{
    this.Faltante = Faltante;
}

public boolean getOrden()
{
    return this.Orden;
}

public void setOrden(boolean Orden)
{
    this.Orden = Orden;
}

public double getNumAlea2()
{
    return this.NumAlea2;
}

public void setNumAlea2(double NumAlea2)
{
    this.NumAlea2 = NumAlea2;
}

public int getTiempo()
{
    return this.Tiempo;
}

public void setTiempo(int Tiempo)
{
    this.Tiempo = Tiempo;
}

public double getInvProm()
{
    return this.InvProm;
}

public void setInvProm(double InvProm)
{
    this.InvProm = InvProm;
}

public int getQ()
{
    return this.Q;
}

public void setQ(int Q)
{
    this.Q = Q;
}

public int getR()
{
    return this.R;
}

public void setR(int R)
{
    this.R = R;
}



}
