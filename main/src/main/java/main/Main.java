package main;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    createAndShowGameWindow();
  }

  private static void createAndShowGameWindow() {
    JFrame window = new JFrame("Tetris");
    configureWindow(window);

    GamePanel gamePanel = new GamePanel();
    window.add(gamePanel);
    window.pack();

    window.setLocationRelativeTo(null);
    gamePanel.launchGame(); // This was missing in original code!
  }

  private static void configureWindow(JFrame window) {
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(true);  // Changed to single consistent value
  }
}