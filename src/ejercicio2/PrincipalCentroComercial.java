package ejercicio2;

import dto.CentroComercialDTO;
import interfaces.ICentrocomercial;
import service.CentroImple;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PrincipalCentroComercial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc = "1";
        ICentrocomercial repo = new CentroImple();
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Menu \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar  \n 5. Salir \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Id cc: ");
                    Integer id = s.nextInt();
                    System.out.println("Nombre cc: ");
                    String nom = s.next();
                    System.out.println("direccion cc: ");
                    String cat = s.next();
                    System.out.println("ciudad cc: ");
                    String ca = s.next();
                    repo.save(new CentroComercialDTO(id,nom, cat, ca ));
                    break;
                }
                case "2": {
                    List<CentroComercialDTO> productos = repo.findAll();
                    if(!productos.isEmpty()){
                        productos.forEach(System.out::println);
                    }else{
                        System.out.println("No hay registros");
                    }
                    break;
                }
                case "3": {
                    System.out.println("===== editar ====");
                    System.out.print("id cc: ");
                    Integer idp = s.nextInt();
                    System.out.print("ingrese nombre: ");
                    String nom = s.next();
                    System.out.print("ingrese direccion: ");
                    String cat = s.next();
                    System.out.print("ingrese ciudad: ");
                    String ca = s.next();
                    CentroComercialDTO beaActualizar = new CentroComercialDTO(idp, nom, cat, ca);
                    repo.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== eliminar ======");
                    System.out.print("ingrese id del registro: ");
                    Integer id = s.nextInt();
                    repo.delete(repo.findById(id));
                    repo.findAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    opc = "5";
                    break;
                }
            }
        } while (opc !="5");
}
}