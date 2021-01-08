package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L10_Table.s10_choose_point_row;

import java.util.List;

/*
1. table初始化后，应该默认选中第一行
2. 增加数据后，也应该选中新增的这一条
 */


public interface DAO{
    //增加
    public void add(Hero hero);
    //修改
    public void update(Hero hero);
    //删除
    public void delete(int id);
    //获取
    public Hero get(int id);
    //查询
    public List<Hero> list();
    //分页查询
    public List<Hero> list(int start, int count);
}
