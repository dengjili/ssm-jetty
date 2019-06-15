import java.io.File;
import java.net.URL;
import java.security.ProtectionDomain;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * web应用启动器
 * 
 * https://blog.csdn.net/d6619309/article/details/52135487
 */
public class Launcher {

    public static final int DEFAULT_PORT = 8080;
    public static final String DEFAULT_CONTEXT_PATH = "/ssm-jetty";
    private static final String DEFAULT_APP_CONTEXT_PATH = "src/main/webapp";

    public static void main(String[] args) {
       Server server = createJettyServer(DEFAULT_PORT, DEFAULT_CONTEXT_PATH);
        try {
            server.start();
            server.join();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
            try {
                server.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static Server createJettyServer(int port, String contextPath) {

        Server server = new Server(port);
        server.setStopAtShutdown(true);

        ProtectionDomain protectionDomain = Launcher.class.getProtectionDomain();
        URL location = protectionDomain.getCodeSource().getLocation();
        String warFile = "C:\\TempData\\ericsson-workspace\\ssm-jetty\\target\\ssm-jetty";

        WebAppContext context = new WebAppContext(warFile, contextPath);
        context.setServer(server);

        String currentDir = new File(location.getPath()).getParent();
        File workDir = new File(currentDir, "work");
        context.setTempDirectory(workDir);

        server.setHandler(context);
        return server;

    }

    public static Server createDevServer(int port, String contextPath) {

        Server server = new Server();
        server.setStopAtShutdown(true);

        ServerConnector connector = new ServerConnector(server);
        // 设置服务端口
        connector.setPort(port);
        connector.setReuseAddress(false);
        server.setConnectors(new Connector[] {connector});

        // 设置web资源根路径以及访问web的根路径
        WebAppContext webAppCtx = new WebAppContext(DEFAULT_APP_CONTEXT_PATH, contextPath);
        webAppCtx.setDescriptor(DEFAULT_APP_CONTEXT_PATH + "/WEB-INF/web.xml");
        webAppCtx.setResourceBase(DEFAULT_APP_CONTEXT_PATH);
        webAppCtx.setClassLoader(Thread.currentThread().getContextClassLoader());
        server.setHandler(webAppCtx);

        return server;
    }

}