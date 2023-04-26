package com.zjn.ezshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.common.utils.PageUtils;
import com.zjn.ezshop.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author zoujianan
 * @email 2544533008@qq.com
 * @date 2023-04-26 03:49:08
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
