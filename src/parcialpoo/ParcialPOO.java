package parcialpoo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParcialPOO {
    public static void main(String[] args) {
        // Crear categorías
        Categoria categoriaJunior = new Categoria("Junior", 20000);
        Categoria categoriaSenior = new Categoria("Senior", 30000);

        // Crear puestos con complementos
        Puesto puestoDesarrollador = new Puesto("Desarrollador");
        puestoDesarrollador.agregarComplemento(new Complemento("Responsabilidades adicionales", 500.0));
        puestoDesarrollador.agregarComplemento(new Complemento("Habilidades especiales", 300.0));

        Puesto puestoAnalista = new Puesto("Analista");
        puestoAnalista.agregarComplemento(new Complemento("Responsabilidades adicionales", 700.0));


        Empleado empleado = new Empleado("12345678A", "Juan", "Pérez", "600123456", "Calle Falsa 123", "ES1234567890123456789012");

       
        Contrato contrato1 = new Contrato(new Date(), categoriaJunior, puestoDesarrollador); // Contrato activo
        Contrato contrato2 = new Contrato(new Date(), categoriaSenior, puestoAnalista); // Contrato activo

      
        empleado.agregarContrato(contrato1);
        empleado.agregarContrato(contrato2);

       
        empleado.agregarTrienio(new trienio("3 años", 1000.0));
        empleado.agregarTrienio(new trienio("6 años", 2000.0));

      
        List<deduccion> deducciones = new ArrayList<>();
        deducciones.add(new deduccionFija("Seguridad Social", 4.7));
        deducciones.add(new deduccionFija("Desempleo", 1.55));

        // Calcular el salario bruto, trienios y complementos
        double salarioBruto = empleado.getSueldoTotal();
        double trienios = empleado.calcularTotalTrienios();
        double complementos = empleado.getContratosActivos().stream()
                .mapToDouble(Contrato::getComplementoSalarial)
                .sum();

    
        Nomina nomina = new Nomina(salarioBruto, trienios, complementos, deducciones);

        
        nomina.mostrarDetalles();

       
        SistemaGestionEmpleados sistema = new SistemaGestionEmpleados();
        sistema.almacenarNomina(nomina);

        // Mostrar todas las nóminas almacenadas
        sistema.mostrarNominas();

        
        sistema.eliminarNominasAntiguas();
    }
}