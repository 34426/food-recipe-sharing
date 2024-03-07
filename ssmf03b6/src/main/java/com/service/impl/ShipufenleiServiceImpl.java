package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShipufenleiDao;
import com.entity.ShipufenleiEntity;
import com.service.ShipufenleiService;
import com.entity.vo.ShipufenleiVO;
import com.entity.view.ShipufenleiView;

@Service("shipufenleiService")
public class ShipufenleiServiceImpl extends ServiceImpl<ShipufenleiDao, ShipufenleiEntity> implements ShipufenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipufenleiEntity> page = this.selectPage(
                new Query<ShipufenleiEntity>(params).getPage(),
                new EntityWrapper<ShipufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipufenleiEntity> wrapper) {
		  Page<ShipufenleiView> page =new Query<ShipufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipufenleiVO> selectListVO(Wrapper<ShipufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipufenleiVO selectVO(Wrapper<ShipufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipufenleiView> selectListView(Wrapper<ShipufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipufenleiView selectView(Wrapper<ShipufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
