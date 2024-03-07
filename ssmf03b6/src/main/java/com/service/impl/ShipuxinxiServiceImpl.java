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


import com.dao.ShipuxinxiDao;
import com.entity.ShipuxinxiEntity;
import com.service.ShipuxinxiService;
import com.entity.vo.ShipuxinxiVO;
import com.entity.view.ShipuxinxiView;

@Service("shipuxinxiService")
public class ShipuxinxiServiceImpl extends ServiceImpl<ShipuxinxiDao, ShipuxinxiEntity> implements ShipuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShipuxinxiEntity> page = this.selectPage(
                new Query<ShipuxinxiEntity>(params).getPage(),
                new EntityWrapper<ShipuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShipuxinxiEntity> wrapper) {
		  Page<ShipuxinxiView> page =new Query<ShipuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShipuxinxiVO> selectListVO(Wrapper<ShipuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShipuxinxiVO selectVO(Wrapper<ShipuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShipuxinxiView> selectListView(Wrapper<ShipuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShipuxinxiView selectView(Wrapper<ShipuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
