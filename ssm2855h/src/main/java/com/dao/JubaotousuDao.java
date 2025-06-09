package com.dao;

import com.entity.JubaotousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JubaotousuVO;
import com.entity.view.JubaotousuView;


/**
 * 举报投诉
 * 
 * @author 
 * @email 
 * @date 2021-04-02 23:13:39
 */
public interface JubaotousuDao extends BaseMapper<JubaotousuEntity> {
	
	List<JubaotousuVO> selectListVO(@Param("ew") Wrapper<JubaotousuEntity> wrapper);
	
	JubaotousuVO selectVO(@Param("ew") Wrapper<JubaotousuEntity> wrapper);
	
	List<JubaotousuView> selectListView(@Param("ew") Wrapper<JubaotousuEntity> wrapper);

	List<JubaotousuView> selectListView(Pagination page,@Param("ew") Wrapper<JubaotousuEntity> wrapper);
	
	JubaotousuView selectView(@Param("ew") Wrapper<JubaotousuEntity> wrapper);
	
}
