package com.zmy.gmall.pms.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.pms.entity.Brand;
import com.zmy.gmall.pms.mapper.BrandMapper;
import com.zmy.gmall.pms.service.BrandService;
import com.zmy.gmall.vo.PageInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {
    @Autowired
    BrandMapper brandMapper;

    @Override
    public PageInfoVo beandPageInfo(String keyword, Integer pageNum, Integer pageSize) {
        QueryWrapper queryWrapper = new QueryWrapper();
        if (!StringUtils.isEmpty(keyword)){
            queryWrapper.like("name",keyword);
        }

        IPage<Brand> brandIPage = brandMapper.selectPage(new Page<Brand>(pageNum, pageSize), queryWrapper);
        PageInfoVo pageInfoVo = new PageInfoVo(brandIPage.getTotal(),brandIPage.getPages(),brandIPage.getSize(),brandIPage.getRecords(),brandIPage.getCurrent());
        return pageInfoVo;
    }
}
