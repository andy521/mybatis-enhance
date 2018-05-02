/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2018 恒宇少年
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.gitee.hengboy.mybatis.enhance.mapper.select;

import com.gitee.hengboy.mybatis.enhance.common.annotation.ProviderMapper;
import com.gitee.hengboy.mybatis.enhance.exception.EnhanceFrameworkException;
import com.gitee.hengboy.mybatis.enhance.provider.select.OrmSelectOneProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import java.io.Serializable;

/**
 * 查询单个对象的Mapper
 * @author：于起宇
 * ===============================
 * Created with IDEA.
 * Date：2018/4/8
 * Time：下午11:35
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@ProviderMapper
public interface SelectOneMapper<T, Id extends Serializable> {

    /**
     * 根据主键值查询对象详情
     *
     * @param id 主键值
     * @return T类型的对象实例
     * @throws EnhanceFrameworkException 增强框架异常
     */
    @SelectProvider(type = OrmSelectOneProvider.class, method = "empty")
    T selectOne(@Param("id") Id id) throws EnhanceFrameworkException;
}
