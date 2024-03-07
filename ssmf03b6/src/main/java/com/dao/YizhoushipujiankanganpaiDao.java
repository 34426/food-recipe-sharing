package com.dao;

import com.entity.YizhoushipujiankanganpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YizhoushipujiankanganpaiVO;
import com.entity.view.YizhoushipujiankanganpaiView;


/**
 * 一周食谱健康安排
 * 
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
public interface YizhoushipujiankanganpaiDao extends BaseMapper<YizhoushipujiankanganpaiEntity> {
	
	List<YizhoushipujiankanganpaiVO> selectListVO(@Param("ew") Wrapper<YizhoushipujiankanganpaiEntity> wrapper);
	
	YizhoushipujiankanganpaiVO selectVO(@Param("ew") Wrapper<YizhoushipujiankanganpaiEntity> wrapper);
	
	List<YizhoushipujiankanganpaiView> selectListView(@Param("ew") Wrapper<YizhoushipujiankanganpaiEntity> wrapper);

	List<YizhoushipujiankanganpaiView> selectListView(Pagination page,@Param("ew") Wrapper<YizhoushipujiankanganpaiEntity> wrapper);
	
	YizhoushipujiankanganpaiView selectView(@Param("ew") Wrapper<YizhoushipujiankanganpaiEntity> wrapper);
	
}
