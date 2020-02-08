package com.zmy.gmall.cms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.cms.mapper.TopicMapper;
import com.zmy.gmall.cms.entity.Topic;
import com.zmy.gmall.cms.service.TopicService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 话题表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class TopicServiceImpl extends ServiceImpl<TopicMapper, Topic> implements TopicService {

}
