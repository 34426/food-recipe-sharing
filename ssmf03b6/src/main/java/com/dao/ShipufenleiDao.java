package com.dao;

import com.entity.ShipufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShipufenleiVO;
import com.entity.view.ShipufenleiView;


/**
 * 食谱分类
 * 
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
public interface ShipufenleiDao extends BaseMapper<ShipufenleiEntity> {
	
	List<ShipufenleiVO> selectListVO(@Param("ew") Wrapper<ShipufenleiEntity> wrapper);
	
	ShipufenleiVO selectVO(@Param("ew") Wrapper<ShipufenleiEntity> wrapper);
	
	List<ShipufenleiView> selectListView(@Param("ew") Wrapper<ShipufenleiEntity> wrapper);

	List<ShipufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShipufenleiEntity> wrapper);
	
	ShipufenleiView selectView(@Param("ew") Wrapper<ShipufenleiEntity> wrapper);
	
}
