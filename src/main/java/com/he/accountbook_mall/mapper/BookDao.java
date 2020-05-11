package com.he.accountbook_mall.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.he.accountbook_mall.domain.BookEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author BaoZhou
 * @since 2020-05-06
 */
@Mapper
public interface BookDao extends BaseMapper<BookEntity> {

}
