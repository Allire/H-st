/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stable;

/**
 *
 * @author HorseBOYYYY
 */
import java.util.*;
public class Database {
    public HashMap horses = new HashMap();
    public HashMap points = new HashMap();

    
    
    
    /** Metod för att lägga till hästar, inom paranteserna ligger hästen som ska läggas till */
    public void addHorse(Horse hrs){
        horses.put(hrs.getNumber(), hrs);
        //System.out.println(horses.get(hrs.getNumber()));
    }
    
    
    /** Metod som ska hitta en häst och retunerar den funna hästens nummer */
    public Horse findHorse(int findNo){
        return (Horse)horses.get(findNo);
    }
    public void removeHorse(int HorseNo){
        horses.remove(HorseNo);
    }
    public void addPoints(Horse hrs,int point){
        int prevScore = 0;
        if(points.get(hrs.getNumber()) != null){
            prevScore = (int)points.get(hrs.getNumber()) + point;
        }
        points.put(hrs.getNumber(), prevScore);
    }
    public int getPoints(Horse hrs){
        return (int)points.get(hrs.getNumber());
    }
}


/*public class Database {
    public HashMap horses = new HashMap();
    
    
    public void addHorse(Horse hrs){
        horses.put(hrs.getNumber(), hrs);
    }
     public Horse findHorse(int findNo){
         return (Horse)horses.get(findNo);
     }
     public void removeHorse(int HorseNo){
         horses.remove(HorseNo);
     }
}*/
