package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipuxinxiView;


/**
 * 食谱信息
 *
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
public interface ShipuxinxiService extends IService<ShipuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipuxinxiVO> selectListVO(Wrapper<ShipuxinxiEntity> wrapper);
   	
   	ShipuxinxiVO selectVO(@Param("ew") Wrapper<ShipuxinxiEntity> wrapper);
   	
   	List<ShipuxinxiView> selectListView(Wrapper<ShipuxinxiEntity> wrapper);
   	
   	ShipuxinxiView selectView(@Param("ew") Wrapper<ShipuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipuxinxiEntity> wrapper);
   	
}

