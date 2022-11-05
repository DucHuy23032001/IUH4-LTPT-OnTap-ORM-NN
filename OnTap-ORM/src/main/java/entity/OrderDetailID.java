package entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class OrderDetailID implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3566730697896503458L;
	private int order;
	private int product;
	
	public OrderDetailID() {
		super();
	}
	public OrderDetailID(int order, int product) {
		super();
		this.order = order;
		this.product = product;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + order;
		result = prime * result + product;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDetailID other = (OrderDetailID) obj;
		return order == other.order && product == other.product;
	}

	
	
}
