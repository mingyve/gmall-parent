package com.zmy.gmall.cms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.cms.mapper.TopicCategoryMapper;
import com.zmy.gmall.cms.entity.TopicCategory;
import com.zmy.gmall.cms.service.TopicCategoryService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 话题分类表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class TopicCategoryServiceImpl extends ServiceImpl<TopicCategoryMapper, TopicCategory> implements TopicCategoryService {

}
