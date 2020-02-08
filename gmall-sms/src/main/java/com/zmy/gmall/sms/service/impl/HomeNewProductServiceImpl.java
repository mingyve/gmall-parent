package com.zmy.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.sms.entity.HomeNewProduct;
import com.zmy.gmall.sms.mapper.HomeNewProductMapper;
import com.zmy.gmall.sms.service.HomeNewProductService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 新鲜好物表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class HomeNewProductServiceImpl extends ServiceImpl<HomeNewProductMapper, HomeNewProduct> implements HomeNewProductService {

}
