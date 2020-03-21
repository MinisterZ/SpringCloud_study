package com.cuit.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @version JDK  1.8.151
 * @Author: Mirrors
 * @Description: Chengdu City
 */
@Component //加入到容器
public class LoginFilter extends ZuulFilter {

    /**
     * 返回值可取：
     * pre：在请求路由之前执行
     * route：在请求路由时调用
     * post：请求路由之后调用， 也就是在route和errror过滤器之后调用
     * error：处理请求发生错误时调用
     *
     * @return
     */
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String filterType() {
        return "pre";//请求路由前调用
    }

    @Override
    public int filterOrder() {
        return 1;   //int值来定义过滤器的执行顺序，数值越小优先级越高
    }

    @Override
    public boolean shouldFilter() {
        return true; //该过滤器是否执行，true执行，false不执行
    }

    //定义 过滤功能
    @Override
    public Object run() throws ZuulException {
        //如果说请求呆了token值，则表示已经登录过
        //1.获取请求上下文
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        //获取请求参数token的值
        String token = request.getParameter("token");
        if(token == null){
            logger.warn("此操作需要先登录系统。。。");
            context.setSendZuulResponse(false);//拒绝访问
            context.setResponseStatusCode(200);//设置响应状态码

            try {
                //响应结果
                context.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        logger.info("ok");
        return null;
    }
}
