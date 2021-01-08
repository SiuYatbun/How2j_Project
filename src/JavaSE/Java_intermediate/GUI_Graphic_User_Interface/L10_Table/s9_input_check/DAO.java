package JavaSE.Java_intermediate.GUI_Graphic_User_Interface.L10_Table.s9_input_check;


import java.util.List;

/*
如果用户输入的名称为空，或者血量不是小数，在提交数据的时候都会报错。
“感觉上” 界面就卡住了。 这是不友好的人机交互行为。
所以需要加上输入项的验证，如果输入的数据不合格，应该弹出对话框提示用户具体原因。
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
