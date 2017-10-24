package ar.edu.unlam.tallerweb1.modelo;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Pedido")
	private Long id;	
	private String solicitante;
	private String direccion;
	private Integer telefono;
//	private Date fecha;
	private Integer cantidad;
	private Boolean estado;	
	private List<Pizza> listaPizza = new LinkedList<Pizza>();
	
			

	public Pedido() {
		super();

	}

	@ManyToMany(cascade = CascadeType.ALL) 
	@JoinTable(name = "pedidos_pizzas", joinColumns = { @JoinColumn(name = "id_Pedido") }, inverseJoinColumns = { @JoinColumn(name = "id_Pizza") })
	public List<Pizza> getListaPizza() {
		return listaPizza;
	}

	public void setListaPizza(List<Pizza> listaPizza) {
		this.listaPizza = listaPizza;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	
	public Boolean getEstado() {
		return estado;
	}

	

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	
//	public Date getFecha() {
//		return fecha;
//	}
//
//	public void setFecha(Date fecha) {
//		this.fecha = fecha;
//	}

	
	
	
}
