
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField textFieldName;
    JPasswordField passwordField;
    JButton login, back, googleSignIn;
    JCheckBox rememberMe;

    Login() {
        // Background Image
        ImageIcon backgroundIcon = new ImageIcon(ClassLoader.getSystemResource("icon/loginback.jpg"));
        Image backgroundImage = backgroundIcon.getImage().getScaledInstance(1200, 1500, Image.SCALE_SMOOTH);
        JLabel background = new JLabel(new ImageIcon(backgroundImage));
        setContentPane(background);
        background.setLayout(null);

        // Panel for form
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(150, 70, 400, 300);
        panel.setBackground(new Color(255, 255, 255, 210)); // Semi-transparent white
        background.add(panel);

        // Heading
        JLabel heading = new JLabel("Sign In");
        heading.setBounds(150, 10, 200, 30);
        heading.setFont(new Font("SerifI", Font.BOLD, 24));
        heading.setForeground(new Color(30, 30, 30));
        panel.add(heading);

        // Username Field
        JLabel labelName = new JLabel("Username");
        labelName.setBounds(50, 60, 100, 20);
        labelName.setFont(new Font("SerifI", Font.BOLD, 16));
        panel.add(labelName);

        textFieldName = new JTextField();
        textFieldName.setBounds(50, 85, 300, 30);
        textFieldName.setFont(new Font("Serif", Font.BOLD, 14));
        panel.add(textFieldName);

        // Password Field
        JLabel labelPass = new JLabel("Password");
        labelPass.setBounds(50, 125, 100, 20);
        labelPass.setFont(new Font("SerifI", Font.BOLD, 16));
        panel.add(labelPass);

        passwordField = new JPasswordField();
        passwordField.setBounds(50, 150, 300, 30);
        passwordField.setFont(new Font("SerifI", Font.BOLD, 14));
        panel.add(passwordField);

        // Remember Me
        rememberMe = new JCheckBox("Remember me");
        rememberMe.setBounds(50, 185, 150, 20);
        rememberMe.setFont(new Font("SerifI", Font.BOLD, 13));
        rememberMe.setBackground(new Color(255, 255, 255, 210));
        panel.add(rememberMe);

        // Login Button
        login = new JButton("Sign In");
        login.setBounds(50, 215, 300, 35);
        login.setBackground(new Color(30, 144, 255));
        login.setForeground(Color.WHITE);
        login.setFont(new Font("SerifI", Font.BOLD, 15));
        login.setFocusPainted(false);
        login.addActionListener(this);
        panel.add(login);



        // Back Button
        back = new JButton("Back");
        back.setBounds(10, 10, 80, 25);
//        back.setBackground();
        back.setForeground(Color.BLACK);
        back.setFont(new Font("SerifI", Font.BOLD, 13));
        back.addActionListener(this);
        background.add(back);

        // Frame settings
        setSize(700, 500);
        setLocation(450, 200);
        setLayout(null);
        setUndecorated(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String username = textFieldName.getText();
            String password = passwordField.getText();

            String query = "select * from login where username='" + username + "' and password='" + password + "'";
            try {
                Conn c = new Conn();
                if (c.statement != null) {
                    ResultSet resultSet = c.statement.executeQuery(query);
                    if (resultSet.next()) {
                        setVisible(false);
                        JOptionPane.showMessageDialog(null, "Login Successful");
                        new main_class(); // your dashboard
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username or password");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Database connection failed.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        } else if (e.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}