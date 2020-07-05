package ui;

import model.*;
import model.exceptions.*;

import java.util.*;


public class BackgammonApp {

    private int turn;
    private int value;
    private Board board;
    private Scanner input;
    private String color;

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


    public BackgammonApp() {
        runBackgammonApp();
    }

    private void runBackgammonApp() {
        boolean keepGoing = true;
        String command = null;
        input = new Scanner(System.in);
        init();


        while (keepGoing) {
            displayMenu();
            command = input.next();
            command = command.toLowerCase();

            if (command.equals("q")) {
                keepGoing = false;
            } else {
                processCommand(command);
            }

        }

        System.out.println("\n Exited.");

    }

    private void init() {
        board = new Board();
        input = new Scanner(System.in);
        turn = 1;
        value = 1;

    }

    private void displayMenu() {
        System.out.println("\n Select from:");
        System.out.println("\t1 -> new backgammon board");
        System.out.println("\t2 -> move pieces");
        System.out.println("\t3 -> get move recommendation");
        System.out.println("\t4 -> display board");
        System.out.println("\t5 -> double game value");
        System.out.println("\tq -> quit");


    }


    private void processCommand(String command) {
        if (command.equals("1")) {
            createNewBackgammonTable();
        } else if (command.equals("2")) {
            movePiece();
        } else if (command.equals("3")) {
            moveRecommendation();
        } else if (command.equals("4")) {
            displayBoard();
        } else if (command.equals("5")) {
            value = value*2;
            System.out.println("Game value doubled to " + value);
        } else {
            System.out.println("Command not valid.");
        }

    }


    private void createNewBackgammonTable() {
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

    private void movePiece() {
        if (turn%2 == 0) {
            color = "black";
        } else if (turn%2 == 1) {
            color = "white";
        }
        System.out.println(color + "'s move.");
        List<Integer> diceList = Dice.getRandomIntegerBetweenRange(1, 6);
        System.out.println("dice: " + diceList.get(0) + " " + diceList.get(1));
        int numMoves = diceList.size();
        while (numMoves > 0) {
            System.out.println("You have " + numMoves + " moves remaining.");
                try {
                    System.out.println("Type in the piece number (1 - 15) to move.");
                    int pieceNumber = Integer.parseInt(input.next());
                    System.out.println("Type in the position number (1 - 25) to move piece. Input 25 for offBoard.");
                    try {
                        int positionNumber = Integer.parseInt(input.next());
                        Piece chosenPiece = board.getPiece(color, pieceNumber);
                        int distance = Math.abs(chosenPiece.getPlace().getPosition() - positionNumber);
                        if (!diceList.contains(distance)) {
                            System.out.println("Move does not correspond to dice.");
                        }
                        if (positionNumber < 25) {
                            try {
                                board.movePiece(chosenPiece, board.getTriangle(positionNumber));
                                diceList.remove(Integer.valueOf(distance));
                                numMoves --;
                            } catch (BlockedMove | PieceOnBarException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        if (positionNumber == 25) {
                            try {
                                board.movePieceOffBoard(chosenPiece);
                                numMoves--;
                                if (board.win(chosenPiece)) {
                                    System.out.println(chosenPiece.getColor() + " has won the game");
                                }
                            } catch (InvalidOffBoardRequest e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    } catch (NoSuchTriangleNumber e) {
                        System.out.println(e.getMessage());
                    }
                } catch (NoSuchPieceNumber e) {
                    System.out.println(e.getMessage());
                }
            } turn++;

        }


        private void moveRecommendation(){
        }

        private void displayBoard () {
            for (Triangle t : board.getTriangleList()) {
                System.out.println("Triangle number: " + t.getPosition());
                for (Piece p : t.getPieces()) {
                    System.out.println("\tPiece color: " + p.getColor() + "   Piece number: " + p.getNumber());
                }
            }
            System.out.println("The Bar: ");
            for (Piece p : board.getTheBar().getBlackPieces()) {
                System.out.println("\tPiece color: " + p.getColor() + "   Piece number: " + p.getNumber());
            }
            for (Piece p : board.getTheBar().getWhitePieces()) {
                System.out.println("\tPiece color: " + p.getColor() + "   Piece number: " + p.getNumber());
            }
            System.out.println("The OffBoard: ");
            for (Piece p : board.getTheOffBoard().getBlackPieces()) {
                System.out.println("\tPiece color: " + p.getColor() + "   Piece number: " + p.getNumber());
            }
            for (Piece p : board.getTheOffBoard().getWhitePieces()) {
                System.out.println("\tPiece color: " + p.getColor() + "   Piece number: " + p.getNumber());
            }

        }


    }
