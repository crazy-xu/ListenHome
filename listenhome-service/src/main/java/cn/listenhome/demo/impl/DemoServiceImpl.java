package cn.listenhome.demo.impl;

import cn.listenhome.demo.DemoService;
import cn.listenhome.demo.entity.Demo;
import cn.listenhome.demo.mapper.DemoMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xu.you
 * @Title: DemoServiceImpl
 * @Package cn.listenhome.demo.impl
 * @Description:
 * @date 2019/3/13 14:34
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements DemoService {

    @Autowired
    private DemoMapper demoMapper;


}
