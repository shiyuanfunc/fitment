package com.song.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/10/19.
 */
public interface GoodsDao {

    //查询Goods 数据

    List<Map<String,Object>> queryGoods() throws Exception;
}
