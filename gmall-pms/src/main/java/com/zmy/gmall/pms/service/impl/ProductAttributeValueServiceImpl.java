package com.zmy.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.pms.entity.ProductAttributeValue;
import com.zmy.gmall.pms.mapper.ProductAttributeValueMapper;
import com.zmy.gmall.pms.service.ProductAttributeValueService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 存储产品参数信息的表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
public class ProductAttributeValueServiceImpl extends ServiceImpl<ProductAttributeValueMapper, ProductAttributeValue> implements ProductAttributeValueService {

}
