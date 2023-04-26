package com.zjn.ezshop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.common.utils.PageUtils;
import com.zjn.ezshop.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author zoujianan
 * @email 2544533008@qq.com
 * @date 2023-04-26 12:53:28
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

