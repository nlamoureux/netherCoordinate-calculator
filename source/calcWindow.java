//Code by Nathan Lamoureux
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calcWindow implements ActionListener{

    
//Initializing frame components

JFrame frame = new JFrame();
JButton myButton = new JButton("Get Coordinates");
JTextField fieldx = new JTextField();
JTextField fieldz = new JTextField();
JLabel labelx = new JLabel("X-Coordinate:");
JLabel labelz = new JLabel("Z-Coordinate:");
JLabel Overworld = new JLabel("Overworld Coordinates");
JLabel Nether = new JLabel("Nether Coordinates:");
JTextField netherX = new JTextField();
JTextField netherZ = new JTextField();


    calcWindow() {
        //customizing and displaying frame, text, textfields, and button
        Overworld.setBounds(125, 0, 150, 75);
        frame.add(Overworld);

        fieldx.setBounds(95, 70, 100, 25);
        frame.add(fieldx);

        labelx.setBounds(10, 55, 100, 50);
        frame.add(labelx);

        labelz.setBounds(10, 95, 100, 50);
        frame.add(labelz);

        fieldz.setBounds(95, 110, 100, 25);
        frame.add(fieldz);

        Nether.setBounds(10, 200, 150, 50);
        frame.add(Nether);

        netherX.setBounds(130, 213, 50, 25);
        netherX.setEditable(false);
        frame.add(netherX);

        netherZ.setBounds(190, 213, 50, 25);
        netherZ.setEditable(false);
        frame.add(netherZ);




        myButton.setBounds(80,250,250,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        
        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);



    }

    //Creating an actionlistener that calls the conversion function whenever myButton is pressed
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton) {
        
    //Reading X and Y coordinates in, then passing them to function coordResults
        String X = fieldx.getText();
        int oX = Integer.parseInt(X);
      
            int nX = coordResults(oX);
        
        X = Integer.toString(nX);
    /*The coordinates are read in as a string and converted to integers when passed to the function. 
    * Result coordinates are converted back to strings in order to be diaplayed as a textfield
    */
        netherX.setText(X);

        String Z = fieldz.getText();
        int oZ = Integer.parseInt(Z);

            int nZ = coordResults(oZ);

        Z = Integer.toString(nZ);

        netherZ.setText(Z);

        }

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    //Function coordResults takes the X and Y input, divides them by 8, and returns the result as n
    private int coordResults(int oX2) {

        int n = oX2 / 8;

        return n;
    }
    

}

