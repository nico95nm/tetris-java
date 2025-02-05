package main;

import java.util.ArrayList;

public class PlayManager {
    final Integer WIDTH, HEIGHT;
    public static int left_x, right_x, top_y, bottom_y;

    public PlayManager(Integer width, Integer height) {
        // Play Main Area
        WIDTH = width;
        HEIGHT = height;

        // MINO
        Mino currentMino;
        final int MINO_START_X;
        final int MINO_START_Y;

        // Showing new mino
        Mino nextMino;
        final int NEXT_MINO_X;
        final int NEXT_MINO_Y;
        public static ArrayList<Block> staticBlocks = new ArrayList<Block>();

        // Other
        public static int dropInterval = 60;
        boolean gameOver;



    }

}
