package com.song.service.impl;

import com.song.dao.GoodsDao;
import com.song.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/10/19.
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    /**
     *   查询商品表中所有数据
     * @return
     * @throws Exception
     */
    @Override
    public List<Map<String, Object>> queryGoods() throws Exception {
        List<Map<String, Object>> maps = goodsDao.queryGoods();
        return maps;
    }
}
