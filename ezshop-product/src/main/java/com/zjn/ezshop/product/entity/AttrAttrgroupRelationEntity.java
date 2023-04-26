package com.zjn.ezshop.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 属性&属性分组关联
 * 
 * @author zoujianan
 * @email 2544533008@qq.com
 * @date 2023-04-26 13:08:52
 */
@Data
@TableName("pms_attr_attrgroup_relation")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttrAttrgroupRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 属性id
	 */
	private Long attrId;
	/**
	 * 属性分组id
	 */
	private Long attrGroupId;
	/**
	 * 属性组内排序
	 */
	private Integer attrSort;

}
