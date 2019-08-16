package cn.listenhome.demo.web.facade;

import cn.listenhome.demo.DemoService;
import cn.listenhome.demo.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author xu.you
 * @Title: DemoFacade
 * @Package cn.listenhome.demo.web.facade
 * @Description:
 * @date 2019/3/13 14:29
 */
@Component
public class DemoFacade {

    @Autowired
    private DemoService demoService;


    public List<Demo> list() {
        return demoService.list();
    }
}
