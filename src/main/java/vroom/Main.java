package vroom;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        browser.setSize(500, 500);
        browser.setVisible(true);
    }
}
