package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuariocl3 database table.
 * 
 */
@Entity
@Table(name="tbl_usuariocl3")
@NamedQuery(name="TblUsuariocl3.findAll", query="SELECT t FROM TblUsuariocl3 t")
public class TblUsuariocl3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUsuarioCl3;

	private String passwordCl3;

	private String usuarioCl3;

	public TblUsuariocl3() {
	}

	public int getIdUsuarioCl3() {
		return this.idUsuarioCl3;
	}

	public void setIdUsuarioCl3(int idUsuarioCl3) {
		this.idUsuarioCl3 = idUsuarioCl3;
	}

	public String getPasswordCl3() {
		return this.passwordCl3;
	}

	public void setPasswordCl3(String passwordCl3) {
		this.passwordCl3 = passwordCl3;
	}

	public String getUsuarioCl3() {
		return this.usuarioCl3;
	}

	public void setUsuarioCl3(String usuarioCl3) {
		this.usuarioCl3 = usuarioCl3;
	}

}