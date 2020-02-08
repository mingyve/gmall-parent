package com.zmy.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.ums.entity.IntegrationConsumeSetting;
import com.zmy.gmall.ums.mapper.IntegrationConsumeSettingMapper;
import com.zmy.gmall.ums.service.IntegrationConsumeSettingService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 积分消费设置 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class IntegrationConsumeSettingServiceImpl extends ServiceImpl<IntegrationConsumeSettingMapper, IntegrationConsumeSetting> implements IntegrationConsumeSettingService {

}
