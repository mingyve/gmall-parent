package com.zmy.gmall.cms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.cms.mapper.SubjectProductRelationMapper;
import com.zmy.gmall.cms.entity.SubjectProductRelation;
import com.zmy.gmall.cms.service.SubjectProductRelationService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 专题商品关系表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class SubjectProductRelationServiceImpl extends ServiceImpl<SubjectProductRelationMapper, SubjectProductRelation> implements SubjectProductRelationService {

}
