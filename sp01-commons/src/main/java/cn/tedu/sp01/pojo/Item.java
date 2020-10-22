package cn.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 商品实体类
 *
 */

@Data //lomnok注释，相当于get/set/toString
@NoArgsConstructor //无参构造方法
@AllArgsConstructor //全参构造方法
public class Item {
	//商品id
	private Integer id; 
	//商品名称
	private String name;
	//商品数量
	private Integer number; 
	
	//其他代码通过lombok插件生成
	
	//1111111111111
	//33333333333
}