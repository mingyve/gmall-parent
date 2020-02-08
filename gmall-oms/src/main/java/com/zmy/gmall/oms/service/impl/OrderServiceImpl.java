package com.zmy.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.oms.entity.Order;
import com.zmy.gmall.oms.mapper.OrderMapper;
import com.zmy.gmall.oms.service.OrderService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
