package com.zmy.gmall.oms.service.impl;

import com.zmy.gmall.oms.entity.Order;
import com.zmy.gmall.oms.mapper.OrderMapper;
import com.zmy.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author zmy
 * @since 2020-02-06
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
