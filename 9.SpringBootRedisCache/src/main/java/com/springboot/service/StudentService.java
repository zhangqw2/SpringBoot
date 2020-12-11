package com.springboot.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import com.springboot.bean.Student;

/**
 *  缓存服务
 *  CacheConfig 抽取缓存公共配置，可以标注在类上
 * @author 张全伟
 *
 */
@CacheConfig(cacheNames = "student")
public interface StudentService {
	/**
	 * 更新
	 * @CachePut 的作用 主要针对方法配置，能够根据方法的请求参数对其结果进行缓存，和 @Cacheable 不同的是，它每次都会触发真实方法的调用
	 * value： 缓存名称,至少指定一个
	 * key: 缓存key，可以为空，不指定缺省按照方法的左右参数进行组合
	 * condition: 缓存条件,可以为空,结果为true或false,只有true进行缓存
	 * @param student
	 * @return
	 */
	@CachePut(key = "#p0.sno")
	Student update(Student student);

	/**
	 * 删除
	 * @CachEvict 的作用 主要针对方法配置，能够根据一定的条件对缓存进行清空
	 * value： 缓存名称,至少指定一个
	 * key: 缓存key，可以为空，不指定缺省按照方法的左右参数进行组合
	 * condition: 缓存条件,可以为空,结果为true或false,只有true进行缓存
	 * allEntries: 是否清空所有缓存内容，缺省为 false，如果指定为 true，则方法调用后将立即清空所有缓存
	 * beforeInvocation: 是否在方法执行前就清空，缺省为 false，如果指定为 true，则在方法还没有执行的时候就清空缓存，缺省情况下，如果方法执行抛出异常，则不会清空缓存
	 * @param sno
	 */
	@CacheEvict(key = "#p0", allEntries = true)
	void deleteStudentBySno(String sno);

	/**
	 * 查询
	 * @Cacheeable的作用主要针对方法进行配置,根据方法的请求参数对其结果进行缓存
	 * value： 缓存名称,至少指定一个
	 * key: 缓存key，可以为空，不指定缺省按照方法的左右参数进行组合
	 * condition: 缓存条件,可以为空,结果为true或false,只有true进行缓存
	 * @param sno
	 * @return
	 */
	@Cacheable(key = "#p0")
	Student queryStudentBySno(String sno);
}
