package gui;

import model.*;
import model.exceptions.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;


public class Model {

    HashMap<Integer, JPanel> triMap = new HashMap<Integer, JPanel>();

    private int game;
    private int turn;
    private int value;
    private String color = "white";
    private String prevOfferor = "none";
    private int blackPoints = 0;
    private int whitePoints = 0;

    private List<Integer> diceList;
    private int numMoves;

    private String pieceNumber;
    private String positionNumber;


    private Triangle triangle1 = new Triangle(1);
    private Triangle triangle2 = new Triangle(2);
    private Triangle triangle3 = new Triangle(3);
    private Triangle triangle4 = new Triangle(4);
    private Triangle triangle5 = new Triangle(5);
    private Triangle triangle6 = new Triangle(6);
    private Triangle triangle7 = new Triangle(7);
    private Triangle triangle8 = new Triangle(8);
    private Triangle triangle9 = new Triangle(9);
    private Triangle triangle10 = new Triangle(10);
    private Triangle triangle11 = new Triangle(11);
    private Triangle triangle12 = new Triangle(12);
    private Triangle triangle13 = new Triangle(13);
    private Triangle triangle14 = new Triangle(14);
    private Triangle triangle15 = new Triangle(15);
    private Triangle triangle16 = new Triangle(16);
    private Triangle triangle17 = new Triangle(17);
    private Triangle triangle18 = new Triangle(18);
    private Triangle triangle19 = new Triangle(19);
    private Triangle triangle20 = new Triangle(20);
    private Triangle triangle21 = new Triangle(21);
    private Triangle triangle22 = new Triangle(22);
    private Triangle triangle23 = new Triangle(23);
    private Triangle triangle24 = new Triangle(24);

    private WhitePiece whitePiece1 = new WhitePiece(1, triangle1);
    private WhitePiece whitePiece2 = new WhitePiece(2, triangle1);
    private WhitePiece whitePiece3 = new WhitePiece(3, triangle12);
    private WhitePiece whitePiece4 = new WhitePiece(4, triangle12);
    private WhitePiece whitePiece5 = new WhitePiece(5, triangle12);
    private WhitePiece whitePiece6 = new WhitePiece(6, triangle12);
    private WhitePiece whitePiece7 = new WhitePiece(7, triangle12);
    private WhitePiece whitePiece8 = new WhitePiece(8, triangle17);
    private WhitePiece whitePiece9 = new WhitePiece(9, triangle17);
    private WhitePiece whitePiece10 = new WhitePiece(10, triangle17);
    private WhitePiece whitePiece11 = new WhitePiece(11, triangle19);
    private WhitePiece whitePiece12 = new WhitePiece(12, triangle19);
    private WhitePiece whitePiece13 = new WhitePiece(13, triangle19);
    private WhitePiece whitePiece14 = new WhitePiece(14, triangle19);
    private WhitePiece whitePiece15 = new WhitePiece(15, triangle19);
    private BlackPiece blackPiece1 = new BlackPiece(1, triangle24);
    private BlackPiece blackPiece2 = new BlackPiece(2, triangle24);
    private BlackPiece blackPiece3 = new BlackPiece(3, triangle13);
    private BlackPiece blackPiece4 = new BlackPiece(4, triangle13);
    private BlackPiece blackPiece5 = new BlackPiece(5, triangle13);
    private BlackPiece blackPiece6 = new BlackPiece(6, triangle13);
    private BlackPiece blackPiece7 = new BlackPiece(7, triangle13);
    private BlackPiece blackPiece8 = new BlackPiece(8, triangle8);
    private BlackPiece blackPiece9 = new BlackPiece(9, triangle8);
    private BlackPiece blackPiece10 = new BlackPiece(10, triangle8);
    private BlackPiece blackPiece11 = new BlackPiece(11, triangle6);
    private BlackPiece blackPiece12 = new BlackPiece(12, triangle6);
    private BlackPiece blackPiece13 = new BlackPiece(13, triangle6);
    private BlackPiece blackPiece14 = new BlackPiece(14, triangle6);
    private BlackPiece blackPiece15 = new BlackPiece(15, triangle6);

    private JPanel leftBoard;
    private JPanel barBoard;
    private JPanel rightBoard;
    private JPanel bigBoard;
    private JFrame frame;
    private JFrame diceFrame;
    private JFrame statsFrame;

