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
public class Horse{
    
    private double weight;
    private double height;
    private int points;
    private String horsename;
    private String rank;
    private static int counter = 0;
    private int stallnumber;
    
    private Horse(){
    stallnumber=++counter;
}
  public Horse(String horse){
      this();
      this.horsename = horse;
  }
  
  public Horse(String horse, String rankNR){
      this(horse);
      this.rank = rankNR; 
      
  }
    /**
     * Returns an Image object that can then be painted on the screen.
     * The url argument must specify an absolute. The name
     * argument is a specifier that is relative to the url argument.
     * <p>
     * This method always returns immediately, whether or not the
     * image exists. When this applet attempts to draw the image on
     * the screen, the data will be loaded. The graphics primitives
     * that draw the image will incrementally paint on the screen.
     *
     * @param  weight  an absolute URL giving the base location of the image
     */
  public void setWeight(double weight){
      this.weight = weight;
  }
  
  public void setHeight(double height){
      this.height = height;
  }
  public void setHorsenumber(int stallnumber){
    this.stallnumber = stallnumber;
  }
  public void setPoints(int points){
      this.points +=points;
  }


   public int getPoints(){
       return points;
   }
  
   public String getRank(){
       return rank;
   }
   
   public String getHorseName(){
       return horsename;
   }
   
   public double getWeight(){
       return weight;
   }
   
   public double getHeight(){
       return height;
   }
      
   public int getNumber(){
       return stallnumber;
   }
   
   public String toString(){
       return "horse: " + this.horsename + " \n stallnumber: " + this.stallnumber + "\n weight: " + this.weight + "\n height " + this.height;
   }
   
}
   
   
   

