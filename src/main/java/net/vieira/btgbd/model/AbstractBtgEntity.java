package net.vieira.btgbd.model;

import java.io.Serializable;

public abstract class AbstractBtgEntity implements Serializable {
	
	private static final long serialVersionUID = -4898973229403856119L;

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


}
