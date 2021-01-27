package dto;

public class ProductDTO {
	private String pno;
	private String pname;
	private int price;
	private int ea;
	private String maker;
	public ProductDTO(String pno, String pname, int price, int ea, String maker) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.price = price;
		this.ea = ea;
		this.maker = maker;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	@Override
	public String toString() {
		return "ProductDTO [pno=" + pno + ", pname=" + pname + ", price=" + price + ", ea=" + ea + ", maker=" + maker
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ea;
		result = prime * result + ((maker == null) ? 0 : maker.hashCode());
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		result = prime * result + ((pno == null) ? 0 : pno.hashCode());
		result = prime * result + price;
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
		ProductDTO other = (ProductDTO) obj;
		if (ea != other.ea)
			return false;
		if (maker == null) {
			if (other.maker != null)
				return false;
		} else if (!maker.equals(other.maker))
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		if (pno == null) {
			if (other.pno != null)
				return false;
		} else if (!pno.equals(other.pno))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	
}
