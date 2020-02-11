package com.zmy.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.ums.entity.MemberRuleSetting;
import com.zmy.gmall.ums.mapper.MemberRuleSettingMapper;
import com.zmy.gmall.ums.service.MemberRuleSettingService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 会员积分成长规则表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
public class MemberRuleSettingServiceImpl extends ServiceImpl<MemberRuleSettingMapper, MemberRuleSetting> implements MemberRuleSettingService {

}
