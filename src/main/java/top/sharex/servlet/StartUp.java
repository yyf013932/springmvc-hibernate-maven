package top.sharex.servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import top.sharex.util.ApplicationContextHelper;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;


/**
 * Created by Daniel on 2017/2/28.
 * 自启动的任务类
 */
public class StartUp extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        //加载Spring上下文Helper
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        ApplicationContextHelper.setApplicationContext(ctx);

//        AppParameters.print();
        System.out.println("server started");
    }
}
