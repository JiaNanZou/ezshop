package com.zjn.ezshop.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.common.utils.PageUtils;
import com.zjn.ezshop.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author zoujianan
 * @email 2544533008@qq.com
 * @date 2023-04-26 12:43:49
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

