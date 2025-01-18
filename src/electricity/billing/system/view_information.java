package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class view_information extends JFrame {
    view_information(){
        setBounds(350, 150,850,650);
        getContentPane().setBackground(Color.white);
        setLayout(null);


        JLabel heading = new JLabel("View Customer Information");
        heading.setBounds(250,0,500,40);
        heading.setFont(new Font("serif",Font.BOLD,20));
        add(heading);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(70,80,100,20);
        add(nameLabel);

        JLabel nameLabelText = new JLabel("");
        nameLabelText.setBounds(200,80,150,20);
        add(nameLabelText);

        JLabel meterno = new JLabel("Meter Number");
        meterno.setBounds(70,140,100,20);
        add(meterno);

        JLabel meternoText = new JLabel("");
        meternoText.setBounds(200,140,150,20);
        add(meternoText);

        JLabel address = new JLabel("Address");
        address.setBounds(70,200,100,20);
        add(address);

        JLabel addressText = new JLabel("");
        addressText.setBounds(200,200,100,20);
        add(addressText);

        JLabel city = new JLabel("City");
        city.setBounds(70,260,100,20);
        add(city);

        JLabel cityText = new JLabel("");
        cityText.setBounds(200,260,100,20);
        add(cityText);


        setVisible(true);
    }
    public static void main(String[] args) {
        new view_information();
    }
}
