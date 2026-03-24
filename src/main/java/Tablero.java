import com.murcia.utils.*;

public class Tablero {
    private Celda[][] celdas;
    private Zona[] zonas;  // 9 zonas

    Tablero() {
        celdas = new Celda[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                celdas[i][j] = new Celda();
    }
    public void inicializar() {}
    public Celda obtenerCelda(int fila, int columna) {
        return celdas[fila][columna];
    }
    public void asignarValor(int fila, int columna, int valor) {
        celdas[fila][columna] = new Celda((char)(valor+'0'));
    }
    public boolean esMovimientoValido(int fila, int columna, int valor) {
        return true;
    }
    public ColaEnlazada<Celda> obtenerFila(int fila) {
        return null;
    }
    public ColaEnlazada<Celda> obtenerColumna(int columna) {
        return null;        
    }
    public Zona obtenerZona(int indiceZona) {
        return new Zona();
    }
    public boolean validarTablero() {
        return true;
    }
    public String toString() {
        String str = "  0 1 2 3 4 5 6 7 8\n";
        for (int i = 0; i < 9; i++) {
            str += i + " ";
            for (int j = 0; j < 9; j++)
                str += celdas[i][j] + (j < 8 ? " " : "\n");
        }
        return str;
    }
}
