import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout implements ActionListener{
    JButton button1 = new JButton("Set Sail"); // setting the jbutton and jframe out here lets me interact with them easier than if they were in the layout class
    JFrame login = new JFrame();
    JTextField userIDField = new JTextField();
    
    public Layout(){
        login.setSize(640,400);
        login.setTitle("Ahoy scallywag!!!");
        login.setVisible(true);
        login.setLayout(new GridBagLayout());
        //login.setResizable(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;// this fills up the space of the cell in both directions

        gbc.gridx = 0;// position on the grid in the x direction
        gbc.gridy = 0;// position on the grid in the y direction
        gbc.gridwidth = 3;// how many cells it is taking up in the x direction
        gbc.gridheight = 1;// how many cells it is taking up in the y direction
        gbc.weightx = 1;// how much space it takes up in compared to the other cells in the x and y direction 
        gbc.weighty = 2.5;// the bigger the number the more space it takes up
        JLabel label1 = new JLabel("Ye' bay");
        label1.setFont(new Font("Lucida Handwriting",Font.BOLD,40));
        label1.setBackground(new Color(100,149,237));
        label1.setOpaque(true);// this allows for the background color to bee seen
        login.add(label1, gbc);// the gbc makes sure it uses the constraints we set in the lines above

        gbc.gridx = 0;// this has to be set before you add any object
        gbc.gridy = 3;// so it takes up a lot of lines of code
        gbc.gridwidth = 1;// but you don't need to change the grid width/height or weightx/y if you are not changing it
        gbc.weighty = 1;     
        JLabel label2 = new JLabel("What be yer name? :");
        label2.setFont(new Font("Lucida Handwriting",Font.BOLD,20));
        label2.setBackground(new Color(35,110,230));
        label2.setOpaque(true);
        login.add(label2, gbc);
        
        JLabel label3 = new JLabel();
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 20;
        label3.setBackground(new Color(35,110,230));
        label3.setOpaque(true);
        userIDField.setOpaque(true);
        userIDField.addActionListener(this);
        gbc.fill = GridBagConstraints.HORIZONTAL;// I only wanted a it the height of the text that a user can input
        login.add(userIDField, gbc);
        gbc.fill = GridBagConstraints.BOTH;
        login.add(label3, gbc);// this is the background color that has to be a different label in order to make it look nice

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1;
        JLabel label4 = new JLabel();//filler
        label4.setBackground(new Color(102,60,31));
        label4.setOpaque(true);
        login.add(label4, gbc);

        gbc.gridx = 1;
        JLabel label5 = new JLabel();//filler
        label5.setBackground(new Color(102,60,31));
        label5.setOpaque(true);
        login.add(label5, gbc);

        gbc.gridx = 2;
        button1.addActionListener(this);// this is absolutly nessesary inorder for the button to work        
        button1.setBackground(new Color(239, 231, 209));
        button1.setFont(new Font("Lucida Handwriting",Font.BOLD,20));
        login.add(button1, gbc);   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            login.dispose();// closes the login jframe
            new Options();// opens the new jframe 
        }
    }

    public class Options implements ActionListener{
        JFrame options = new JFrame();
        JButton displayInv = new JButton("displayInventory");
        JButton addInv = new JButton("addInventory");
        JButton sellInv = new JButton("sellInventory");
        JButton displaySoldInv = new JButton("displaySoldInventory");
        JButton deleteInv = new JButton("deleteInventory");

        Options(){
            options.setSize(640,400);
            options.setTitle("No hornswaggling");
            options.setVisible(true);
            options.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.BOTH;
    
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 1;
            gbc.weighty = 0.75;
            JLabel label1 = new JLabel("Ye' bay");
            label1.setFont(new Font("Lucida Handwriting",Font.BOLD,40));
            label1.setBackground(new Color(100,149,237));
            label1.setOpaque(true);
            options.add(label1, gbc);
    
            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 2;
            gbc.weighty = 0.75;
            
            JLabel label2 = new JLabel("Avast " + userIDField.getText() + "!!");
            label2.setFont(new Font("Lucida Handwriting",Font.BOLD,30));
            label2.setBackground(new Color(100,149,237));
            label2.setOpaque(true);
            options.add(label2, gbc);
    
            JLabel label3 = new JLabel("What be yer purpose?");
            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.gridwidth = 2;
            gbc.gridheight = 1;
            gbc.weightx = 1;
            gbc.weighty = 1.25;
            label3.setFont(new Font("Lucida Handwriting",Font.BOLD,15));
            label3.setBackground(new Color(35,110,230));
            label3.setOpaque(true);
            options.add(label3, gbc);
    
            gbc.gridx = 0;
            gbc.gridy = 3;
            gbc.gridwidth = 2;
            gbc.gridheight = 1;
            gbc.weightx = 2;
            gbc.weighty = 1;
            displayInv.setBackground(new Color(239, 231, 209));
            displayInv.setFont(new Font("Lucida Handwriting",Font.BOLD,12));
            displayInv.addActionListener(this);
            options.add(displayInv, gbc);

            gbc.gridy = 4;
            addInv.setBackground(new Color(239, 231, 209));
            addInv.setFont(new Font("Lucida Handwriting",Font.BOLD,12));
            addInv.addActionListener(this);
            options.add(addInv, gbc);

            gbc.gridy = 5;
            sellInv.setBackground(new Color(239, 231, 209));
            sellInv.setFont(new Font("Lucida Handwriting",Font.BOLD,12));
            sellInv.addActionListener(this);
            options.add(sellInv, gbc);

            gbc.gridy = 6;
            displaySoldInv.setBackground(new Color(239, 231, 209));
            displaySoldInv.setFont(new Font("Lucida Handwriting",Font.BOLD,12));
            displaySoldInv.addActionListener(this);
            options.add(displaySoldInv, gbc);

            gbc.gridy = 7;
            deleteInv.setBackground(new Color(239, 231, 209));
            deleteInv.setFont(new Font("Lucida Handwriting",Font.BOLD,12));
            deleteInv.addActionListener(this);
            options.add(deleteInv, gbc);

        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==displayInv){
                options.dispose();
                   
            } 
            if(e.getSource()==addInv){
                options.dispose();
                   
            } 
            if(e.getSource()==sellInv){
                options.dispose();
                   
            } 
            if(e.getSource()==displaySoldInv){
                options.dispose();
                   
            } 
            if(e.getSource()==deleteInv){
                options.dispose();
                   
            } 
        }
    }


    public static void main(String[] args) {
        new Layout();
    }

}




