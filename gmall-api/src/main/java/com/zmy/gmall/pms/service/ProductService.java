package com.zmy.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zmy.gmall.pms.entity.Product;
import com.zmy.gmall.pms.vo.PmsProductQueryParam;
import com.zmy.gmall.vo.PageInfoVo;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
public interface ProductService extends IService<Product> {

    PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam);
}
