package com.zmy.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.oms.entity.OrderOperateHistory;
import com.zmy.gmall.oms.mapper.OrderOperateHistoryMapper;
import com.zmy.gmall.oms.service.OrderOperateHistoryService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 订单操作历史记录 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryMapper, OrderOperateHistory> implements OrderOperateHistoryService {

}
