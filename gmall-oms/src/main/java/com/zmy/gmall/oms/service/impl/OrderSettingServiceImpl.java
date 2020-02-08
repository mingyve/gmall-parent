package com.zmy.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.oms.entity.OrderSetting;
import com.zmy.gmall.oms.mapper.OrderSettingMapper;
import com.zmy.gmall.oms.service.OrderSettingService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 订单设置表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OrderSetting> implements OrderSettingService {

}
