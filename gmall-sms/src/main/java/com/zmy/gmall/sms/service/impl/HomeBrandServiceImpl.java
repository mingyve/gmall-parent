package com.zmy.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.sms.entity.HomeBrand;
import com.zmy.gmall.sms.mapper.HomeBrandMapper;
import com.zmy.gmall.sms.service.HomeBrandService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 首页推荐品牌表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class HomeBrandServiceImpl extends ServiceImpl<HomeBrandMapper, HomeBrand> implements HomeBrandService {

}
