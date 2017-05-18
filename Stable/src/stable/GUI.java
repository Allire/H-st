package stable;

/**
 *
 * @author HorseBOYYYY
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class GUI {

    private JFrame frame;
    private JPanel background;
    private JTextField tf_horsename, tf_stallnumber, tf_points ,tf_weight, tf_height, tf_rank;
    private JLabel l_horsename, l_stallnumber, l_points , l_rank, l_weight, l_height;
    private JButton b_create, b_remove, b_addweight, b_addheight, b_search, b_clear, b_rank, b_points;
    private Database database;
    private Horse findHorse;

    public GUI(Database databasen){
        database = databasen;
        frame = new JFrame("HorseHouse");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        background = new JPanel();
        tf_horsename = createTF();
        tf_stallnumber = createTF();
        tf_points = createTF();
        tf_weight = createTF();
        tf_height = createTF();
        tf_rank = createTF();
        l_horsename = new JLabel("Horse name");
        l_stallnumber = new JLabel("Stallnumber");
        l_rank = new JLabel("Rank");
        l_weight = new JLabel("Weight");
        l_height = new JLabel("Height");
        l_points = new JLabel("Points");
        b_create = new JButton("Create Horse");
        b_create.addActionListener(new CreateHandler());
        b_remove = new JButton("Remove Horse");
        b_points = new JButton("Add Points");
        b_points.addActionListener(new PointHandler());
        b_rank = new JButton("View rank");
        b_rank.addActionListener(new RankHandler());
        b_addweight = new JButton("New weight");
        b_addheight = new JButton("New height");
        b_search = new JButton("Search");
        b_search.addActionListener(new SearchHandler());
        b_clear = new JButton("clear");
        b_clear.addActionListener(new ClearHandler());

        frame.add(background);
        background.setLayout(new GridLayout(10,2));
        background.add(l_horsename);
        background.add(tf_horsename);
        background.add(l_stallnumber);
        background.add(tf_stallnumber);
        background.add(l_weight);
        background.add(tf_weight);
        background.add(l_height);
        background.add(tf_height);
        background.add(l_rank);
        background.add(tf_rank);
        background.add(l_points);
        background.add(tf_points);
        background.add(b_create);
        background.add(b_remove);
        background.add(b_points);
        background.add(b_addweight);
        background.add(b_addheight);
        background.add(b_search);
        background.add(b_clear);
        background.add(b_rank);
        frame.pack();
        frame.setVisible(true);
    }


    public JTextField createTF(){
        return new JTextField(12);
    }


    private class ClearHandler implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            tf_horsename.setText("");
            tf_stallnumber.setText("");
            tf_points.setText("");
            tf_weight.setText("");
            tf_height.setText("");
        }
    }

    private class CreateHandler implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if((tf_horsename.getText().isEmpty())){
                tf_horsename.setText("PLEASE ENTER A NAME");
            }
            else{
                Horse h = new Horse(tf_horsename.getText());
                tf_stallnumber.setText("" + h.getNumber());
                database.addHorse(h);
                //System.out.println(database.findHorse(h.getNumber()));
            }
        }
    }

    private class PointHandler implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            int points = Integer.parseInt(tf_points.getText());
            findHorse.setPoints(points);


        }
    }

    private class WeightHandler implements ActionListener{
        public void actionPerformed(ActionEvent ae){

        }
    }

    private class HeightHandler implements ActionListener{
        public void actionPerformed(ActionEvent ae){

        }
    }
    private class RankHandler implements ActionListener{
        public void actionPerformed(ActionEvent ae){
           /* try{
                int Rank = 1;
                if(tf_horsename.getText().isEmpty() && tf_stallnumber.getText()){
                    tf_horsename.setText("Enter a name");
                    tf_stallnumber.setText("Enter a number");
                }
                else if (tf_stallnumber.getText().isEmpty()){

                }
                else if (tf_horsename.getText().isEmpty()){
                    Horse h = new Horse(tf_horsename.getText());
                    for (Object value : database.values()) {
                        database.values() > database.getPoints();
                    }
                }
            }
            catch (NumberFormatException e){
                tf_stallnumber.setText("Enter a number");
            }
            catch (NullPointerException e){
                tf_stallnumber.setText("Horse doesn't exist");
            }*/
        }
    }


    private class RemoveHandler implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            tf_horsename.getText();
        }
    }


    private class SearchHandler implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            try{
                if(tf_stallnumber.getText().isEmpty()){
                    tf_stallnumber.setText("Please enter a number");
                }
                else{
                    String value = tf_stallnumber.getText();
                    int stallnumber = Integer.parseInt(value);
                     findHorse = database.findHorse(stallnumber);
                    tf_horsename.setText(findHorse.getHorseName());
                    l_rank.setText("" + findHorse.getRank());
                    
                }
            }
            catch (NumberFormatException e){
                tf_stallnumber.setText("Please enter a number");
            }
            catch (NullPointerException e){
                tf_stallnumber.setText("That horse doesn't exist");
            }
        }
    }
}