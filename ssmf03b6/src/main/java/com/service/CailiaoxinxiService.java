package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CailiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CailiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CailiaoxinxiView;


/**
 * 材料信息
 *
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
public interface CailiaoxinxiService extends IService<CailiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CailiaoxinxiVO> selectListVO(Wrapper<CailiaoxinxiEntity> wrapper);
   	
   	CailiaoxinxiVO selectVO(@Param("ew") Wrapper<CailiaoxinxiEntity> wrapper);
   	
   	List<CailiaoxinxiView> selectListView(Wrapper<CailiaoxinxiEntity> wrapper);
   	
   	CailiaoxinxiView selectView(@Param("ew") Wrapper<CailiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CailiaoxinxiEntity> wrapper);
   	
}

