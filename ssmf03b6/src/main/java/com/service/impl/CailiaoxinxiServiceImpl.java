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


import com.dao.CailiaoxinxiDao;
import com.entity.CailiaoxinxiEntity;
import com.service.CailiaoxinxiService;
import com.entity.vo.CailiaoxinxiVO;
import com.entity.view.CailiaoxinxiView;

@Service("cailiaoxinxiService")
public class CailiaoxinxiServiceImpl extends ServiceImpl<CailiaoxinxiDao, CailiaoxinxiEntity> implements CailiaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CailiaoxinxiEntity> page = this.selectPage(
                new Query<CailiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<CailiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CailiaoxinxiEntity> wrapper) {
		  Page<CailiaoxinxiView> page =new Query<CailiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CailiaoxinxiVO> selectListVO(Wrapper<CailiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CailiaoxinxiVO selectVO(Wrapper<CailiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CailiaoxinxiView> selectListView(Wrapper<CailiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CailiaoxinxiView selectView(Wrapper<CailiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
