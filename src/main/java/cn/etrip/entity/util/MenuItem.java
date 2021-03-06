package cn.etrip.entity.util;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import cn.etrip.entity.Menu;


/**
 * @author lijie
 * @email  lijie@6mi.com
 * @time   2016年11月8日 上午9:58:20
 */
public class MenuItem {

	private String id;// 0：根节点，否则是子节点
	private String pid;// 菜单项的父亲节点
	private String url;// 菜单的URL地址
	private String target = "rightFrame";// 打开的目标
	private String name;// 菜单名称
	private boolean open = false;// 是否展开
	private boolean checked;// true:勾选
	private List<MenuItem> children;// 子节点
	private MenuType type = MenuType.module;// module：模块 ,page：页面 ,button：功能
	private String icon;// 节点图标
	
	/**
	 *	指定菜单的功能类型
	 * @param menu
	 */
	public void setMenuType(Menu menu) {
		if(menu!=null && StringUtils.isNotEmpty(menu.getType())){
			if(menu.getType().equals("module")){
				this.setType(MenuType.module);
			}else if(menu.getType().equals("page")){
				this.setType(MenuType.page);
			}else if(menu.getType().equals("button")){
				this.setType(MenuType.button);
			}
//			//为z-tree自定义图标
//            SystemSetting systemSetting = SystemManager.getInstance().getSystemSetting();
//            if(this.getType().equals(MenuType.page)){
//				this.setIcon(systemSetting.getManageLeftTreeLeafIcon());
//			}else if(this.getType().equals(MenuType.button)){
//				this.setIcon(systemSetting.getManageLeftTreeLeafIcon());
//			}
		}
	}

	/**
	 * 判断是否是非按钮的功能
	 * 
	 * @return
	 */
	public boolean isButton() {
		if (this.type != null && this.type.equals(MenuType.button)) {
			return true;
		}
		return false;
	}

	public boolean isRootMenu() {
		return "0".equals(pid);
	}

	public void addClild(MenuItem item) {
		if(children == null){
			children = new ArrayList<MenuItem>();
		}
		children.add(item);
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<MenuItem> getChildren() {
		return children;
	}

	public void setChildren(List<MenuItem> children) {
		this.children = children;
	}

	public MenuItem(String name, List<MenuItem> children) {
		super();
		this.name = name;
		this.children = children;
	}

	public MenuItem() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public MenuType getType() {
		return type;
	}

	public void setType(MenuType type) {
		this.type = type;
	}
}
