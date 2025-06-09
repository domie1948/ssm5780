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


import com.dao.GuanyuwomenDao;
import com.entity.GuanyuwomenEntity;
import com.service.GuanyuwomenService;
import com.entity.vo.GuanyuwomenVO;
import com.entity.view.GuanyuwomenView;

@Service("guanyuwomenService")
public class GuanyuwomenServiceImpl extends ServiceImpl<GuanyuwomenDao, GuanyuwomenEntity> implements GuanyuwomenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuanyuwomenEntity> page = this.selectPage(
                new Query<GuanyuwomenEntity>(params).getPage(),
                new EntityWrapper<GuanyuwomenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuanyuwomenEntity> wrapper) {
		  Page<GuanyuwomenView> page =new Query<GuanyuwomenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuanyuwomenVO> selectListVO(Wrapper<GuanyuwomenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuanyuwomenVO selectVO(Wrapper<GuanyuwomenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuanyuwomenView> selectListView(Wrapper<GuanyuwomenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuanyuwomenView selectView(Wrapper<GuanyuwomenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
