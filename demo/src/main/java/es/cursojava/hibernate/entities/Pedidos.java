package es.cursojava.Hibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PEDIDO")
public class Pedidos {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)

private Long id;
private String descripcion;
private String fechaPedido;
private double totalPedido;

@ManyToOne
@JoinColumn(name = "Cliente_Id", nullable = false)
private Cliente cliente ;

@JoinColumn(name = )

public Pedidos() {

}

    public Pedidos(String descripcion, String fechaPedido, double totalPedido) {
        this.descripcion = descripcion;
        this.fechaPedido = fechaPedido;
        this.totalPedido = totalPedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }


    


}
