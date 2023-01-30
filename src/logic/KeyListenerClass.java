package logic;

import guiComponents.panelClass;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerClass implements KeyListener {
    Boolean paused = false;
    private panelClass panel;

    public KeyListenerClass(panelClass panel) {
        this.panel = panel;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_ENTER) {
            if (!paused) {
                panel.PauseGame();
                paused = true;
            }
            else{
                panel.ContinuePlay();
                paused = false;
            }
        }
        if (keyCode == KeyEvent.VK_ESCAPE) {
            panel.EndGame();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
