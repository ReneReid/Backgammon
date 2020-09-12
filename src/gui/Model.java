package gui;

import model.*;
import model.exceptions.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;


public class Model {

    HashMap<Integer, JPanel> triMap = new HashMap<Integer, JPanel>();

    private int turn;
    private int value;
    //private Scanner input;
    private String color = "white";
    private String prevOfferor = "none";
    private int blackPoints = 0;
    private int whitePoints = 0;

    private List<Integer> diceList;
    private int numMoves;

    private String pieceNumber;
    private String positionNumber;

    //TODO: collapse statements into one using a for loop
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

    private JPanel tri1;
    private JPanel tri2;
    private JPanel tri3;
    private JPanel tri4;
    private JPanel tri5;
    private JPanel tri6;
    private JPanel tri7;
    private JPanel tri8;
    private JPanel tri9;
    private JPanel tri10;
    private JPanel tri11;
    private JPanel tri12;
    private JPanel tri13;
    private JPanel tri14;
    private JPanel tri15;
    private JPanel tri16;
    private JPanel tri17;
    private JPanel tri18;
    private JPanel tri19;
    private JPanel tri20;
    private JPanel tri21;
    private JPanel tri22;
    private JPanel tri23;
    private JPanel tri24;

    private Board board = new Board();

    public Model(String pieceNumber, String positionNumber) {
        this.pieceNumber = pieceNumber;
        this.positionNumber = positionNumber;
        triPanel1SetUp();
        triPanel2SetUp();
        triPanel3SetUp();
        triPanel4SetUp();
        triPanel5SetUp();
        triPanel6SetUp();
        triPanel7SetUp();
        triPanel8SetUp();
        triPanel9SetUp();
        triPanel10SetUp();
        triPanel11SetUp();
        triPanel12SetUp();
        triPanel13SetUp();
        triPanel14SetUp();
        triPanel15SetUp();
        triPanel16SetUp();
        triPanel17SetUp();
        triPanel18SetUp();
        triPanel19SetUp();
        triPanel20SetUp();
        triPanel21SetUp();
        triPanel22SetUp();
        triPanel23SetUp();
        triPanel24SetUp();
        leftBoardSetUp();
        barBoardSetUp();
        rightBoardSetUp();
        bigBoardSetUp();
        frameSetUp();

    }

 /*   private void init() {

        board = new Board();
        //turn = 1;
        //value = 1;
    }*/

    //TODO: can abstract out common code within triPanelSetUp, creating helper functions. Use the triMap data structure
    // will be able to collapse 24 statements into one (hopefully).
    public void triPanel12SetUp() {
        tri12 = new JPanel();
        tri12.setLayout(new BoxLayout(tri12, BoxLayout.Y_AXIS));
        tri12.setBackground(Color.lightGray);
        tri12.setEnabled(true);
        tri12.setSize(new Dimension(50, 200));
        tri12.setLocation(10, 10);
        triMap.put(12, tri12);
    }

    public void triPanel13SetUp() {
        tri13 = new JPanel();
        tri13.setLayout(new BoxLayout(tri13, BoxLayout.Y_AXIS));
        tri13.setBackground(Color.orange);
        tri13.setEnabled(true);
        tri13.setSize(new Dimension(50, 200));
        tri13.setLocation(10, 510);
        triMap.put(13, tri13);
    }


    public void triPanel11SetUp() {
        tri11 = new JPanel();
        tri11.setLayout(new BoxLayout(tri11, BoxLayout.Y_AXIS));
        tri11.setBackground(Color.orange);
        tri11.setEnabled(true);
        tri11.setSize(new Dimension(50, 200));
        tri11.setLocation(60, 10);
        triMap.put(11, tri11);
    }

    public void triPanel14SetUp() {
        tri14 = new JPanel();
        tri14.setLayout(new BoxLayout(tri14, BoxLayout.Y_AXIS));
        tri14.setBackground(Color.lightGray);
        tri14.setEnabled(true);
        tri14.setSize(new Dimension(50, 200));
        tri14.setLocation(60, 510);
        triMap.put(14, tri14);
    }

