package com.zmy.gmall.cms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.cms.mapper.SubjectCategoryMapper;
import com.zmy.gmall.cms.entity.SubjectCategory;
import com.zmy.gmall.cms.service.SubjectCategoryService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 专题分类表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class SubjectCategoryServiceImpl extends ServiceImpl<SubjectCategoryMapper, SubjectCategory> implements SubjectCategoryService {

}
