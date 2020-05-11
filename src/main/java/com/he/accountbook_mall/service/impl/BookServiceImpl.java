package com.he.accountbook_mall.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.he.accountbook_mall.domain.BookEntity;
import com.he.accountbook_mall.mapper.BookDao;
import com.he.accountbook_mall.service.IBookService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author BaoZhou
 * @since 2020-05-06
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, BookEntity> implements IBookService {

}
