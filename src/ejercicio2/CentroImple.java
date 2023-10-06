package ejercicio2;

import dto.CentroComercialDTO;
import interfaces.ICentrocomercial;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CentroImple implements ICentrocomercial {
    private List<CentroComercialDTO> centros;

    public CentroImple() throws IOException, ClassNotFoundException {
        centros = new ArrayList<>();
    }

    @Override
    public CentroComercialDTO findById(int id) {
        return centros.stream()
                .filter(centro -> centro.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<CentroComercialDTO> findAll() throws IOException, ClassNotFoundException {
        centros = (List<CentroComercialDTO>) ObjectSerializer.readObjectFromFile("centros.ax");
        return centros;
    }

    @Override
    public void save(CentroComercialDTO centro) throws IOException {
        centros.add(centro);
        ObjectSerializer.writeObjectToFile(centros, "centros.ax");
    }

    @Override
    public void update(CentroComercialDTO centro) throws IOException {
        CentroComercialDTO oldcentro = findById(centro.getId());
        if (oldcentro != null) {
            centros.remove(oldcentro);
            centros.add(centro);
            ObjectSerializer.writeObjectToFile(centros, "centros.ax");
        }
    }

    @Override
    public void delete(CentroComercialDTO centro) throws IOException {
        centros.remove(centro);
        ObjectSerializer.writeObjectToFile(centros, "centros.ax");
}
}