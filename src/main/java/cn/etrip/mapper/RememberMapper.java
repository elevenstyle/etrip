/**
 * 
 */
package cn.etrip.mapper;

import cn.etrip.entity.Remember;

/**
 * @author lijie
 * @email  lijie@6mi.com
 * @time   2016年11月7日 下午3:15:56
 */
public interface RememberMapper {
	int insert(Remember e);
	int updateById(Remember e);
	Remember selectById(String seriesId);
	int deleteByEmail(String email);
}
