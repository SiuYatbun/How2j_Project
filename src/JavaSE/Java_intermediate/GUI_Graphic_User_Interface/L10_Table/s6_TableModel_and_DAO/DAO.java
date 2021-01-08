package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L10_Table.s6_TableModel_and_DAO;


import java.util.List;

/*
通过TableModel与DAO结合显示数据库中Hero信息。
DAO使用HeroDAO
在TableModel中，使用从DAO返回的List作为TableModel的数据

只需要修改HeroTableModel，无需修改TestGUI。 这正好演绎了Model设计思想中的数据分离的好处，
当只需要数据发生变化的时候，修改Model即可，界面GUI部分，不需要做任何改动
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
