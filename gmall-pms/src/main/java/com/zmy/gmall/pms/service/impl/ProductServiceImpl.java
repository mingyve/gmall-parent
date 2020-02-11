package com.zmy.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.pms.entity.Product;
import com.zmy.gmall.pms.mapper.ProductMapper;
import com.zmy.gmall.pms.service.ProductService;
import com.zmy.gmall.pms.vo.PmsProductQueryParam;
import com.zmy.gmall.vo.PageInfoVo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Log4j2
@Component
@Service(version = "1.0")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam) {
        log.info(productQueryParam);
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        if(!StringUtils.isEmpty(productQueryParam.getKeyword())){
            queryWrapper.like("keywords",productQueryParam.getKeyword());
        }
        if(!StringUtils.isEmpty(productQueryParam.getProductSn())){
            queryWrapper.like("product_sn",productQueryParam.getProductSn());
        }
        if(!StringUtils.isEmpty(productQueryParam.getPublishStatus())){
            queryWrapper.eq("publish_status",productQueryParam.getPublishStatus());
        }
        if(!StringUtils.isEmpty(productQueryParam.getVerifyStatus())){
            queryWrapper.eq("verify_status",productQueryParam.getVerifyStatus());
        }
        if(!StringUtils.isEmpty(productQueryParam.getBrandId())){
            queryWrapper.eq("brand_id",productQueryParam.getBrandId());
        }

        IPage<Product> productIPage = productMapper.selectPage(new Page<Product>(productQueryParam.getPageNum(), productQueryParam.getPageSize()), queryWrapper);
        PageInfoVo pageInfoVo = new PageInfoVo(productIPage.getTotal(),productIPage.getPages(),productIPage.getSize(),productIPage.getRecords(),productIPage.getCurrent());
        return pageInfoVo;
    }
}
