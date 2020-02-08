package com.zmy.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.oms.entity.OrderReturnReason;
import com.zmy.gmall.oms.mapper.OrderReturnReasonMapper;
import com.zmy.gmall.oms.service.OrderReturnReasonService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 退货原因表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonMapper, OrderReturnReason> implements OrderReturnReasonService {

}
