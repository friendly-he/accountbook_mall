package com.he.accountbook_mall.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author BaoZhou
 * @since 2020-05-06
 */
@TableName("total")
public class TotalEntity extends Model<TotalEntity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer dataSum;

    private Integer product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getDataSum() {
        return dataSum;
    }

    public void setDataSum(Integer dataSum) {
        this.dataSum = dataSum;
    }
    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TotalEntity{" +
            "id=" + id +
            ", dataSum=" + dataSum +
            ", product=" + product +
        "}";
    }
}
