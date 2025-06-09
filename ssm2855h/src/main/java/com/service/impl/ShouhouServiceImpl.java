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


import com.dao.ShouhouDao;
import com.entity.ShouhouEntity;
import com.service.ShouhouService;
import com.entity.vo.ShouhouVO;
import com.entity.view.ShouhouView;

@Service("shouhouService")
public class ShouhouServiceImpl extends ServiceImpl<ShouhouDao, ShouhouEntity> implements ShouhouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouhouEntity> page = this.selectPage(
                new Query<ShouhouEntity>(params).getPage(),
                new EntityWrapper<ShouhouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouhouEntity> wrapper) {
		  Page<ShouhouView> page =new Query<ShouhouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouhouVO> selectListVO(Wrapper<ShouhouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouhouVO selectVO(Wrapper<ShouhouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouhouView> selectListView(Wrapper<ShouhouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouhouView selectView(Wrapper<ShouhouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
