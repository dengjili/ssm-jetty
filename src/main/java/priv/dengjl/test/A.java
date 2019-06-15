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

import java.util.List;

/**
 * <p>Title: A</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年6月14日 上午1:06:00
 */
public class A {
	private List<B> test;
	
	public void setTest(List<B> test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "A [test=" + test + "]";
	}
}
