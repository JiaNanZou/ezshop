package com.zjn.ezshop.product.dao;

import com.zjn.ezshop.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author zoujianan
 * @email 2544533008@qq.com
 * @date 2023-04-26 03:49:08
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
