package musikshop.views.main;

import javax.swing.*;

public class MainPanel extends JPanel {
    private Header header;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public MainPanel() {
        this.setLayout(null);
        this.setBounds(0, 0, 1008, 730);

        this.setHeader(new Header());
        this.add(this.getHeader());
    }
}
