package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L10_Table.s7_TableSelectionModel;


import java.util.List;

/*
通过table可以获取一个 TableSelectionModel，专门用于监听JTable选中项的变化
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
