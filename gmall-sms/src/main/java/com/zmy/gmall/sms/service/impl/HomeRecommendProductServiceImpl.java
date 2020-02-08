package com.zmy.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.sms.entity.HomeRecommendProduct;
import com.zmy.gmall.sms.mapper.HomeRecommendProductMapper;
import com.zmy.gmall.sms.service.HomeRecommendProductService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 人气推荐商品表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class HomeRecommendProductServiceImpl extends ServiceImpl<HomeRecommendProductMapper, HomeRecommendProduct> implements HomeRecommendProductService {

}
