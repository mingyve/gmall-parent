package com.zmy.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.oms.entity.OrderReturnApply;
import com.zmy.gmall.oms.mapper.OrderReturnApplyMapper;
import com.zmy.gmall.oms.service.OrderReturnApplyService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 订单退货申请 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyMapper, OrderReturnApply> implements OrderReturnApplyService {

}
