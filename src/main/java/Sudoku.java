import com.murcia.utils.*;

public class Sudoku {
    private Tablero tablero;
    enum EstadoJuego {EN_CURSO, COMPLETADO, INVALIDO};
    private EstadoJuego estado;
    private ColaEnlazadaDoble<Jugada> colaJugadas = new ColaEnlazadaDoble<>();

    public Sudoku() {
        tablero = new Tablero();
    }

    public void iniciarNuevoJuego() {
        clrscr();
        String jugada = "";
        do {
            clrscr();
            System.out.print(tablero);
            do {
                jugada = Input.nextLine("\nJugada --> fila,columna,valor ('*'=FIN): ");
                if (jugada.equals("*")) break;
            } while (!jugada.matches("^[0-8],\\s*[0-8],\\s*[1-9]$"));
            if (jugada.equals("*")) break;
            String[] partes = jugada.split(",\\s*");
            int [] numeros = new int[partes.length];
            for (int i = 0; i < partes.length; i++)
                numeros[i] = Integer.parseInt(partes[i]);
            
            if (tablero.esMovimientoValido(numeros[0], numeros[1], numeros[2])) {
                tablero.asignarValor(numeros[0], numeros[1], numeros[2]);
                colaJugadas.encolar(new Jugada(numeros[0], numeros[1], numeros[2]));
            }
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
    public static void clrscr() {
        for (int i = 0; i < 20; i++)
            System.out.println();
    }
}