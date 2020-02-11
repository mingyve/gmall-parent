package com.zmy.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.ums.entity.Member;
import com.zmy.gmall.ums.mapper.MemberMapper;
import com.zmy.gmall.ums.service.MemberService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
