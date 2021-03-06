package cn.etrip.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.etrip.entity.Role;
import cn.etrip.mapper.RoleMapper;
import cn.etrip.service.RoleService;

/**
 * @author lijie
 * @email  lijie@6mi.com
 * @time   2016年11月7日 上午10:45:39
 */
@Service
@Scope("prototype")
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public Role selectRoleById(Integer id) {
		return roleMapper.selectRoleById(id);
	}
	@Override
	public List<Role> selectByResourceURI(String uri) {
		return roleMapper.selectByResourceURI(uri);
	}

}
