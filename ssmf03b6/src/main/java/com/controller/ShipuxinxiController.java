package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShipuxinxiEntity;
import com.entity.view.ShipuxinxiView;

import com.service.ShipuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 食谱信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-02 11:34:49
 */
@RestController
@RequestMapping("/shipuxinxi")
public class ShipuxinxiController {
    @Autowired
    private ShipuxinxiService shipuxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShipuxinxiEntity shipuxinxi, HttpServletRequest request){

        EntityWrapper<ShipuxinxiEntity> ew = new EntityWrapper<ShipuxinxiEntity>();
		PageUtils page = shipuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipuxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShipuxinxiEntity shipuxinxi, HttpServletRequest request){
        EntityWrapper<ShipuxinxiEntity> ew = new EntityWrapper<ShipuxinxiEntity>();
		PageUtils page = shipuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShipuxinxiEntity shipuxinxi){
       	EntityWrapper<ShipuxinxiEntity> ew = new EntityWrapper<ShipuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shipuxinxi, "shipuxinxi")); 
        return R.ok().put("data", shipuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShipuxinxiEntity shipuxinxi){
        EntityWrapper< ShipuxinxiEntity> ew = new EntityWrapper< ShipuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shipuxinxi, "shipuxinxi")); 
		ShipuxinxiView shipuxinxiView =  shipuxinxiService.selectView(ew);
		return R.ok("查询食谱信息成功").put("data", shipuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShipuxinxiEntity shipuxinxi = shipuxinxiService.selectById(id);
		shipuxinxi.setClicknum(shipuxinxi.getClicknum()+1);
		shipuxinxi.setClicktime(new Date());
		shipuxinxiService.updateById(shipuxinxi);
        return R.ok().put("data", shipuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShipuxinxiEntity shipuxinxi = shipuxinxiService.selectById(id);
		shipuxinxi.setClicknum(shipuxinxi.getClicknum()+1);
		shipuxinxi.setClicktime(new Date());
		shipuxinxiService.updateById(shipuxinxi);
        return R.ok().put("data", shipuxinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        ShipuxinxiEntity shipuxinxi = shipuxinxiService.selectById(id);
        if(type.equals("1")) {
        	shipuxinxi.setThumbsupnum(shipuxinxi.getThumbsupnum()+1);
        } else {
        	shipuxinxi.setCrazilynum(shipuxinxi.getCrazilynum()+1);
        }
        shipuxinxiService.updateById(shipuxinxi);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShipuxinxiEntity shipuxinxi, HttpServletRequest request){
    	shipuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shipuxinxi);

        shipuxinxiService.insert(shipuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShipuxinxiEntity shipuxinxi, HttpServletRequest request){
    	shipuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shipuxinxi);

        shipuxinxiService.insert(shipuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShipuxinxiEntity shipuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shipuxinxi);
        shipuxinxiService.updateById(shipuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shipuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShipuxinxiEntity> wrapper = new EntityWrapper<ShipuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shipuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ShipuxinxiEntity shipuxinxi, HttpServletRequest request,String pre){
        EntityWrapper<ShipuxinxiEntity> ew = new EntityWrapper<ShipuxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = shipuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shipuxinxi), params), params));
        return R.ok().put("data", page);
    }


}
