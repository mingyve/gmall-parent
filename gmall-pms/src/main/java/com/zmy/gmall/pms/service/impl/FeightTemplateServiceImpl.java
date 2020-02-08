package com.zmy.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.pms.entity.FeightTemplate;
import com.zmy.gmall.pms.mapper.FeightTemplateMapper;
import com.zmy.gmall.pms.service.FeightTemplateService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 运费模版 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class FeightTemplateServiceImpl extends ServiceImpl<FeightTemplateMapper, FeightTemplate> implements FeightTemplateService {

}
