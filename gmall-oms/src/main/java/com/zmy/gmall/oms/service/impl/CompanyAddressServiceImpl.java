package com.zmy.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.oms.entity.CompanyAddress;
import com.zmy.gmall.oms.mapper.CompanyAddressMapper;
import com.zmy.gmall.oms.service.CompanyAddressService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 公司收发货地址表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class CompanyAddressServiceImpl extends ServiceImpl<CompanyAddressMapper, CompanyAddress> implements CompanyAddressService {

}
