package bd2.edu.univas.si.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EVENTO")
public class Evento {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EventoSeqGen")
	@SequenceGenerator(name="EventoSeqGen", sequenceName="SEQ_Evento", allocationSize=1)
	private Integer registro;


	
  @Id
	@Column(name="REGISTRO")
	private Integer registry;
	
	@Column(name="NOME")
	private String name;
	
	@Column(name="DATA")
	@Temporal(TemporalType.DATE)
	private Date start;
	
	@Column(name="LOCAL")
	private String local;
	
	public Integer getRegistry() {
		return registry;
	}

	public void setRegistry(Integer registry) {
		this.registry = registry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	@Override
	public String toString() {
		return "Manager [registry=" + registry + ", name=" + name + ", local=" + local + ", start=" + start + "]";
	}
	
}
