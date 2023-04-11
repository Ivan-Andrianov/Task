package org.example;

import java.util.LinkedList;
import java.util.List;

public class Train {

    //Список с вагонами
    private LinkedList<Van> listOfVan;


    public Train(Van ...listOfVan){
        this.listOfVan = new LinkedList<>(List.of(listOfVan));
    }

    public int size(){
        int result = 0;

        Van startVan = listOfVan.get(0);
        Van van = startVan;
        van.setLight(true);

        while (true){
            while (true){
                van = van.getNext();
                result+=1;
                if (van.isLight()){
                    van.setLight(false);
                    break;
                }
            }
            van = startVan;
            if (!van.isLight()) return result;

            result=0;

            while (true){
                van = van.getPrevious();
                result+=1;
                if (van.isLight()){
                    van.setLight(false);
                    break;
                }
            }
            van = startVan;
            if (!van.isLight()) return result;
            result=0;
        }
    }
}
