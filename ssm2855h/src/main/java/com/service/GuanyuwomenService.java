package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuanyuwomenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuanyuwomenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuanyuwomenView;


/**
 * 关于我们
 *
 * @author 
 * @email 
 * @date 2021-04-02 23:13:39
 */
public interface GuanyuwomenService extends IService<GuanyuwomenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanyuwomenVO> selectListVO(Wrapper<GuanyuwomenEntity> wrapper);
   	
   	GuanyuwomenVO selectVO(@Param("ew") Wrapper<GuanyuwomenEntity> wrapper);
   	
   	List<GuanyuwomenView> selectListView(Wrapper<GuanyuwomenEntity> wrapper);
   	
   	GuanyuwomenView selectView(@Param("ew") Wrapper<GuanyuwomenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanyuwomenEntity> wrapper);
   	
}

