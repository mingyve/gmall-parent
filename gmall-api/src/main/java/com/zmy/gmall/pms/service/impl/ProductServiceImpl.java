package com.zmy.gmall.pms.service.impl;

import com.zmy.gmall.pms.entity.Product;
import com.zmy.gmall.pms.mapper.ProductMapper;
import com.zmy.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author zmy
 * @since 2020-02-06
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
