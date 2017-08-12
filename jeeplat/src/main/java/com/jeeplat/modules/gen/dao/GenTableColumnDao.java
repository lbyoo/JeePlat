package com.jeeplat.modules.gen.dao;

import com.jeeplat.common.persistence.CrudDao;
import com.jeeplat.common.persistence.annotation.MyBatisDao;
import com.jeeplat.modules.gen.entity.GenTableColumn;

/**
 * 业务表字段DAO接口
 */
@MyBatisDao
public interface GenTableColumnDao extends CrudDao<GenTableColumn> {
	
	public void deleteByGenTableId(String genTableId);
}
