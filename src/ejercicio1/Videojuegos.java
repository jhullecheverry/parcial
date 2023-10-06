 enum VideoJuegos {
    DEPORTIVOS("fifa","control","2023"){
        @Override
        public String mostrarPosicionRanking() {
            return "juego #1 en deportes";
        }

        @Override
        public String comprarMonedas() {
            return "$5000 pesos 100 monedas";
        }
    },
    ESTRATEGIA("ajedrez","moviendofichas","1934"){
        @Override
        public String mostrarPosicionRanking() {
            return "juego mas famoso de la antiguedad";
        }

        @Override
        public String comprarMonedas() {
            return "Apuestaa a jugadores";
        }
    },
    MUSICALES("guitarhero","guitarra","2000"){
        @Override
        public String mostrarPosicionRanking() {
            return "#2 en juegos musicales retro";
        }

        @Override
        public String comprarMonedas() {
            return "$3000 pesos 20 monedas";
        }
    },
    AVENTURA("ratchetyclank","control","2014"){
        @Override
        public String mostrarPosicionRanking() {
            return "#5 en juegos de mundo abierto";
        }

        @Override
        public String comprarMonedas() {
            return "$10000 pesos 200 monedas";
        }
    },
    SIMULACION("bussimulator","controles","2019"){
        @Override
        public String mostrarPosicionRanking() {
            return "#10 en simulacion";
        }

        @Override
        public String comprarMonedas() {
            return "$40000 pesos 1200 monedas";
        }
    };

    private String nombrejuego;
    private String comojugar;
    private String añodecreacion;

    public String getNombrejuego() {
        return nombrejuego;
    }

    public void setNombrejuego(String nombrejuego) {
        this.nombrejuego = nombrejuego;
    }

    public String getComojugar() {
        return comojugar;
    }

    public void setComojugar(String comojugar) {
        this.comojugar = comojugar;
    }

    public String getAñodecreacion() {
        return añodecreacion;
    }

    public void setAñodecreacion(String añodecreacion) {
        this.añodecreacion = añodecreacion;
    }

    VideoJuegos(String nombrejuego, String comojugar, String añodecreacion) {
        this.nombrejuego = nombrejuego;
        this.comojugar = comojugar;
        this.añodecreacion = añodecreacion;

    }
    public abstract String mostrarPosicionRanking();
    public abstract String comprarMonedas();
}



