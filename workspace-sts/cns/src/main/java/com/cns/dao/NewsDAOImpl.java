
package com.cns.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cns.dto.NewsVO;

import lombok.Setter;

@Repository
public class NewsDAOImpl implements NewsDAO {

	@Setter(onMethod_ = @Autowired)
	private SqlSession sqlSession;

	private static final String Namespace = "com.example.mapper.newsMapper";

	@Override
	public List<NewsVO> selectNews() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(Namespace + ".selectNews");
	}
	

}
