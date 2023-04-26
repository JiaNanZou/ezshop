package com.zjn.ezshop.order.dao;

import com.zjn.ezshop.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zoujianan
 * @email 2544533008@qq.com
 * @date 2023-04-26 12:57:47
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
