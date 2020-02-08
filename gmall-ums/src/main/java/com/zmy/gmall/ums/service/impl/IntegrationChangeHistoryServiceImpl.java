package com.zmy.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.ums.entity.IntegrationChangeHistory;
import com.zmy.gmall.ums.mapper.IntegrationChangeHistoryMapper;
import com.zmy.gmall.ums.service.IntegrationChangeHistoryService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 积分变化历史记录表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class IntegrationChangeHistoryServiceImpl extends ServiceImpl<IntegrationChangeHistoryMapper, IntegrationChangeHistory> implements IntegrationChangeHistoryService {

}
