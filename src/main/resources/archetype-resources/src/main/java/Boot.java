package ${package};

import ${package}.dao.Dao;
public class Boot {

    public static void main(String[] args) throws Exception {
        Dao dao = new Dao();
        System.out.println(dao.sayHi());
    }

}