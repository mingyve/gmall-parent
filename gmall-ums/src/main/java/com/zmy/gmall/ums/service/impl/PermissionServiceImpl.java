package com.zmy.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.ums.entity.Permission;
import com.zmy.gmall.ums.mapper.PermissionMapper;
import com.zmy.gmall.ums.service.PermissionService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 后台用户权限表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
