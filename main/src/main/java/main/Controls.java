package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Set;

public class Controls implements KeyListener {

public static boolean up,down,left,right,pause,save;
private static final Set<Integer> UP_KEYS = Set.of(KeyEvent.VK_W, KeyEvent.VK_UP);
private static final Set<Integer> DOWN_KEYS = Set.of(KeyEvent.VK_S, KeyEvent.VK_DOWN);
private static final Set<Integer> LEFT_KEYS = Set.of(KeyEvent.VK_A, KeyEvent.VK_LEFT);
private static final Set<Integer> RIGHT_KEYS = Set.of(KeyEvent.VK_D, KeyEvent.VK_RIGHT);
private static final Set<Integer> SPACE_KEYS = Set.of(KeyEvent.VK_SPACE);
private static final Set<Integer> Y_KEYS = Set.of(KeyEvent.VK_Y);


    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {
    int code = e.getKeyCode();

    // Controls
    // UP
    if(UP_KEYS.contains(code)) up = true;
    // DOWN
    if(DOWN_KEYS.contains(code)) down = true;
    // LEFT
    if (LEFT_KEYS.contains(code)) left = true;
    // RIGHT
    if (RIGHT_KEYS.contains(code)) right = true;
    // PAUSE
    if (SPACE_KEYS.contains(code))  pause = !pause;
    // SWITCH
    if (Y_KEYS.contains(code)) save = true;
    }

    @Override
            public  void keyReleased(KeyEvent e){
    }

}