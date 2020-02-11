package com.zmy.gmall.pms.service;

import com.zmy.gmall.pms.entity.Brand;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zmy.gmall.vo.PageInfoVo;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
public interface BrandService extends IService<Brand> {

    PageInfoVo beandPageInfo(String keyword, Integer pageNum, Integer pageSize);
}