    private JPanel tri1 = new JPanel();
    private JPanel tri2 = new JPanel();
    private JPanel tri3 = new JPanel();
    private JPanel tri4 = new JPanel();
    private JPanel tri5 = new JPanel();
    private JPanel tri6 = new JPanel();
    private JPanel tri7 = new JPanel();
    private JPanel tri8 = new JPanel();
    private JPanel tri9 = new JPanel();
    private JPanel tri10 = new JPanel();
    private JPanel tri11 = new JPanel();
    private JPanel tri12 = new JPanel();
    private JPanel tri13 = new JPanel();
    private JPanel tri14 = new JPanel();
    private JPanel tri15 = new JPanel();
    private JPanel tri16 = new JPanel();
    private JPanel tri17 = new JPanel();
    private JPanel tri18 = new JPanel();
    private JPanel tri19 = new JPanel();
    private JPanel tri20 = new JPanel();
    private JPanel tri21 = new JPanel();
    private JPanel tri22 = new JPanel();
    private JPanel tri23 = new JPanel();
    private JPanel tri24 = new JPanel();


    private Board board = new Board();

    public Model(String pieceNumber, String positionNumber) {
        this.pieceNumber = pieceNumber;
        this.positionNumber = positionNumber;
        //triPanelSetUp(triArray);
        triPanelSetUpp(tri1, 1);
        triPanelSetUpp(tri2, 2);
        triPanelSetUpp(tri3, 3);
        triPanelSetUpp(tri4, 4);
        triPanelSetUpp(tri5, 5);
        triPanelSetUpp(tri6, 6);
        triPanelSetUpp(tri7, 7);
        triPanelSetUpp(tri8, 8);
        triPanelSetUpp(tri9, 9);
        triPanelSetUpp(tri10, 10);
        triPanelSetUpp(tri11, 11);
        triPanelSetUpp(tri12, 12);
        triPanelSetUpp(tri13, 13);
        triPanelSetUpp(tri14, 14);
        triPanelSetUpp(tri15, 15);
        triPanelSetUpp(tri16, 16);
        triPanelSetUpp(tri17, 17);
        triPanelSetUpp(tri18, 18);
        triPanelSetUpp(tri19, 19);
        triPanelSetUpp(tri20, 20);
        triPanelSetUpp(tri21, 21);
        triPanelSetUpp(tri22, 22);
        triPanelSetUpp(tri23, 23);
        triPanelSetUpp(tri24, 24);
        leftBoardSetUp();
        barBoardSetUp();
        rightBoardSetUp();
        bigBoardSetUp();
        frameSetUp();

    }


    private JPanel[] triArray = {tri1, tri2, tri3, tri4, tri5, tri6, tri7, tri8, tri9, tri10, tri11, tri12, tri13,
            tri14, tri15, tri16, tri17, tri18, tri19, tri20, tri21, tri22, tri23, tri24};


    //TODO: trouble shoot null pointer exception when below function run so that
    // can collapse number of triPanel set up calls.
//    private void triPanelSetUp(JPanel[] jArray) {
//        int x;
//        int y;
//        int c;
//        for (int i = 0; i < jArray.length; i++) {
//            jArray[i].setLayout(new BoxLayout(jArray[i], BoxLayout.Y_AXIS));
//            if (i%2 == 0) {
//                jArray[i].setBackground(Color.lightGray);
//            } else {
//                jArray[i].setBackground(Color.orange);
//            }
//            jArray[i].setEnabled(true);
//            jArray[i].setSize(new Dimension(50, 200));
//            if (i <= 6 || i >= 19) {
//                c = 110;
//            } else {
//                c = 10;
//            }
//            if (i <= 12) {
//                x = ((12 - i)*50) + c;
//                y = 10;
//            } else {
//                x = ((i - 13)*50) + c;
//                y = 510;
//            }
//            jArray[i].setLocation(x, y);
//            triMap.put(i, jArray[i]);
//        }
//    }


