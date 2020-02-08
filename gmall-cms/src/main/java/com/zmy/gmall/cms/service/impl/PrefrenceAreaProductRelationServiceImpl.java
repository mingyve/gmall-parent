package com.zmy.gmall.cms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.cms.mapper.PrefrenceAreaProductRelationMapper;
import com.zmy.gmall.cms.entity.PrefrenceAreaProductRelation;
import com.zmy.gmall.cms.service.PrefrenceAreaProductRelationService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 优选专区和产品关系表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class PrefrenceAreaProductRelationServiceImpl extends ServiceImpl<PrefrenceAreaProductRelationMapper, PrefrenceAreaProductRelation> implements PrefrenceAreaProductRelationService {

}
