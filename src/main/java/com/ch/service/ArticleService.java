package com.ch.service;

import com.ch.pojo.entity.Article;
import com.ch.service.base.CrudService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23
 * @description 功能
 */
public interface ArticleService extends CrudService<Article, Long> {
    /**
     * 查询返回列表数据
     * @return
     */
    List<Article> findArticleList();

    //创建分类
    int createArticle(Article art);
    //通过id获取商品分类信息
    Article getArticleById(Integer id);
    //更新商品分类
    int updateCate(Article article);
    //删除art
    int deleteCate(Integer aid);

}
