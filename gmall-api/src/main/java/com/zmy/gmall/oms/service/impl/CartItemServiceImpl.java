package com.zmy.gmall.oms.service.impl;

import com.zmy.gmall.oms.entity.CartItem;
import com.zmy.gmall.oms.mapper.CartItemMapper;
import com.zmy.gmall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author zmy
 * @since 2020-02-06
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
