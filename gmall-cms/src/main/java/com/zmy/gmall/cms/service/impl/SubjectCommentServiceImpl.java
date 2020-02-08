package com.zmy.gmall.cms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.cms.mapper.SubjectCommentMapper;
import com.zmy.gmall.cms.entity.SubjectComment;
import com.zmy.gmall.cms.service.SubjectCommentService;
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
public class SubjectCommentServiceImpl extends ServiceImpl<SubjectCommentMapper, SubjectComment> implements SubjectCommentService {

}
