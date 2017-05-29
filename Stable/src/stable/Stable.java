/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stable;

import java.io.*;

/**
 *
 * @author HorseBOYYYY
 */
public class Stable {
      /* public static void main(String[] args) {
        Database databasen = null;
        try{
            ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("datebase.srz")));
            databasen = (Database)in.readObject();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        if(databasen==null){
            databasen = new Database();
        }
       
      
      GUI g = new GUI(databasen);
       } */
    public static void main(String[] args) {
        Database DB = new Database();
        new GUI(DB);
    }
}
