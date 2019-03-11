package com.ding.cloud.infragateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class InfraPreZuulFilter extends ZuulFilter {
    /**
     * 过滤器类型:pre,route,post,error
     *
     * @return pre, 路由之前处理
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 多个filter可排序
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 判断,要不要过滤
     *
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器逻辑
     * 获取http request
     *
     * @return
     */
    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        System.out.println(request.getRequestURL().toString());
        return null;
    }
}
