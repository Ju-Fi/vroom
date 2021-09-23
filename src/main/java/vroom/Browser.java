package vroom;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import java.awt.*;

public class Browser extends JFrame {

    private final JEditorPane window;

    public Browser(){
        super("Vroom Browser");

        JTextField addressBar = new JTextField("https://");
        addressBar.addActionListener(
                actionEvent -> loadSite(actionEvent.getActionCommand())
        );
        add(addressBar, BorderLayout.PAGE_START);
        window = new JEditorPane();
        window.setEditable(false);
        window.addHyperlinkListener(
                hyperlinkEvent -> {
                    if (hyperlinkEvent.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                        loadSite(hyperlinkEvent.getURL().toString());
                    }
                }
        );
        add(new JScrollPane(window), BorderLayout.CENTER);
    }

    private void loadSite(String url){
        try {
            window.setPage(url);
        } catch (Exception ignored){}
    }
}
