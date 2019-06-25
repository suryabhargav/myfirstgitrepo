package comm.examplemodel;

import java.io.Serializable;

public class Customer implements Serializable{
	
	private String cname;
	private String cadd;
	private String citem;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	/**
	 * @return the cadd
	 */
	public String getCadd() {
		return cadd;
	}
	/**
	 * @param cadd the cadd to set
	 */
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	/**
	 * @return the citem
	 */
	public String getCitem() {
		return citem;
	}
	/**
	 * @param citem the citem to set
	 */
	public void setCitem(String citem) {
		this.citem = citem;
	}
	
	
	

}
