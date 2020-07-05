package gui;

public class BackgammonApp {

    public static void main(String[] args) {
        Model m = new Model( "pieceNumber", "diceNumber");
        View v = new View ("BackGammon Command Centre");
        Controller c = new Controller(m, v);
        c.initController();

    }

}
