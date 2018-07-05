package paquete;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_EMPLEADO")
public class Empleado {
	@Id
	@GeneratedValue
	@Column(name = "EM_COD")
	private Long codigo;
	
	private String nombre;
	
	public Empleado(){}
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}
	@ManyToMany
	private Collection<Proyecto> proyectos;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name = "tb_emp_x_proy",
	joinColumns= @JoinColumn(name = "EMPID",
	referencedColumnName = "EMP_ID"),
				inverseJoinColumns = @JoinColumn(name = "EMCOD",
				referencedColumnName="PROY_ID"))	
	}