    public void triPanel10SetUp() {

        tri10 = new JPanel();
        tri10.setLayout(new BoxLayout(tri10, BoxLayout.Y_AXIS));
        tri10.setBackground(Color.lightGray);
        tri10.setEnabled(true);
        tri10.setSize(new Dimension(50, 200));
        tri10.setLocation(110, 10);
        triMap.put(10, tri10);
    }


    public void triPanel15SetUp() {

        tri15 = new JPanel();
        tri15.setLayout(new BoxLayout(tri15, BoxLayout.Y_AXIS));
        tri15.setBackground(Color.orange);
        tri15.setEnabled(true);
        tri15.setSize(new Dimension(50, 200));
        tri15.setLocation(110, 510);
        triMap.put(15, tri15);
    }

    public void triPanel9SetUp() {

        tri9 = new JPanel();
        tri9.setLayout(new BoxLayout(tri9, BoxLayout.Y_AXIS));
        tri9.setBackground(Color.orange);
        tri9.setEnabled(true);
        tri9.setSize(new Dimension(50, 200));
        tri9.setLocation(160, 10);
        triMap.put(9, tri9);
    }

    public void triPanel16SetUp() {

        tri16 = new JPanel();
        tri16.setLayout(new BoxLayout(tri16, BoxLayout.Y_AXIS));
        tri16.setBackground(Color.lightGray);
        tri16.setEnabled(true);
        tri16.setSize(new Dimension(50, 200));
        tri16.setLocation(160, 510);
        triMap.put(16, tri16);
    }


    public void triPanel8SetUp() {

        tri8 = new JPanel();
        tri8.setLayout(new BoxLayout(tri8, BoxLayout.Y_AXIS));
        tri8.setBackground(Color.lightGray);
        tri8.setEnabled(true);
        tri8.setSize(new Dimension(50, 200));
        tri8.setLocation(210, 10);
        triMap.put(8, tri8);
    }

    public void triPanel17SetUp() {

        tri17 = new JPanel();
        tri17.setLayout(new BoxLayout(tri17, BoxLayout.Y_AXIS));
        tri17.setBackground(Color.orange);
        tri17.setEnabled(true);
        tri17.setSize(new Dimension(50, 200));
        tri17.setLocation(210, 510);
        triMap.put(17, tri17);
    }


    public void triPanel7SetUp() {

        tri7 = new JPanel();
        tri7.setLayout(new BoxLayout(tri7, BoxLayout.Y_AXIS));
        tri7.setBackground(Color.orange);
        tri7.setEnabled(true);
        tri7.setSize(new Dimension(50, 200));
        tri7.setLocation(260, 10);
        triMap.put(7, tri7);
    }


    public void triPanel18SetUp() {

        tri18 = new JPanel();
        tri18.setLayout(new BoxLayout(tri18, BoxLayout.Y_AXIS));
        tri18.setBackground(Color.lightGray);
        tri18.setEnabled(true);
        tri18.setSize(new Dimension(50, 200));
        tri18.setLocation(260, 510);
        triMap.put(18, tri18);
    }


    public void triPanel6SetUp() {

        tri6 = new JPanel();
        tri6.setLayout(new BoxLayout(tri6, BoxLayout.Y_AXIS));
        tri6.setBackground(Color.lightGray);
        tri6.setEnabled(true);
        tri6.setSize(new Dimension(50, 200));
        tri6.setLocation(410, 10);
        triMap.put(6, tri6);
    }


    public void triPanel19SetUp() {

        tri19 = new JPanel();
        tri19.setLayout(new BoxLayout(tri19, BoxLayout.Y_AXIS));
        tri19.setBackground(Color.orange);
        tri19.setEnabled(true);
        tri19.setSize(new Dimension(50, 200));
        tri19.setLocation(410, 510);
        triMap.put(19, tri19);
    }

