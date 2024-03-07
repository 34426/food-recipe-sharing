package com.dao;

import com.entity.ShipuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipuxinxiVO;
import com.entity.view.ShipuxinxiView;


/**
 * 食谱信息
 * 
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
public interface ShipuxinxiDao extends BaseMapper<ShipuxinxiEntity> {
	
	List<ShipuxinxiVO> selectListVO(@Param("ew") Wrapper<ShipuxinxiEntity> wrapper);
	
	ShipuxinxiVO selectVO(@Param("ew") Wrapper<ShipuxinxiEntity> wrapper);
	
	List<ShipuxinxiView> selectListView(@Param("ew") Wrapper<ShipuxinxiEntity> wrapper);

	List<ShipuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShipuxinxiEntity> wrapper);
	
	ShipuxinxiView selectView(@Param("ew") Wrapper<ShipuxinxiEntity> wrapper);
	
}
