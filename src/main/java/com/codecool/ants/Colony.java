package com.codecool.ants;

import com.codecool.ants.ants.Ant;
import com.codecool.ants.ants.Queen;

import java.util.ArrayList;
import java.util.List;

public class Colony {

    private List<List<String>> board = new ArrayList<>();
    private List<Ant> ants = new ArrayList<>();
    private final String EMPTY_FIELD = "X";

    public Colony(int width) {
        createBoard(width);
    }

    private void createBoard(int width) {

        for (int x = width; x > 0; x--) {

            List<String> row = new ArrayList<>();

            for (int y = width; y > 0; y--) {
                row.add(EMPTY_FIELD);
            }

            board.add(row);
        }

        generateAnts(width);
    }

    public void display() {
        for (List<String> row : board) {
            System.out.println(row);
        }
    }

    public void generateAnts(int width) {
        Ant queen = new Queen(width);
        board.get(queen.getPosition().x).set(queen.getPosition().y, queen.getSignature());
    }
}
