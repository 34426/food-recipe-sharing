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


import com.dao.YizhoushipujiankanganpaiDao;
import com.entity.YizhoushipujiankanganpaiEntity;
import com.service.YizhoushipujiankanganpaiService;
import com.entity.vo.YizhoushipujiankanganpaiVO;
import com.entity.view.YizhoushipujiankanganpaiView;

@Service("yizhoushipujiankanganpaiService")
public class YizhoushipujiankanganpaiServiceImpl extends ServiceImpl<YizhoushipujiankanganpaiDao, YizhoushipujiankanganpaiEntity> implements YizhoushipujiankanganpaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YizhoushipujiankanganpaiEntity> page = this.selectPage(
                new Query<YizhoushipujiankanganpaiEntity>(params).getPage(),
                new EntityWrapper<YizhoushipujiankanganpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YizhoushipujiankanganpaiEntity> wrapper) {
		  Page<YizhoushipujiankanganpaiView> page =new Query<YizhoushipujiankanganpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YizhoushipujiankanganpaiVO> selectListVO(Wrapper<YizhoushipujiankanganpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YizhoushipujiankanganpaiVO selectVO(Wrapper<YizhoushipujiankanganpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YizhoushipujiankanganpaiView> selectListView(Wrapper<YizhoushipujiankanganpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YizhoushipujiankanganpaiView selectView(Wrapper<YizhoushipujiankanganpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
