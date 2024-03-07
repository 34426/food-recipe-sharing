package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YizhoushipujiankanganpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YizhoushipujiankanganpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YizhoushipujiankanganpaiView;


/**
 * 一周食谱健康安排
 *
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
public interface YizhoushipujiankanganpaiService extends IService<YizhoushipujiankanganpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YizhoushipujiankanganpaiVO> selectListVO(Wrapper<YizhoushipujiankanganpaiEntity> wrapper);
   	
   	YizhoushipujiankanganpaiVO selectVO(@Param("ew") Wrapper<YizhoushipujiankanganpaiEntity> wrapper);
   	
   	List<YizhoushipujiankanganpaiView> selectListView(Wrapper<YizhoushipujiankanganpaiEntity> wrapper);
   	
   	YizhoushipujiankanganpaiView selectView(@Param("ew") Wrapper<YizhoushipujiankanganpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YizhoushipujiankanganpaiEntity> wrapper);
   	
}

