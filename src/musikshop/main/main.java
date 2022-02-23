package musikshop.main;

import musikshop.controller.MainController;

import java.awt.*;

public class main {
    public static void main(String[] args) {
        EventQueue.invokeLater(MainController::new);
    }
}