package com.zmy.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.sms.entity.CouponProductCategoryRelation;
import com.zmy.gmall.sms.mapper.CouponProductCategoryRelationMapper;
import com.zmy.gmall.sms.service.CouponProductCategoryRelationService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 优惠券和产品分类关系表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class CouponProductCategoryRelationServiceImpl extends ServiceImpl<CouponProductCategoryRelationMapper, CouponProductCategoryRelation> implements CouponProductCategoryRelationService {

}
