package com.he.accountbook_mall.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author BaoZhou
 * @since 2020-05-06
 */
@TableName("book")
public class BookEntity extends Model<BookEntity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private LocalDate time;

    private Integer money;

    private String wx;

    @TableField("Commission")
    private Integer Commission;

    @TableField("Red_envelopes")
    private Integer redEnvelopes;

    private String cash;

    private String delivery;
    private String region;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }
    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }
    public Integer getCommission() {
        return Commission;
    }

    public void setCommission(Integer Commission) {
        this.Commission = Commission;
    }
    public Integer getRedEnvelopes() {
        return redEnvelopes;
    }

    public void setRedEnvelopes(Integer redEnvelopes) {
        this.redEnvelopes = redEnvelopes;
    }
    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
            "id=" + id +
            ", name=" + name +
            ", time=" + time +
            ", money=" + money +
            ", wx=" + wx +
            ", Commission=" + Commission +
            ", redEnvelopes=" + redEnvelopes +
            ", cash=" + cash +
        "}";
    }
}
