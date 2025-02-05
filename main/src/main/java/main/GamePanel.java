package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    // Constants
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    private static final int FPS = 60;
    private static final double DRAW_INTERVAL = 1000000000.0 / FPS;

    // Game components
    private Thread gameThread;
    private PlayManager playManager;

    public GamePanel() {
        initializePanel();
        initializeGameComponents();
    }

    private void initializePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        setLayout(null);
        setFocusable(true);
    }

    private void initializeGameComponents() {
    addKeyListener(new Controls());
        playManager = new PlayManager(WIDTH, HEIGHT);
    }

    public void launchGame() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double delta = 0;
        long lastTime = System.nanoTime();

        while (gameThread != null) {
            long currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / DRAW_INTERVAL;
            lastTime = currentTime;

            if (delta >= 1) {
                updateGame();
                repaint();
                delta--;
            }
        }
    }

    private void updateGame() {
        if (!Controls.pause && !playManager.gameOver) {
            playManager.update();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        playManager.draw(g2);
    }
}