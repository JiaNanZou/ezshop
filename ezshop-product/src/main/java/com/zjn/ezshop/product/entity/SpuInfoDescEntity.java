package com.zjn.ezshop.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * spu信息介绍
 * 
 * @author zoujianan
 * @email 2544533008@qq.com
 * @date 2023-04-26 13:08:51
 */
@Data
@TableName("pms_spu_info_desc")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpuInfoDescEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	@TableId
	private Long spuId;
	/**
	 * 商品介绍
	 */
	private String decript;

}
