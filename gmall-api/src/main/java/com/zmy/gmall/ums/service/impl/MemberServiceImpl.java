package com.zmy.gmall.ums.service.impl;

import com.zmy.gmall.ums.entity.Member;
import com.zmy.gmall.ums.mapper.MemberMapper;
import com.zmy.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author zmy
 * @since 2020-02-06
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
