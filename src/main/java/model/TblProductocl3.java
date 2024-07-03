package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_productocl3 database table.
 * 
 */
@Entity
@Table(name="tbl_productocl3")
@NamedQuery(name="TblProductocl3.findAll", query="SELECT t FROM TblProductocl3 t")
public class TblProductocl3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProductosCl3;

	private String descripCl3;

	private String estadoCl3;

	private String nombreCl3;

	private double precioCompCl3;

	private double precioVentaCl3;

	public TblProductocl3() {
	}

	public int getIdProductosCl3() {
		return this.idProductosCl3;
	}

	public void setIdProductosCl3(int idProductosCl3) {
		this.idProductosCl3 = idProductosCl3;
	}

	public String getDescripCl3() {
		return this.descripCl3;
	}

	public void setDescripCl3(String descripCl3) {
		this.descripCl3 = descripCl3;
	}

	public String getEstadoCl3() {
		return this.estadoCl3;
	}

	public void setEstadoCl3(String estadoCl3) {
		this.estadoCl3 = estadoCl3;
	}

	public String getNombreCl3() {
		return this.nombreCl3;
	}

	public void setNombreCl3(String nombreCl3) {
		this.nombreCl3 = nombreCl3;
	}

	public double getPrecioCompCl3() {
		return this.precioCompCl3;
	}

	public void setPrecioCompCl3(double precioCompCl3) {
		this.precioCompCl3 = precioCompCl3;
	}

	public double getPrecioVentaCl3() {
		return this.precioVentaCl3;
	}

	public void setPrecioVentaCl3(double precioVentaCl3) {
		this.precioVentaCl3 = precioVentaCl3;
	}

}