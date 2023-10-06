public class VideojuegosMain {
    public static void main(String[] args) {

        VideoJuegos juegoDeportivo = VideoJuegos.DEPORTIVOS;
        VideoJuegos juegoEstrategia = VideoJuegos.ESTRATEGIA;


        System.out.println("Juego Deportivo:");
        System.out.println("Nombre: " + juegoDeportivo.getNombrejuego());
        System.out.println("Cómo jugar: " + juegoDeportivo.getComojugar());
        System.out.println("Año de creación: " + juegoDeportivo.getAñodecreacion());
        System.out.println("Posición en el ranking: " + juegoDeportivo.mostrarPosicionRanking());
        System.out.println("Comprar monedas: " + juegoDeportivo.comprarMonedas());

        System.out.println("\nJuego de Estrategia:");
        System.out.println("Nombre: " + juegoEstrategia.getNombrejuego());
        System.out.println("Cómo jugar: " + juegoEstrategia.getComojugar());
        System.out.println("Año de creación: " + juegoEstrategia.getAñodecreacion());
        System.out.println("Posición en el ranking: " + juegoEstrategia.mostrarPosicionRanking());
        System.out.println("Comprar monedas: " + juegoEstrategia.comprarMonedas());
    }
}