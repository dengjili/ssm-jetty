/**
 * <p>Title: A.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年6月14日
 * @version 1.0
 */
package priv.dengjl.test;

/**
 * <p>Title: A</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年6月14日 上午1:06:00
 */
public class B {

	private String name;
	
	public B(A a) {
		System.out.println(a);
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "B [name=" + name + "]";
	}
	
	
}
