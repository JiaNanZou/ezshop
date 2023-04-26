package com.zjn.ezshop.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 优惠券分类关联
 * 
 * @author zoujianan
 * @email 2544533008@qq.com
 * @date 2023-04-26 12:43:49
 */
@Data
@TableName("sms_coupon_spu_category_relation")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CouponSpuCategoryRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 优惠券id
	 */
	private Long couponId;
	/**
	 * 产品分类id
	 */
	private Long categoryId;
	/**
	 * 产品分类名称
	 */
	private String categoryName;

}
