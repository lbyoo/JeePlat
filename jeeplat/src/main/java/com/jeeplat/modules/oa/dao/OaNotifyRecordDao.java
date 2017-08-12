package com.jeeplat.modules.oa.dao;

import java.util.List;

import com.jeeplat.common.persistence.CrudDao;
import com.jeeplat.common.persistence.annotation.MyBatisDao;
import com.jeeplat.modules.oa.entity.OaNotifyRecord;

/**
 * 通知通告记录DAO接口
 */
@MyBatisDao
public interface OaNotifyRecordDao extends CrudDao<OaNotifyRecord> {

	/**
	 * 插入通知记录
	 * @param oaNotifyRecordList
	 * @return
	 */
	public int insertAll(List<OaNotifyRecord> oaNotifyRecordList);
	
	/**
	 * 根据通知ID删除通知记录
	 * @param oaNotifyId 通知ID
	 * @return
	 */
	public int deleteByOaNotifyId(String oaNotifyId);
	
}