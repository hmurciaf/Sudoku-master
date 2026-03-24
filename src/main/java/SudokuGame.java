import com.murcia.utils.*;

public class SudokuGame {
    private static ColaEnlazada<Sudoku> partidas;

    public static void main(String args[]) {
        final char SALIR = '6';
        String []opt = {"1. Nueva partida", "2. Cargar partida", "3. Top Ten",
            "4. Partidas jugadas", "5. Jugadores", "6. Terminar"};
        Menu mnu = new Menu(opt, 'V', " ", "GAME S U D O K U");
        char opc;

        do {
            Consola.clrscr(); // Borra pantalla
            Consola.gotoxy(0, 0);
            opc = mnu.select("Su opción [1-6]: ");
            if (opc == '1') newGame();
            if (opc == '2') loadGame();
            if (opc == '3') topten();
            if (opc == '4') gamesPlayed();
            if (opc == '5') gamers();
        } while (opc != SALIR);
    }
    public static void newGame() {
        if (partidas == null) 
            partidas = new ColaEnlazada<Sudoku>();
        Sudoku sudo = new Sudoku();
        sudo.iniciarNuevoJuego();
    }
    public static void loadGame() {
    
    }
    public static void topten() {
    
    }
    public static void gamesPlayed() {
    
    }
    public static void gamers() {
    
    }
}
