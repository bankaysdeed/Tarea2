package paquete;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_PROYECTO")
public class Proyecto {
	
	@Id
	@GeneratedValue
	@Column(name = "PROY_ID")
	private Long id;
	private String nombre;
	
	@ManyToMany
	private Collection<Empleado> empleados;
	public Proyecto(){}
	public Proyecto(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	@ManyToMany(mappedBy="proyectos")
	private Collection<Empleado> empleado;

	}

