package musikshop.views.main;

import javax.swing.*;

public class MainFrame extends JFrame {
    private MainPanel mainPanel;

    public MainPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(MainPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public MainFrame() {
        this.setTitle("Musik Shop");
        this.setResizable(false);
        this.setBounds(300, 300, 1024, 768);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMainPanel(new MainPanel());
        this.add(getMainPanel());

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.setVisible(true);
    }
}
