/**
 * 
 */
package cn.etrip.service;

import java.util.List;

import cn.etrip.entity.Role;


/**
 * @author lijie
 * @email  lijie@6mi.com
 * @time   2016年11月7日 上午10:44:35
 */
public interface RoleService {
	Role selectRoleById(Integer id);
	List<Role> selectByResourceURI(String uri);
}
