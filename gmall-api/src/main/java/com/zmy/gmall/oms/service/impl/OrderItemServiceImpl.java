package com.zmy.gmall.oms.service.impl;

import com.zmy.gmall.oms.entity.OrderItem;
import com.zmy.gmall.oms.mapper.OrderItemMapper;
import com.zmy.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author zmy
 * @since 2020-02-06
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
