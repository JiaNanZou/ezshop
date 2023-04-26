package com.zjn.ezshop.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjn.ezshop.member.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zoujianan
 * @email 2544533008@qq.com
 * @date 2023-04-26 12:53:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
