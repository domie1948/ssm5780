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


import com.dao.JubaotousuDao;
import com.entity.JubaotousuEntity;
import com.service.JubaotousuService;
import com.entity.vo.JubaotousuVO;
import com.entity.view.JubaotousuView;

@Service("jubaotousuService")
public class JubaotousuServiceImpl extends ServiceImpl<JubaotousuDao, JubaotousuEntity> implements JubaotousuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JubaotousuEntity> page = this.selectPage(
                new Query<JubaotousuEntity>(params).getPage(),
                new EntityWrapper<JubaotousuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JubaotousuEntity> wrapper) {
		  Page<JubaotousuView> page =new Query<JubaotousuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JubaotousuVO> selectListVO(Wrapper<JubaotousuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JubaotousuVO selectVO(Wrapper<JubaotousuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JubaotousuView> selectListView(Wrapper<JubaotousuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JubaotousuView selectView(Wrapper<JubaotousuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
