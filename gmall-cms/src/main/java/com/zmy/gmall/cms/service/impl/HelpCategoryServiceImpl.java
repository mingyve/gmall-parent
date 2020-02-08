package com.zmy.gmall.cms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.cms.mapper.HelpCategoryMapper;
import com.zmy.gmall.cms.entity.HelpCategory;
import com.zmy.gmall.cms.service.HelpCategoryService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 帮助分类表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class HelpCategoryServiceImpl extends ServiceImpl<HelpCategoryMapper, HelpCategory> implements HelpCategoryService {

}
