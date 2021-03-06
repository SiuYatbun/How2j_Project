package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L10_Table.s8_update_table;


import java.util.List;

/*
以新增数据到数据库中，然后更新Table为例
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
