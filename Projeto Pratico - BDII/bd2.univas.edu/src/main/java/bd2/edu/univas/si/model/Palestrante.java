package bd2.edu.univas.si.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name="PALESTRANTE")
public class Palestrante implements Serializable {

		@Id
	@Column(name="REGISTRO")
	private Integer registry;
	
	@Column(name="CPF")
	private String cpfreg;
	
	@Column(name="NOME")
	private String name;
	
	@Column(name="TEMA")
	private String title;
	
	@Column(name="HORARIO")
	private String time;
	
	@Column(name="DATA")
	@Temporal(TemporalType.DATE)
	private Date start;
	public String getCpfreg() {
		return cpfreg;
	}

	public void setCpfreg(String cpfreg) {
		this.cpfreg = cpfreg;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}


	
	public Palestrante() {
	}

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
		return "Manager [title=\" + title + \",cpfreg=" + cpfreg + ",title=\" + title + \",registry=" + registry + ", name=" + name + ", start=" + start + "]";
	}
	
}
