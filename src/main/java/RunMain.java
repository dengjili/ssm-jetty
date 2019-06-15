import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import priv.dengjl.test.A;
import priv.dengjl.test.B;

/**
 * <p>Title: RunMain.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年6月13日
 * @version 1.0
 */

/**
 * start web应用启动器
 */
public class RunMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		/**
		B bean2 = ctx.getBean(B.class);
		System.out.println(bean2);
		A bean = ctx.getBean(A.class);
		System.out.println(bean);
*/
	}

}
