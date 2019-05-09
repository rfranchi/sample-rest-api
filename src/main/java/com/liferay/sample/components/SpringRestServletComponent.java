package com.liferay.sample.components;

import com.liferay.sample.config.SampleRestConfig;
import org.osgi.service.component.annotations.Component;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@Component(
        immediate = true,
        property = {
                "osgi.http.whiteboard.context.path=/",
                "osgi.http.whiteboard.servlet.pattern=/service/api/*"
        },
        service = javax.servlet.Servlet.class
)
public class SpringRestServletComponent extends org.springframework.web.servlet.DispatcherServlet {

    @Override
    public String getContextConfigLocation() {
        return SampleRestConfig.class.getName();
    }

    @Override
    public Class<?> getContextClass() {
        return AnnotationConfigWebApplicationContext.class;
    }

}
