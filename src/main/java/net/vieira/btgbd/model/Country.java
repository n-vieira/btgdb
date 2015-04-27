package net.vieira.btgbd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country extends AbstractBtgEntity {

	private static final long serialVersionUID = 7337039456967792197L;

	@Column(name="country")
	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
