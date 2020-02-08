package com.zmy.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.sms.entity.FlashPromotionSession;
import com.zmy.gmall.sms.mapper.FlashPromotionSessionMapper;
import com.zmy.gmall.sms.service.FlashPromotionSessionService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 限时购场次表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class FlashPromotionSessionServiceImpl extends ServiceImpl<FlashPromotionSessionMapper, FlashPromotionSession> implements FlashPromotionSessionService {

}
