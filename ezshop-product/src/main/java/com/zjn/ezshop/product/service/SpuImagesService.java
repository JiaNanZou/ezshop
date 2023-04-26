package com.zjn.ezshop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjn.common.utils.PageUtils;
import com.zjn.ezshop.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author zoujianan
 * @email 2544533008@qq.com
 * @date 2023-04-26 03:49:08
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

