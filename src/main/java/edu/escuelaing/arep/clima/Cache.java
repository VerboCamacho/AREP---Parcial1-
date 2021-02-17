package edu.escuelaing.arep.clima;

import java.util.ArrayList;
/**
 * Hello world!!
 * Author Verbo Camacho
 */
public class Cache {
    private ArrayList<String> Ciudades=new ArrayList<String>();
    public Cache(){

    }
    public void cache(String ciudad){

        Ciudades.add(ciudad);
    }
    public ArrayList<String> getCache(){
        return Ciudades;
    }
}