    public void triPanel5SetUp() {

        tri5 = new JPanel();
        tri5.setLayout(new BoxLayout(tri5, BoxLayout.Y_AXIS));
        tri5.setBackground(Color.orange);
        tri5.setEnabled(true);
        tri5.setSize(new Dimension(50, 200));
        tri5.setLocation(460, 10);
        triMap.put(5, tri5);
    }

    public void triPanel20SetUp() {

        tri20 = new JPanel();
        tri20.setLayout(new BoxLayout(tri20, BoxLayout.Y_AXIS));
        tri20.setBackground(Color.lightGray);
        tri20.setEnabled(true);
        tri20.setSize(new Dimension(50, 200));
        tri20.setLocation(460, 510);
        triMap.put(20, tri20);
    }

    public void triPanel4SetUp() {

        tri4 = new JPanel();
        tri4.setLayout(new BoxLayout(tri4, BoxLayout.Y_AXIS));
        tri4.setBackground(Color.lightGray);
        tri4.setEnabled(true);
        tri4.setSize(new Dimension(50, 200));
        tri4.setLocation(510, 10);
        triMap.put(4, tri4);
    }

    public void triPanel21SetUp() {

        tri21 = new JPanel();
        tri21.setLayout(new BoxLayout(tri21, BoxLayout.Y_AXIS));
        tri21.setBackground(Color.orange);
        tri21.setEnabled(true);
        tri21.setSize(new Dimension(50, 200));
        tri21.setLocation(510, 510);
        triMap.put(21, tri21);
    }

    public void triPanel3SetUp() {

        tri3 = new JPanel();
        tri3.setLayout(new BoxLayout(tri3, BoxLayout.Y_AXIS));
        tri3.setBackground(Color.orange);
        tri3.setEnabled(true);
        tri3.setSize(new Dimension(50, 200));
        tri3.setLocation(560, 10);
        triMap.put(3, tri3);
    }

    public void triPanel22SetUp() {

        tri22 = new JPanel();
        tri22.setLayout(new BoxLayout(tri22, BoxLayout.Y_AXIS));
        tri22.setBackground(Color.lightGray);
        tri22.setEnabled(true);
        tri22.setSize(new Dimension(50, 200));
        tri22.setLocation(560, 510);
        triMap.put(22, tri22);
    }


    public void triPanel2SetUp() {

        tri2 = new JPanel();
        tri2.setLayout(new BoxLayout(tri2, BoxLayout.Y_AXIS));
        tri2.setBackground(Color.lightGray);
        tri2.setEnabled(true);
        tri2.setSize(new Dimension(50, 200));
        tri2.setLocation(610, 10);
        triMap.put(2, tri2);
    }


    public void triPanel23SetUp() {

        tri23 = new JPanel();
        tri23.setLayout(new BoxLayout(tri23, BoxLayout.Y_AXIS));
        tri23.setBackground(Color.orange);
        tri23.setEnabled(true);
        tri23.setSize(new Dimension(50, 200));
        tri23.setLocation(610, 510);
        triMap.put(23, tri23);
    }

    public void triPanel1SetUp() {

        tri1 = new JPanel();
        tri1.setLayout(new BoxLayout(tri1, BoxLayout.Y_AXIS));
        tri1.setBackground(Color.orange);
        tri1.setEnabled(true);
        tri1.setSize(new Dimension(50, 200));
        tri1.setLocation(660, 10);
        triMap.put(1, tri1);
    }

    public void triPanel24SetUp() {

        tri24 = new JPanel();
        tri24.setLayout(new BoxLayout(tri24, BoxLayout.Y_AXIS));
        tri24.setBackground(Color.lightGray);
        tri24.setEnabled(true);
        tri24.setSize(new Dimension(50, 200));
        tri24.setLocation(660, 510);
        triMap.put(24, tri24);
    }


    public void leftBoardSetUp() {
        leftBoard = new JPanel();
        leftBoard.setLayout(new BoxLayout(leftBoard, BoxLayout.Y_AXIS));
        leftBoard.setBackground(Color.darkGray);
        leftBoard.setEnabled(true);
        leftBoard.setSize(new Dimension(300, 300));
        leftBoard.setLocation(10, 210);
        //String id = getColor() + "'s turn" +  " Dice: " + getDiceList();
        //JLabel diceLabel = new JLabel(id);
        //leftBoard.add(diceLabel);
        //return leftBoard;
    }

