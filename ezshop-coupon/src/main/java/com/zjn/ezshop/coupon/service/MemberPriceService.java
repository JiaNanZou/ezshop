package com.zjn.ezshop.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.common.utils.PageUtils;
import com.zjn.ezshop.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author zoujianan
 * @email 2544533008@qq.com
 * @date 2023-04-26 12:43:49
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

