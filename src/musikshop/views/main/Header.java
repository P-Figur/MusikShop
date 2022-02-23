package musikshop.views.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Header extends JPanel {
    private ImageIcon icon;
    private JLabel iconlabel;
    private JButton searchbtn;
    private JTextField searchfield;
    private JButton warenkorbbtn;

    public ImageIcon getIcon() {
        return icon;
    }

    public JLabel getIconlabel() {
        return iconlabel;
    }

    public JButton getSearchbtn() {
        return searchbtn;
    }

    public JTextField getSearchfield() {
        return searchfield;
    }

    public JButton getWarenkorbbtn() {
        return warenkorbbtn;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public void setIconlabel(JLabel iconlabel) {
        this.iconlabel = iconlabel;
    }

    public void setSearchbtn(JButton searchbtn) {
        this.searchbtn = searchbtn;
    }

    public void setSearchfield(JTextField searchfield) {
        this.searchfield = searchfield;
    }

    public void setWarenkorbbtn(JButton warenkorbbtn) {
        this.warenkorbbtn = warenkorbbtn;
    }

    public Header() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 20,20));
        this.setBounds(0, 0, 1008, 120);
        this.setBackground(Color.GRAY);

        this.setIcon(new ImageIcon("F:\\Code\\java-workspace\\MusikShop\\src\\musikshop\\resources\\Logo.png"));
        this.setIconlabel(new JLabel(getIcon()));
        this.getIconlabel().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("LOGO CLICKED");
            }
        });
        this.getIconlabel().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.add(getIconlabel());

        this.setSearchbtn(new JButton("Suchen"));
        this.getSearchbtn().setPreferredSize(new Dimension(80, 30));
        this.getSearchbtn().setBackground(new Color(85, 73, 255));
        this.getSearchbtn().addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                getSearchbtn().setFocusPainted(true);
                getSearchbtn().setBackground(new Color(130, 121, 255));
            }
            public void mouseExited(MouseEvent e) {
                getSearchbtn().setFocusPainted(false);
                getSearchbtn().setBackground(new Color(85, 73, 255));
            }
            public void mouseClicked(MouseEvent e) {
                System.out.println("SEARCH CLICKED");
            }
        });
        this.getSearchbtn().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.add(getSearchbtn());

        this.setSearchfield(new JTextField(40));
        this.getSearchfield().setFont(new Font("Arial", Font.PLAIN, 16));
        this.add(getSearchfield());

        this.setWarenkorbbtn(new JButton("Warenkorb"));
        this.getWarenkorbbtn().setPreferredSize(new Dimension(100, 80));
        this.getWarenkorbbtn().addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                getWarenkorbbtn().setFocusPainted(true);
                getWarenkorbbtn().setBackground(new Color(130, 121, 255));
            }
            public void mouseExited(MouseEvent e) {
                getWarenkorbbtn().setFocusPainted(false);
                getWarenkorbbtn().setBackground(new Color(85, 73, 255));
            }
            public void mouseClicked(MouseEvent e) {
                System.out.println("WARENKORB CLICKED");
            }
        });
        this.add(getWarenkorbbtn());
    }
}
