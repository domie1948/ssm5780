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


import com.dao.XinwenleibieDao;
import com.entity.XinwenleibieEntity;
import com.service.XinwenleibieService;
import com.entity.vo.XinwenleibieVO;
import com.entity.view.XinwenleibieView;

@Service("xinwenleibieService")
public class XinwenleibieServiceImpl extends ServiceImpl<XinwenleibieDao, XinwenleibieEntity> implements XinwenleibieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwenleibieEntity> page = this.selectPage(
                new Query<XinwenleibieEntity>(params).getPage(),
                new EntityWrapper<XinwenleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwenleibieEntity> wrapper) {
		  Page<XinwenleibieView> page =new Query<XinwenleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinwenleibieVO> selectListVO(Wrapper<XinwenleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinwenleibieVO selectVO(Wrapper<XinwenleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinwenleibieView> selectListView(Wrapper<XinwenleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwenleibieView selectView(Wrapper<XinwenleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
