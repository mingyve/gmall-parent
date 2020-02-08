package com.zmy.gmall.cms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.cms.mapper.PrefrenceAreaMapper;
import com.zmy.gmall.cms.entity.PrefrenceArea;
import com.zmy.gmall.cms.service.PrefrenceAreaService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 优选专区 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class PrefrenceAreaServiceImpl extends ServiceImpl<PrefrenceAreaMapper, PrefrenceArea> implements PrefrenceAreaService {

}
