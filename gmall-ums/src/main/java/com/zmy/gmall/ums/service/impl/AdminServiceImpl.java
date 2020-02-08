package com.zmy.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.ums.entity.Admin;
import com.zmy.gmall.ums.mapper.AdminMapper;
import com.zmy.gmall.ums.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin login(String username, String password) {
        String s = DigestUtils.md5DigestAsHex(password.getBytes());
        QueryWrapper<Admin> eq = new QueryWrapper<Admin>().eq("username", username).eq("password", s);
        Admin admin = adminMapper.selectOne(eq);
        return admin;
    }

    @Override
    public Admin getUserInfo(String userName) {
        QueryWrapper<Admin> eq = new QueryWrapper<Admin>().eq("username", userName);
        Admin admin = adminMapper.selectOne(eq);
        return admin;

    }
}
