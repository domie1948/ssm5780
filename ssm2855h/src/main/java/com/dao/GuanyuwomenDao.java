package com.dao;

import com.entity.GuanyuwomenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuanyuwomenVO;
import com.entity.view.GuanyuwomenView;


/**
 * 关于我们
 * 
 * @author 
 * @email 
 * @date 2021-04-02 23:13:39
 */
public interface GuanyuwomenDao extends BaseMapper<GuanyuwomenEntity> {
	
	List<GuanyuwomenVO> selectListVO(@Param("ew") Wrapper<GuanyuwomenEntity> wrapper);
	
	GuanyuwomenVO selectVO(@Param("ew") Wrapper<GuanyuwomenEntity> wrapper);
	
	List<GuanyuwomenView> selectListView(@Param("ew") Wrapper<GuanyuwomenEntity> wrapper);

	List<GuanyuwomenView> selectListView(Pagination page,@Param("ew") Wrapper<GuanyuwomenEntity> wrapper);
	
	GuanyuwomenView selectView(@Param("ew") Wrapper<GuanyuwomenEntity> wrapper);
	
}
