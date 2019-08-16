package cn.listenhome.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

/**
 * @author xu.you
 * @Title: Demo
 * @Package cn.listenhome.demo.entity
 * @Description:
 * @date 2019/3/13 14:57
 */
@TableName("com_demo") // 注解指定表名
public class Demo {

    private static final long serialVersionUID = 1L;

    @TableField("createDate")
    private LocalDateTime createDate;

    @TableField("createPartyId")
    private Long createPartyId;

    @TableField("createUserId")
    private Long createUserId;

    @TableField("updateDate")
    private LocalDateTime updateDate;

    @TableField("updatePartyId")
    private Long updatePartyId;

    @TableField("updateUserId")
    private Long updateUserId;

    private Long version;

    private String name;

    private String password;

    private String sex;

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Long getCreatePartyId() {
        return createPartyId;
    }

    public void setCreatePartyId(Long createPartyId) {
        this.createPartyId = createPartyId;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public Long getUpdatePartyId() {
        return updatePartyId;
    }

    public void setUpdatePartyId(Long updatePartyId) {
        this.updatePartyId = updatePartyId;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
