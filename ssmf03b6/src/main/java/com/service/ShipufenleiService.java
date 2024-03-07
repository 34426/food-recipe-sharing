package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShipufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipufenleiView;


/**
 * 食谱分类
 *
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
public interface ShipufenleiService extends IService<ShipufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShipufenleiVO> selectListVO(Wrapper<ShipufenleiEntity> wrapper);
   	
   	ShipufenleiVO selectVO(@Param("ew") Wrapper<ShipufenleiEntity> wrapper);
   	
   	List<ShipufenleiView> selectListView(Wrapper<ShipufenleiEntity> wrapper);
   	
   	ShipufenleiView selectView(@Param("ew") Wrapper<ShipufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShipufenleiEntity> wrapper);
   	
}