    // EFFECTS: currently sets up the triangles' parameters and sets them to the board.
    private void triPanelSetUpp(JPanel tri, int i) {
        int x;
        int y;
        int c;
        tri.setLayout(new BoxLayout(tri, BoxLayout.Y_AXIS));
        if (i%2 == 0) {
            tri.setBackground(Color.lightGray);

        } if (i%2 != 0) {
            tri.setBackground(Color.orange);
        }
        tri.setEnabled(true);
        tri.setSize(new Dimension(50, 200));
        if (i <= 6 || i >= 19) {
            c = 110;
        } else {
            c = 10;
        }
        if (i <= 12) {
            x = ((12 - i)*50) + c;
            y = 10;
        } else {
            x = ((i - 13)*50) + c;
            y = 510;
        }
        tri.setLocation(x, y);
        triMap.put(i, tri);
    }



    private void leftBoardSetUp() {
        leftBoard = new JPanel();
        leftBoard.setLayout(new BoxLayout(leftBoard, BoxLayout.Y_AXIS));
        leftBoard.setBackground(Color.darkGray);
        leftBoard.setEnabled(true);
        leftBoard.setSize(new Dimension(300, 300));
        leftBoard.setLocation(10, 210);

    }

    private void barBoardSetUp() {
        barBoard = new JPanel();
        barBoard.setLayout(new BoxLayout(barBoard, BoxLayout.Y_AXIS));
        barBoard.setBackground(Color.gray);
        barBoard.setEnabled(true);
        barBoard.setSize(new Dimension(100, 700));
        barBoard.setLocation(310, 10);
    }

    private void rightBoardSetUp() {
        rightBoard = new JPanel();
        rightBoard.setLayout(new BoxLayout(rightBoard, BoxLayout.Y_AXIS));
        rightBoard.setBackground(Color.darkGray);
        rightBoard.setEnabled(true);
        rightBoard.setSize(new Dimension(300, 300));
        rightBoard.setLocation(410, 210);
    }


   private void frameSetUp() {
        frame = new JFrame("Backgammon Table");
        frame.setLayout(null);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLocation(500, 500);
    }

    void diceFrameSetUp() {
        diceFrame = new JFrame("Dice");
        diceFrame.setLayout(null);
        diceFrame.getContentPane().setLayout(new BorderLayout());
        diceFrame.setSize(200, 100);
        diceFrame.setLocation(750, 0);

        JPanel dicePanel = new JPanel();
        dicePanel.setLayout(new BoxLayout(dicePanel, BoxLayout.Y_AXIS));
        dicePanel.setBackground(Color.pink);
        dicePanel.setEnabled(true);
        dicePanel.setSize(150, 100);
        String id = getColor() + "'s turn" +  " Dice: " + getDiceList();
        JLabel diceLabel = new JLabel(id);
        dicePanel.add(diceLabel);
        diceFrame.add(dicePanel);
    }

    void statsFrameSetUp() {
        statsFrame = new JFrame("Tournament Statistics");
        statsFrame.setLayout(null);
        statsFrame.getContentPane().setLayout(new BorderLayout());
        statsFrame.setSize(300, 200);
        statsFrame.setLocation(1000, 100);

        JPanel statsPanel = new JPanel();
        statsPanel.setLayout(new BoxLayout(statsPanel, BoxLayout.Y_AXIS));
        statsPanel.setBackground(Color.cyan);
        statsPanel.setEnabled(true);
        statsPanel.setSize(300, 200);

        String val = "Game value currently: " + value;
        String prevO =  prevOfferor + " previously doubled game points.";
        String bTotal = "black total points: " + blackPoints;
        String wTotal = "white total points: " + whitePoints;

        JLabel valLabel = new JLabel(val);
        JLabel prevOLabel = new JLabel(prevO);
        JLabel bTotLabel = new JLabel(bTotal);
        JLabel wTotLabel = new JLabel(wTotal);

        String turns = "Turn number: " + turn;
        JLabel turnsLabel = new JLabel(turns);

        String gameNum = "Game number: " + game;
        JLabel gameNumLabel = new JLabel(gameNum);


        statsPanel.add(valLabel);
        statsPanel.add(prevOLabel);
        statsPanel.add(bTotLabel);
        statsPanel.add(wTotLabel);
        statsPanel.add(turnsLabel);
        statsPanel.add(gameNumLabel);

        statsFrame.add(statsPanel);

    }


