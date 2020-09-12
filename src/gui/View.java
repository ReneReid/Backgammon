package gui;

import javax.swing.*;
import java.awt.*;


public class View {

    private JFrame commandFrame;
    private JButton newGameButton;
    private JButton rollDieButton;
    private JButton movePieceButton;
    private JButton skipTurnButton;
    private JButton statsButton;
    private JButton moveRecommButton;
    private JButton updateDisplayButton;
    private JButton doubleGameButton;
    private JButton quitButton;
    private JLabel pieceNumberLabel;
    private JLabel positionNumberLabel;
    private JTextField pieceNumberTxtField;
    private JTextField positionNumberTxtField;


    //EFFECT: class constructor

    public View(String title) {
        commandFrame = new JFrame(title);
        frameSetUp(commandFrame);
        buttonCreator();
        movePieceLabelCreator();
        movePieceTxtFieldCreator();
        GroupLayout layout = new GroupLayout(commandFrame.getContentPane());
        groupLayoutSetUp(layout);
        commandFrame.getContentPane().setLayout(layout);


    }

    // EFFECT: creates buttons for GUI
    private void buttonCreator() {
        newGameButton = new JButton("New Game");
        rollDieButton = new JButton("Roll Dice");
        movePieceButton = new JButton("Move Piece");
        skipTurnButton = new JButton("Skip Turn");
        statsButton = new JButton("Game Stats");
        moveRecommButton = new JButton("Move Recommendation");
        updateDisplayButton = new JButton("Display Updated Board");
        doubleGameButton = new JButton("Double Game's Value");
        quitButton = new JButton("Quit");

    }


    //EFFECT: creates labels related to move in GUI
    private void movePieceLabelCreator() {
        pieceNumberLabel = new JLabel("Piece Number");
        positionNumberLabel = new JLabel("Dice Number");


    }


    private void movePieceTxtFieldCreator() {
        pieceNumberTxtField = new JTextField();
        positionNumberTxtField = new JTextField();

    }


    public JFrame frameSetUp(JFrame frame) {
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 260);
        frame.setVisible(true);
        return frame;


    }

    public GroupLayout groupLayoutSetUp(GroupLayout layout) {
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateContainerGaps(true);
        horizontalGroupSetUp(layout);
        verticalGroupSetUp(layout);
        layout.linkSize(SwingConstants.HORIZONTAL, newGameButton, rollDieButton, movePieceButton, moveRecommButton,
                statsButton, doubleGameButton, quitButton);
        return layout;

    }

    // EFFECT: establishes horizontal layout of element's buttons, labels, and text fields
    public GroupLayout horizontalGroupSetUp(GroupLayout layout) {
        layout.setHorizontalGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.
                Alignment.LEADING).addComponent(newGameButton).addComponent(rollDieButton).addComponent(movePieceButton)
                .addComponent(moveRecommButton)
                .addComponent(statsButton).addComponent(doubleGameButton).addComponent(quitButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(pieceNumberLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(pieceNumberTxtField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(positionNumberLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(positionNumberTxtField)));
        return layout;

    }


    // EFFECT: establishes vertical layout of element's buttons, labels, and text fields
    public GroupLayout verticalGroupSetUp(GroupLayout layout) {
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(newGameButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(rollDieButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(movePieceButton)
                        .addComponent(pieceNumberLabel).addComponent(pieceNumberTxtField).addComponent(positionNumberLabel)
                        .addComponent(positionNumberTxtField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(moveRecommButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(statsButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(doubleGameButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(quitButton)));
        return layout;


    }

    public JFrame getFrame() {
        return commandFrame;
    }

    public void setFrame(JFrame frame) {
        this.commandFrame = frame;
    }

    public JFrame getCommandFrame() {
        return commandFrame;
    }

    public JButton getNewGameButton() {
        return newGameButton;
    }

    public JButton getRollDieButton() {
        return rollDieButton;
    }

    public JButton getMovePieceButton() {
        return movePieceButton;
    }

    public JButton getSkipTurnButton() {
        return skipTurnButton;
    }

    public JButton getStatsButton() { return statsButton; }

    public JButton getMoveRecommButton() {
        return moveRecommButton;
    }

    public JButton getUpdateDisplayButton() {
        return updateDisplayButton;
    }

    public JButton getDoubleGameButton() {
        return doubleGameButton;
    }

    public JButton getQuitButton() {
        return quitButton;
    }

    public JLabel getPieceNumberLabel() {
        return pieceNumberLabel;
    }

    public JLabel getPositionNumberLabel() {
        return positionNumberLabel;
    }

    public JTextField getPieceNumberTxtField() {
        return pieceNumberTxtField;
    }

    public JTextField getPositionNumberTxtField() {
        return positionNumberTxtField;
    }
}
