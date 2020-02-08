package com.zmy.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.pms.entity.Comment;
import com.zmy.gmall.pms.mapper.CommentMapper;
import com.zmy.gmall.pms.service.CommentService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
