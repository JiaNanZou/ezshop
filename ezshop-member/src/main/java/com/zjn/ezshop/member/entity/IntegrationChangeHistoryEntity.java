package com.zjn.ezshop.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 积分变化历史记录
 * 
 * @author zoujianan
 * @email 2544533008@qq.com
 * @date 2023-04-26 12:53:28
 */
@Data
@TableName("ums_integration_change_history")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IntegrationChangeHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * 变化的值
	 */
	private Integer changeCount;
	/**
	 * 备注
	 */
	private String note;
	/**
	 * 来源[0->购物；1->管理员修改;2->活动]
	 */
	private Integer sourceTyoe;

}
