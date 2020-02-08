package com.zmy.gmall.cms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.cms.mapper.TopicCommentMapper;
import com.zmy.gmall.cms.entity.TopicComment;
import com.zmy.gmall.cms.service.TopicCommentService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 专题评论表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class TopicCommentServiceImpl extends ServiceImpl<TopicCommentMapper, TopicComment> implements TopicCommentService {

}
