

package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class Splash extends JFrame implements Runnable {

    Thread t;
    JLabel loading;

    Splash() {
        // Load and scale image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        setContentPane(img);
        img.setLayout(null);

        // Title Label
        JLabel title = new JLabel("Leicester University", SwingConstants.CENTER);
        title.setFont(new Font("SerifI", Font.BOLD, 40));
        title.setForeground(Color.WHITE);
        title.setBounds(200, 80, 600, 50);
        img.add(title);

        // Loading Label
        loading = new JLabel("Loading", SwingConstants.CENTER);
        loading.setFont(new Font("Arial", Font.BOLD, 34));
        loading.setForeground(Color.WHITE);
        loading.setBounds(400, 600, 200, 40);
        img.add(loading);

        // Translucent overlay (Optional)
        JPanel overlay = new JPanel();
        overlay.setBackground(new Color(0, 0, 0, 100));
        overlay.setBounds(0, 0, 1000, 700);
        overlay.setOpaque(false);  // Transparent so background image is visible
        img.add(overlay);

        // Frame setup
        setUndecorated(true);

        // For OSs that support opacity and shape
        try {
            setOpacity(0f); // Start transparent
            setShape(new RoundRectangle2D.Double(0, 0, 1000, 700, 40, 40)); // Rounded corners
        } catch (UnsupportedOperationException e) {
            System.out.println("Your system does not support transparency or shaped windows.");
        }

        setSize(1000, 700);
        setLocationRelativeTo(null);
        setVisible(true);

        // Start threads
        t = new Thread(this);
        t.start();
        fadeIn();
        animateLoadingText();
    }

    // Fade-in effect
    private void fadeIn() {
        try {
            for (float f = 0f; f <= 1f; f += 0.05f) {
                try {
                    setOpacity(f);
                } catch (UnsupportedOperationException e) {
                    // Some systems (like some Linux distros) do not support opacity
                }
                Thread.sleep(50);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Loading text animation
    private void animateLoadingText() {
        new Thread(() -> {
            String[] dots = {"", ".", "..", "..."};
            int i = 0;
            try {
                while (isVisible()) {
                    loading.setText("Loading" + dots[i % 4]);
                    i++;
                    Thread.sleep(400);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    // After 4 seconds, open login screen
    public void run() {
        try {
            Thread.sleep(5000); // Splash screen duration
            setVisible(false);
            new Login(); // Proceed to Login
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {
        new Splash();
    }
}
