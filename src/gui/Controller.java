package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class Controller {
    private Model model;
    private View view;


    public Controller(Model m, View v) {
        model = m;
        view = v;
        initView();
    }

    // EFFECT: sets up view
    public void initView() {
        view.getPieceNumberTxtField().setText(model.getPieceNumber());
        view.getPositionNumberTxtField().setText(model.getPositionNumber());
    }



    // EFFECT: sets up buttons
    public void initController() {
        view.getNewGameButton().addActionListener(e -> newGameAction());
        view.getRollDieButton().addActionListener(e -> rollDieAction());
        view.getMovePieceButton().addActionListener(e -> movePieceAction());
        view.getSkipTurnButton().addActionListener(e -> skipTurnAction());
        view.getStatsButton().addActionListener(e -> statsAction());
        view.getMoveRecommButton().addActionListener(e -> moveRecommAction());
        view.getDoubleGameButton().addActionListener(e -> doubleGameAction());
        view.getQuitButton().addActionListener(e -> quit());
    }


    // No user data is required to create a new board - all boards follow same template.
    // EFFECTS: generates new backgammon board with pieces in their initial positions.
    private void newGameAction() {
        model.createBoard();
        displayBoard();
    }


    // No user data required to roll; dice roll determined by internal random number generator.
    // EFFECTS: rolls new pair of dice
    // TODO: remove previous diceFrame when rolling anew.
    private void rollDieAction() {
        model.rollDie();
        //JOptionPane.showMessageDialog(null, model.getColor() + "'s turn"
        //        + " Dice: " + model.getDiceList());
        model.diceFrameSetUp();
        model.getDiceFrame().setVisible(true);

    }


    private void movePieceAction() {
        model.setPieceNumber(view.getPieceNumberTxtField().getText());
        model.setPositionNumber(view.getPositionNumberTxtField().getText());
        model.movePiece();
        displayBoard();
    }


    private void skipTurnAction() {
        model.skipTurn();
        JOptionPane.showMessageDialog(null, "It's " + model.getColor() +
                "'s turn to move");
    }

    private void statsAction() {
        //model.stats();
        model.statsFrameSetUp();
        model.getStatsFrame().setVisible(true);
    }


    private void moveRecommAction() {}


    //private void updateDisplayAction() {}
    private void doubleGameAction() {
        model.doubleGame();
        JOptionPane.showMessageDialog(null, "Game's value is " + model.getValue());
    }


    private void quit() {
        JOptionPane.showMessageDialog(null, "Quit game.");
        System.exit(0);
    }


    private void displayBoard() {
        model.clearBoard();
        model.getFrame().getContentPane().add(model.getBigBoard(), "Center");
        model.piecesSetUp();
        model.getFrame().setVisible(true);
    }










}
