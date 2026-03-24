import com.murcia.utils.*;

public class Sudoku {
    private Tablero tablero;
    enum EstadoJuego {EN_CURSO, COMPLETADO, INVALIDO};
    private EstadoJuego estado;

    public Sudoku() {
        tablero = new Tablero();
    }

    public void iniciarNuevoJuego() {
        Consola.clrscr();
        String jugada = "";
        do {
            Consola.clrscr(); Consola.gotoxy(0, 0);
            System.out.print(tablero);
            do
                jugada = Input.nextLine("\nJugada --> fila,columna,valor: ");
            while (!jugada.matches("^[0-8],\\s*[0-8],\\s*[1-9]$"));

            String[] partes = jugada.split(",\\s*");
            int [] numeros = new int[partes.length];
            for (int i = 0; i < partes.length; i++)
                numeros[i] = Integer.parseInt(partes[i]);
            
            if (tablero.esMovimientoValido(numeros[0], numeros[1], numeros[2]))
                tablero.asignarValor(numeros[0], numeros[1], numeros[2]);
        } while (true);
    }

    public void cargarTablero(Tablero tablero) {
    
    }
    public boolean validarJuego() {
        return true;
    }

    public boolean estaCompleto() { return true; }

    public Tablero getTablero() { return tablero; }

    public String toString() {
        return "";
    }
}