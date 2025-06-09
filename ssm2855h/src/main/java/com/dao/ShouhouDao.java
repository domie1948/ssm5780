package com.dao;

import com.entity.ShouhouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouhouVO;
import com.entity.view.ShouhouView;


/**
 * 售后
 * 
 * @author 
 * @email 
 * @date 2021-04-02 23:13:39
 */
public interface ShouhouDao extends BaseMapper<ShouhouEntity> {
	
	List<ShouhouVO> selectListVO(@Param("ew") Wrapper<ShouhouEntity> wrapper);
	
	ShouhouVO selectVO(@Param("ew") Wrapper<ShouhouEntity> wrapper);
	
	List<ShouhouView> selectListView(@Param("ew") Wrapper<ShouhouEntity> wrapper);

	List<ShouhouView> selectListView(Pagination page,@Param("ew") Wrapper<ShouhouEntity> wrapper);
	
	ShouhouView selectView(@Param("ew") Wrapper<ShouhouEntity> wrapper);
	
}
