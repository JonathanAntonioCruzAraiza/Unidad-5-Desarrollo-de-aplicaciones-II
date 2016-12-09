package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  @Table(name="condoms")
public class Condom {
	@Id @GeneratedValue
	private Long id;
	@Column(length =20)
	private String color;
	@Column(length =20)
	private String flavor;
	@Column(length =20)
	private String brand;
	@Column(length =20)
	private int size;
	
	
	public Condom(String color, String flavor, String brand, int size) {
		super();
		this.color = color;
		this.flavor = flavor;
		this.brand = brand;
		this.size = size;
	}
	
	
	public Condom() {
		this("","","",0);
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}


	@Override
	public String toString() {
		return "Condom [id=" + id + ", color=" + color + ", flavor=" + flavor + ", brand=" + brand + ", size=" + size
				+ "]";
	}
	

	

}
