package musikshop.controller;

import musikshop.views.main.MainFrame;

public class MainController {
    private MainFrame activeView;
    //private MainModel mainModel;


    public MainFrame getActiveView() {
        return activeView;
    }

    public void setActiveView(MainFrame activeView) {
        this.activeView = activeView;
    }

    public MainController() {
        this.setActiveView(new MainFrame());


    }
}
