package com.zmy.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.pms.entity.CommentReplay;
import com.zmy.gmall.pms.mapper.CommentReplayMapper;
import com.zmy.gmall.pms.service.CommentReplayService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 产品评价回复表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayMapper, CommentReplay> implements CommentReplayService {

}