    // MODIFIES: model
    // EFFECTS: sets up the components of the backgammon board (not pieces or specific triangles)
    void bigBoardSetUp() {
        bigBoard = new JPanel();
        bigBoard.setLayout(null);
        bigBoard.add(leftBoard);
        bigBoard.add(barBoard);
        bigBoard.add(rightBoard);
        for (int i = 0; i < triArray.length; i++) {
            bigBoard.add(triArray[i]);
        }
        bigBoard.setOpaque(true);
    }


    // MODIFIES: model
    // EFFECTS: clears the board - used to give impression of movement
    void clearBoard() {
        for (Triangle t: board.getTriangleList()) {
            int triNum = t.getPosition();
            JPanel wantedTri = triMap.get(triNum);
            wantedTri.removeAll();
            wantedTri.revalidate();
            wantedTri.repaint();
        }
        rightBoard.removeAll();
        rightBoard.revalidate();
        rightBoard.repaint();

        leftBoard.removeAll();
        leftBoard.revalidate();
        leftBoard.repaint();

        barBoard.removeAll();
        barBoard.revalidate();
        barBoard.repaint();
    }

    // modifies: model
    // effects: sets pieces onto the board
    void piecesSetUp() {
        for (Triangle t: board.getTriangleList()) {
            int triNum = t.getPosition();
            JPanel wantedTri = triMap.get(triNum);
            for (Piece p: t.getPieces()) {
                char color = p.getColor().charAt(0);
                int number = p.getNumber();
                String id = color + ":" + number;
                JLabel pieceLabel = new JLabel(id);
                wantedTri.add(pieceLabel);
            }
        }

        for (Piece p: board.getTheBar().getBlackPieces()) {

            int number = p.getNumber();
            String id = "b:" + number;
            JLabel pieceLabel = new JLabel(id);
            barBoard.add(pieceLabel);
        }

        for (Piece p: board.getTheBar().getWhitePieces()) {
            int number = p.getNumber();
            String id = "w:" + number;
            JLabel pieceLabel = new JLabel(id);
            barBoard.add(pieceLabel);
        }

        for (Piece p: board.getTheOffBoard().getWhitePieces()) {
            int number = p.getNumber();
            String id = "w:" + number;
            JLabel pieceLabel = new JLabel(id);
            leftBoard.add(pieceLabel);
        }

        for (Piece p: board.getTheOffBoard().getBlackPieces()) {
            int number = p.getNumber();
            String id = "b:" + number;
            JLabel pieceLabel = new JLabel(id);
            rightBoard.add(pieceLabel);
        }
    }


    String getPieceNumber() {
        return pieceNumber;
    }

    String getPositionNumber() {
        return positionNumber; }


    String getColor() {
        return color;
    }

    int getValue() {
        return value;
    }

    JFrame getFrame() {return frame;}

    JFrame getDiceFrame() {return diceFrame;}

    JFrame getStatsFrame() {return statsFrame;}

    JPanel getBigBoard() {return bigBoard;}

    void createBoard() {
        turn = 0;
        value = 1;
        game++;
        board.setBlackPieces(new HashSet<>(Arrays.asList(blackPiece1, blackPiece2, blackPiece3, blackPiece4,
                blackPiece5, blackPiece6, blackPiece7, blackPiece8, blackPiece9, blackPiece10, blackPiece11,
                blackPiece12, blackPiece13, blackPiece14, blackPiece15)));
        board.setWhitePieces(new HashSet<>(Arrays.asList(whitePiece1, whitePiece2, whitePiece3, whitePiece4,
                whitePiece5, whitePiece6, whitePiece7, whitePiece8, whitePiece9, whitePiece10, whitePiece11,
                whitePiece12, whitePiece13, whitePiece14, whitePiece15)));
        board.setBlackHome(new HashSet<>(Arrays.asList(triangle6, triangle5, triangle4,
                triangle3, triangle2, triangle1)));
        board.setWhiteHome(new HashSet<>(Arrays.asList(triangle19,
                triangle20, triangle21, triangle22, triangle23, triangle24)));
        board.setTriangleList(new ArrayList<>(Arrays.asList(triangle1, triangle2, triangle3, triangle4, triangle5,
                triangle6, triangle7, triangle8, triangle9, triangle10, triangle11, triangle12, triangle13,
                triangle14, triangle15, triangle16, triangle17, triangle18, triangle19, triangle20, triangle21,
                triangle22, triangle23, triangle24)));

        whitePiece11.setHomeStatus(true);
        whitePiece12.setHomeStatus(true);
        whitePiece13.setHomeStatus(true);
        whitePiece14.setHomeStatus(true);
        whitePiece15.setHomeStatus(true);

        blackPiece11.setHomeStatus(true);
        blackPiece12.setHomeStatus(true);
        blackPiece13.setHomeStatus(true);
        blackPiece14.setHomeStatus(true);
        blackPiece15.setHomeStatus(true);

    }