    public void barBoardSetUp() {
        barBoard = new JPanel();
        barBoard.setLayout(new BoxLayout(barBoard, BoxLayout.Y_AXIS));
        barBoard.setBackground(Color.gray);
        barBoard.setEnabled(true);
        barBoard.setSize(new Dimension(100, 700));
        barBoard.setLocation(310, 10);
        //return barBoard;
    }

    public void rightBoardSetUp() {
        rightBoard = new JPanel();
        rightBoard.setLayout(new BoxLayout(rightBoard, BoxLayout.Y_AXIS));
        rightBoard.setBackground(Color.darkGray);
        rightBoard.setEnabled(true);
        rightBoard.setSize(new Dimension(300, 300));
        rightBoard.setLocation(410, 210);
    }


    public void frameSetUp() {
        frame = new JFrame("Backgammon Table");
        frame.setLayout(null);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLocation(500, 500);
    }

    public void diceFrameSetUp() {
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

    public void statsFrameSetUp() {
        statsFrame = new JFrame("Tournament Statistics");
        statsFrame.setLayout(null);
        statsFrame.getContentPane().setLayout(new BorderLayout());
        statsFrame.setSize(300, 100);
        statsFrame.setLocation(1000, 100);

        JPanel statsPanel = new JPanel();
        statsPanel.setLayout(new BoxLayout(statsPanel, BoxLayout.Y_AXIS));
        statsPanel.setBackground(Color.cyan);
        statsPanel.setEnabled(true);
        statsPanel.setSize(300, 100);
        String val = "Game value currently: " + value;
        String prevO =  prevOfferor + " previously doubled game points.";
        String bTotal = "Black's total points: " + blackPoints;
        String wTotal = "White's total points: " + whitePoints;
        JLabel valLabel = new JLabel(val);
        JLabel prevOLabel = new JLabel(prevO);
        JLabel bTotLabel = new JLabel(bTotal);
        JLabel wTotLabel = new JLabel(wTotal);
        statsPanel.add(valLabel);
        statsPanel.add(prevOLabel);
        statsPanel.add(bTotLabel);
        statsPanel.add(wTotLabel);
        statsFrame.add(statsPanel);

    }



// TODO: create a for/while loop for adding objects to the bigBoard. Collapse 24 statements into 1.
    public void bigBoardSetUp() {
        bigBoard = new JPanel();
        bigBoard.setLayout(null);
        bigBoard.add(leftBoard);
        bigBoard.add(barBoard);
        bigBoard.add(rightBoard);
        bigBoard.add(tri1);
        bigBoard.add(tri2);
        bigBoard.add(tri3);
        bigBoard.add(tri4);
        bigBoard.add(tri5);
        bigBoard.add(tri6);
        bigBoard.add(tri19);
        bigBoard.add(tri20);
        bigBoard.add(tri21);
        bigBoard.add(tri22);
        bigBoard.add(tri23);
        bigBoard.add(tri24);
        bigBoard.add(tri7);
        bigBoard.add(tri8);
        bigBoard.add(tri9);
        bigBoard.add(tri10);
        bigBoard.add(tri11);
        bigBoard.add(tri12);
        bigBoard.add(tri13);
        bigBoard.add(tri14);
        bigBoard.add(tri15);
        bigBoard.add(tri16);
        bigBoard.add(tri17);
        bigBoard.add(tri18);
        bigBoard.setOpaque(true);
    }

    public void clearBoard() {
        for (Triangle t: board.getTriangleList()) {
            int triNum = t.getPosition();
            JPanel wantedTri = triMap.get(triNum);
            wantedTri.removeAll();
            wantedTri.revalidate();
            wantedTri.repaint();
        }

        barBoard.removeAll();
        barBoard.revalidate();
        barBoard.repaint();
    }


    public void piecesSetUp() {
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


    public Board getBoard() {return board;}

    public String getPieceNumber() {
        return pieceNumber;
    }

    public String getPositionNumber() {
        return positionNumber; }


    public String getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }

    public JFrame getFrame() {return frame;}

    public JFrame getDiceFrame() {return diceFrame;}

    public JFrame getStatsFrame() {return statsFrame;}

    public JPanel getLeftBoard() {return leftBoard;}

    public JPanel getBarBoard() {return barBoard;}

    public JPanel getRightBoard() {return rightBoard;}

    public JPanel getBigBoard() {return bigBoard;}




    public void createBoard() {
        turn = 1;
        value = 1;
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

    }


    public void rollDie() {
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
    // EFFECT: moves piece to position
    public void movePiece() {
        if (numMoves > 0) {

            int pieceNumber = Integer.parseInt(getPieceNumber());
            int positionNumber;
            try {
                Piece chosenPiece = board.getPiece(color, pieceNumber);

                int distance = Integer.parseInt(getPositionNumber());

                if (color == "white") {
                    positionNumber = chosenPiece.getPlace().getPosition() + distance;

                } else {
                    if (chosenPiece.getPlace().getPosition() == 0) {
                        positionNumber = 25 - distance;
                    } else {
                    positionNumber = chosenPiece.getPlace().getPosition() - distance;
                    }
                }

                if (!diceList.contains(distance)) {

                    JOptionPane.showMessageDialog(null, "Move does not correspond to dice: " + diceList);
                } if (positionNumber < 25) {
                        try {
                            if (diceList.contains(distance)) {
                                board.movePiece(chosenPiece, board.getTriangle(positionNumber));
                                diceList.remove(Integer.valueOf(distance));
                                numMoves--;
                                JOptionPane.showMessageDialog(null, color + "'s "
                                        + "piece " + pieceNumber +
                                        " moved to position " + positionNumber);
                            }

                        } catch (BlockedMove | PieceOnBarException | NoSuchTriangleNumber e) {

                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    } if (positionNumber == 25) {
                        try {
                            board.movePieceOffBoard(chosenPiece);
                            diceList.remove(Integer.valueOf(distance));
                            numMoves--;
                            if (board.win(chosenPiece)) {

                                if (color == "white") {
                                    whitePoints += value;
                                } else {
                                    blackPoints += value;
                                }

                                JOptionPane.showMessageDialog(null, color +
                                        " has won the game worth " + value + " point(s)");
                            }

                        } catch (InvalidOffBoardRequest e) {

                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }

                    }

            } catch (NoSuchPieceNumber e) {
                //TODO: print out exception message
                //JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } JOptionPane.showMessageDialog(null, color + " has " + numMoves + " moves remaining: " + diceList);
        if (numMoves == 0) {
            JOptionPane.showMessageDialog(null, "out of turns.");
            diceFrame.dispose();
            //turn++;

        }
    }


//TODO: convert this to "Statistics": current games value, previous offeror; tournament points
    public void skipTurn() {
        turn++;
        if (turn%2 == 0) {
            color = "black";
        } else if (turn%2 == 1) {
            color = "white";
        }

    }

/*    public void stats() {
        JOptionPane.showMessageDialog(null, "Game value currently " + value +
                "Previous Offeror: " + prevOfferor +
                "Black's total points: " + blackPoints +
                "White's total" + whitePoints);

    }*/

    public void moveRecomm() {}

    public void doubleGame() {
        if (prevOfferor == color) {
            JOptionPane.showMessageDialog(null, "Player cannot make two/more consecutive " +
                    "offers to double game's value.");
        } else {
        value = value*2;
        prevOfferor = color;}
    }

    public void setPieceNumber(String pieceNumber) {
        this.pieceNumber = pieceNumber;
    }

    public void setPositionNumber(String positionNumber) {
        this.positionNumber = positionNumber;
    }

    public List<Integer> getDiceList() {
        return diceList;
    }



}
