package JavaSE.Java_intermediate.JDBC_Java_Database_Connectivity.L10_DAO_Data_Access_Object.s2_Interface_DAO;


import java.util.List;

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
