/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app_colacircular_visual;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Ahedeijack
 */

public class ColaSimpleT <T>{
    Object[] vec;
	int p, u; //tam;

	
	public ColaSimpleT(int n)
	{
		p = u = -1;
		vec = new Object[n];
	}

	public boolean esta_llena ()
	{
		if (u >= vec.length - 1)
		{
                    return true;
		}
		return false;
	}

	public boolean esta_vacia()
	{
		if (p == -1)
		{
                    return true;
		}
		return false;
	}

	public boolean agregar(T dato)
	{
		if (!esta_llena())
		{
                    vec[++u] = dato;
                    if (u == 0)
                    {
                        p = 0;
                    }
                    return true;
		}
		return false;
	}

	public T extraer()
	{
            if (!esta_vacia())
            {
                T dato = (T)vec[p];
                vec[p]=null;
                if (p == u)
                {
                    p = -1;
                    u = p;
                }
                else
                    p++;
                return dato;
            }
            return null;
	}
        
        public void mostrar(JTable tabla)
        {
        Component args = null;
            JOptionPane.showMessageDialog(args, "Archivos en cola...");
            for(int i = 0; i<vec.length && !esta_vacia(); i++)
                    tabla.setValueAt(vec[i], 0, i);
	}
    }

