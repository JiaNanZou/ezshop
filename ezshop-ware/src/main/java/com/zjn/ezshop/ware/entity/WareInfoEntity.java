package com.zjn.ezshop.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 仓库信息
 * 
 * @author zoujianan
 * @email 2544533008@qq.com
 * @date 2023-04-26 12:49:57
 */
@Data
@TableName("wms_ware_info")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 仓库名
	 */
	private String name;
	/**
	 * 仓库地址
	 */
	private String address;
	/**
	 * 区域编码
	 */
	private String areacode;

}
