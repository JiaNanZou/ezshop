package com.zjn.ezshop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.common.utils.PageUtils;
import com.zjn.ezshop.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author zoujianan
 * @email 2544533008@qq.com
 * @date 2023-04-26 12:49:57
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

