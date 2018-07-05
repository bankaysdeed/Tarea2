package ejecutador;
import java.util.Arrays;
import java.util.List;
import paquete.Empleado;
import paquete.Proyecto;

public class JpaTest2 {
	private void crearProyetosDesdeUnEmpleado() {

		Empleado emp1 = manager.find(Empleado.class, new Long(1));
		
		Proyecto proy1 = new Proyecto("Market Place");
		Proyecto proy2 = new Proyecto("e-commerce");
		
		List<Proyecto> proyectos = Arrays.asList(proy1,proy2);
		
		emp1.setProyectos(proyectos);
		manager.persist(emp1);
		
	}

}