    // Modifies: dice, players' turn.
    // EFFECTS: produces 2 dice (i.e. randomly selects 2 numbers, each btw 1 and 6), cycles players turn
    void rollDie() {
        if (turn%2 == 0) {
            color = "black";
        } else if (turn%2 == 1) {
            color = "white";
        }
        diceList = Dice.getRandomIntegerBetweenRange(1, 6);
        numMoves = diceList.size();
        turn++;
    }


    // MODIFIES: board, piece
    // EFFECT: moves piece to indicated position, unless such move would conflict w/ rules of game
    void movePiece() {
        if (numMoves > 0) {

            int pieceNumber = Integer.parseInt(getPieceNumber());
            int positionNumber;

            try {
                Piece chosenPiece = board.getPiece(color, pieceNumber);
                int distance = Integer.parseInt(getPositionNumber());
                if (color == "white") {
                    positionNumber = chosenPiece.getPlace().getPosition() + distance;
                    if (positionNumber > 25) {
                        positionNumber = 25;
                    }

                } else {
                    if (chosenPiece.getPlace().getPosition() == 0) {
                        positionNumber = 25 - distance;
                    } else {
                    positionNumber = chosenPiece.getPlace().getPosition() - distance;
                    if (positionNumber < 1) {
                        positionNumber = 25;
                    }
                    }
                }

                if (positionNumber < 25) {
                        try {
                            if (diceList.contains(distance)) {
                                board.movePiece(chosenPiece, board.getTriangle(positionNumber));
                                diceList.remove(Integer.valueOf(distance));
                                numMoves--;
                                JOptionPane.showMessageDialog(null, color
                                        + "piece " + pieceNumber +
                                        " moved to position " + positionNumber);
                            } else {
                                JOptionPane.showMessageDialog(null, "Move does not correspond to dice: " + diceList);

                            }
                        } catch (BlockedMove | PieceOnBarException | NoSuchTriangleNumber e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }

                    } if (positionNumber >= 25) {
                        try {
                            if (diceList.contains(distance)) {
                                board.movePieceOffBoard(chosenPiece);
                                diceList.remove(Integer.valueOf(distance));
                                numMoves--;
                                JOptionPane.showMessageDialog(null, color
                                        + "piece " + pieceNumber +
                                        " successfully moved off the board");
                                if (board.win(chosenPiece)) {
                                    if (color == "white") {
                                        whitePoints += value;
                                    } else {
                                        blackPoints += value;
                                    }
                                    JOptionPane.showMessageDialog(null, color +
                                            " has won the game worth " + value + " point(s)");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Move does not correspond to dice: " + diceList);
                            }

                        } catch (InvalidOffBoardRequest e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
            } catch (NoSuchPieceNumber e) {
            }
        } JOptionPane.showMessageDialog(null, color + " has " + numMoves + " moves remaining: " + diceList);
        if (numMoves == 0) {
            JOptionPane.showMessageDialog(null, "out of turns.");
            diceFrame.dispose();
        }
    }


    void skipTurn() {
        turn++;
        if (turn%2 == 0) {
            color = "black";
        } else if (turn%2 == 1) {
            color = "white";
        }

    }



    void moveRecomm() {}

    void doubleGame() {
        if (prevOfferor == color) {
            JOptionPane.showMessageDialog(null, "Player cannot make two/more consecutive " +
                    "offers to double game's value.");
        } else {
        value = value*2;
        prevOfferor = color;}
    }

    void setPieceNumber(String pieceNumber) {
        this.pieceNumber = pieceNumber;
    }

    void setPositionNumber(String positionNumber) {
        this.positionNumber = positionNumber;
    }

    List<Integer> getDiceList() {
        return diceList;
    }


}
