package cn.listenhome.demo.web.controller;

import cn.listenhome.demo.entity.Demo;
import cn.listenhome.demo.web.facade.DemoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Title: DemoController
 * @Package cn.listenhome.demo.web.controller
 * @Description:
 * @author xu.you
 * @date 2019/3/13 12:00
 */
@RestController
public class DemoController {

    @Autowired
    private DemoFacade demoFacade;

    @RequestMapping("/")
    public List<Demo> findList() {
        List<Demo> list = demoFacade.list();
        return list;
    }

}
