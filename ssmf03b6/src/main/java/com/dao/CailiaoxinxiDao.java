package com.dao;

import com.entity.CailiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CailiaoxinxiVO;
import com.entity.view.CailiaoxinxiView;


/**
 * 材料信息
 * 
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
public interface CailiaoxinxiDao extends BaseMapper<CailiaoxinxiEntity> {
	
	List<CailiaoxinxiVO> selectListVO(@Param("ew") Wrapper<CailiaoxinxiEntity> wrapper);
	
	CailiaoxinxiVO selectVO(@Param("ew") Wrapper<CailiaoxinxiEntity> wrapper);
	
	List<CailiaoxinxiView> selectListView(@Param("ew") Wrapper<CailiaoxinxiEntity> wrapper);

	List<CailiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CailiaoxinxiEntity> wrapper);
	
	CailiaoxinxiView selectView(@Param("ew") Wrapper<CailiaoxinxiEntity> wrapper);
	
}
