package cn.listenhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title: ListenhomeWebAdminApplication
 * @Package cn.listenhome
 * @Description:
 * @author xu.you
 * @date 2019/3/13 12:00
 */
@SpringBootApplication
public class ListenhomeWebAdminApplication {

    public static void main(String[] args) {

        SpringApplication.run(ListenhomeWebAdminApplication.class, args);
        System.err.println("=======================启动完成===========================");
    }

}
